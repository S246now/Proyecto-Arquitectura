/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.prj.compra.eis;

import com.prj.compra.domain.Solicitud;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Desk
 */
@Local
public interface SolicitudDao {

    void create(Solicitud solicitud);

    void edit(Solicitud solicitud);

    void remove(Solicitud solicitud);

    Solicitud find(Object id);

    List<Solicitud> findAll();

    List<Solicitud> findRange(int[] range);

    int count();
    
}
