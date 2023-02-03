/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.prj.compra.eis;

import com.prj.compra.domain.Solicitante;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Desk
 */
@Local
public interface SolicitanteDao {

    void create(Solicitante solicitante);

    void edit(Solicitante solicitante);

    void remove(Solicitante solicitante);

    Solicitante find(Object id);

    List<Solicitante> findAll();

    List<Solicitante> findRange(int[] range);

    int count();
    
}
