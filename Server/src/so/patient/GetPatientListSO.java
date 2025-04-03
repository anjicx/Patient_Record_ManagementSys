/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package so.patient;

import dbb.DBBrokerGenerics;
import domain.AbstractDO;
import java.util.List;
import so.AbstractSO;

/**
 *
 * @author USER
 */
public class GetPatientListSO  extends AbstractSO{
    private List<AbstractDO> lista;

    public List<AbstractDO> getLista() {
        return lista;
    }

    @Override
    protected void doOperation(AbstractDO ado) throws Exception {
        lista =   DBBrokerGenerics.getInstance().getListByConditionWithJoin(ado);
    }


    
}

