/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package forme;

import domain.Patient;
import domain.Report;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JSpinner;
import javax.swing.SpinnerDateModel;
import communication.Communication;
import model.ReportsViewTableModel;
import operations.Operation;
import transfer.ClientRequest;
import transfer.ServerResponse;

/**
 *
 * @author USER
 */
public class ReportsView extends javax.swing.JDialog {
        
        //trazimo izvestaje pacijenta za ovog doktora
        ReportsViewTableModel model;
        Patient p;

        public ReportsView(java.awt.Dialog parent, boolean modal,Patient p) {
           
        super(parent,modal);
        initComponents();
        this.setTitle("Pretraga izveštaja");
        this.setBackground(Color.DARK_GRAY);
        this.p=p;

        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        // Postavljanje veličine dijaloga na veličinu ekrana
        this.setSize(screenSize);        
        //MODEL 
        
        SpinnerDateModel dateModel = new SpinnerDateModel();
        //POSTAVLJANJE MODELA NA KOMPOENTU
        dateSpinner.setModel(dateModel);
        //POSTAVLJANJE FORMATA NA KOMPONENTU
        JSpinner.DateEditor dateEditor = new JSpinner.DateEditor(dateSpinner, "dd.MM.yyyy");
        dateSpinner.setEditor(dateEditor); 

        //STAVLJANJE KRAJNJEG DATUMA
        dateModel.setEnd(new Date()); // Maksimalni datum (danas)
        
        model=new ReportsViewTableModel(new ArrayList<>());
        jTableReports.setModel(model);
    }
        

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButtonDetails = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableReports = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        dateSpinner = new javax.swing.JSpinner();

        jButton1.setText("DETALJI");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jButtonDetails.setBackground(new java.awt.Color(204, 204, 255));
        jButtonDetails.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jButtonDetails.setText("DETALJI IZVEŠTAJA");
        jButtonDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDetailsActionPerformed(evt);
            }
        });

        jTableReports.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTableReports.setRowHeight(70);
        jTableReports.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.setViewportView(jTableReports);

        jButton2.setBackground(new java.awt.Color(204, 204, 255));
        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton2.setText("PRETRAŽI");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("DATUM OD:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(449, 449, 449)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(276, 276, 276)
                        .addComponent(jLabel2)
                        .addGap(81, 81, 81)
                        .addComponent(dateSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1032, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(jButtonDetails)))
                .addContainerGap(69, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(dateSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 542, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(197, 197, 197)
                        .addComponent(jButtonDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButtonDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDetailsActionPerformed
         int selected = jTableReports.getSelectedRow();

        if (selected == -1) {
        JOptionPane.showMessageDialog(this, "Molimo vas da selektujete izvestaj iz tabele.", "Upozorenje", JOptionPane.WARNING_MESSAGE);
        }   

   else {      
//da dobijes izvestaja detalje   
        Report r=model.getReport(selected);
        r.setPatient(p);
         ReportViewForm rvf=new ReportViewForm(this, true, r);
         rvf.setVisible(true);
       
    }
            
        
        
        
       // ReportForm rf=new ReportForm(this,true,p);
        //rf.setVisible(true);

    }//GEN-LAST:event_jButtonDetailsActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        try{Report report=new Report();
        report.setPatient(p);
        report.setPatientsAdmitionDate(getDate());
        
        ClientRequest kz=new ClientRequest(Operation.PRONADJI_IZVESTAJE, report);

        Communication.getInstance().posaljiZahtev(kz);
        ServerResponse so=Communication.getInstance().primiOdgovor();
        List <Report>list=(List <Report>) so.getOdgovor();
        if(list.isEmpty()){
        JOptionPane.showMessageDialog(this, "Sistem ne može da nađe izveštaj po zadatim kriterijumima.", "NEMA IZVEŠTAJA", JOptionPane.INFORMATION_MESSAGE);
        return;
        }
        
     JOptionPane.showMessageDialog(this, "Sistem je našao izveštaje po zadatim kriterijumima.", "NEMA IZVEŠTAJA", JOptionPane.INFORMATION_MESSAGE);

     model.setReportList(list);} catch (Exception ex) {
         //"Sistem ne može da učita izveštaj"
    JOptionPane.showMessageDialog(this, "Veza sa serverom je prekinuta!Molimo prijavite se ponovo!", "Greška", JOptionPane.ERROR_MESSAGE);
    System.exit(0); 
}
        //da vrati so.getodgovor list report pa da se tbl popuni
    }//GEN-LAST:event_jButton2ActionPerformed

     public LocalDate getDate(){
     java.util.Date givenDate = (java.util.Date) dateSpinner.getValue();
     java.sql.Date sqlDate = new java.sql.Date(givenDate.getTime());
     LocalDate localDate = sqlDate.toLocalDate(); 
     return localDate;
 }
    
    
    
   
    /**
     * @param args the command line arguments
     */
 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JSpinner dateSpinner;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButtonDetails;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableReports;
    // End of variables declaration//GEN-END:variables
}
