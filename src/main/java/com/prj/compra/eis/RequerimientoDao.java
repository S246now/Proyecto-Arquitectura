/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.prj.compra.eis;

import com.prj.compra.domain.Requerimiento;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Desk
 */
@Local
public interface RequerimientoDao {

    void create(Requerimiento requerimiento);

    void edit(Requerimiento requerimiento);

    void remove(Requerimiento requerimiento);

    Requerimiento find(Object id);

    List<Requerimiento> findAll();

    List<Requerimiento> findRange(int[] range);

    int count();
    
}
