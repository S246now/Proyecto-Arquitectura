package com.prj.compra.servicio;

import java.util.List;
import javax.ejb.Local;
import com.prj.compra.domain.Requerimiento;

@Local
public interface RequerimientoService {

    public List<Requerimiento> listarRequerimientos();

    public Requerimiento encontrarRequerimientoPorId(Requerimiento requerimiento);

    public void registrarRequerimiento(Requerimiento requerimiento);

    public void modificarRequerimiento(Requerimiento requerimiento);

    public void eliminarRequerimiento(Requerimiento requerimiento);
}