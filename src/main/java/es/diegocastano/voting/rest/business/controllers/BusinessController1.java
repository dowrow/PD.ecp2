package es.diegocastano.voting.rest.business.controllers;

import es.diegocastano.voting.rest.business.views.TransferObject1;
import es.diegocastano.voting.rest.data.models.daos.DaoFactory;

public class BusinessController1 {

    public TransferObject1 m1() {
        //DaoFactory.getFactory().getEntity1Dao().findAll();
        return new TransferObject1();
    }

    /*public void m2(TransferObject2 transferObject2) {
       //DaoFactory.getFactory().getEntity2Dao().read(1);
    }*/

}
