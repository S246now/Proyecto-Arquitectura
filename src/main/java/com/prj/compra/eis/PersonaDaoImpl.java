/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.prj.compra.eis;

import com.prj.compra.domain.Persona;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Desk
 */
@Stateless
public class PersonaDaoImpl extends AbstractFacade<Persona> implements PersonaDao {

    @PersistenceContext(unitName = "myPersona")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public PersonaDaoImpl() {
        super(Persona.class);
    }
    
}
