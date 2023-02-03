/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.prj.compra.eis;

import com.prj.compra.domain.SolicitudRequerimiento;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Desk
 */
@Local
public interface SolicitudRequerimientoDao {

    void create(SolicitudRequerimiento solicitudRequerimiento);

    void edit(SolicitudRequerimiento solicitudRequerimiento);

    void remove(SolicitudRequerimiento solicitudRequerimiento);

    SolicitudRequerimiento find(Object id);

    List<SolicitudRequerimiento> findAll();

    List<SolicitudRequerimiento> findRange(int[] range);

    int count();
    
}
