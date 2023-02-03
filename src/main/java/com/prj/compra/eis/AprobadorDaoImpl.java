/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.prj.compra.eis;

import com.prj.compra.domain.Aprobador;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Desk
 */
@Stateless
public class AprobadorDaoImpl extends AbstractFacade<Aprobador> implements AprobadorDao {

    @PersistenceContext(unitName = "myPersona")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public AprobadorDaoImpl() {
        super(Aprobador.class);
    }
    
}
