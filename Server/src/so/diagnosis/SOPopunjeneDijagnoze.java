/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package so.diagnosis;

import dbb.DBBrokerGenerics;
import domain.AbstractDO;
import java.util.List;
import so.AbstractSO;

/**
 *
 * @author USER
 */
public class SOPopunjeneDijagnoze extends AbstractSO{
    
    public int loaded;

    public int getNum() {
        return loaded;
    }
   

    @Override
    protected void doOperation(AbstractDO ado) throws Exception {
    loaded=DBBrokerGenerics.getInstance().isDataLoaded(ado);    }
    
}

