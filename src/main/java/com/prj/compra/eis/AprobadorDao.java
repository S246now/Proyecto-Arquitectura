/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.prj.compra.eis;

import com.prj.compra.domain.Aprobador;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Desk
 */
@Local
public interface AprobadorDao {

    void create(Aprobador aprobador);

    void edit(Aprobador aprobador);

    void remove(Aprobador aprobador);

    Aprobador find(Object id);

    List<Aprobador> findAll();

    List<Aprobador> findRange(int[] range);

    int count();
    
}
