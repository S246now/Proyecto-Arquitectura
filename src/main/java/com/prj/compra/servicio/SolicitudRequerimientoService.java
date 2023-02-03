package com.prj.compra.servicio;

import java.util.List;
import javax.ejb.Local;
import com.prj.compra.domain.SolicitudRequerimiento;

@Local
public interface SolicitudRequerimientoService {

    public List<SolicitudRequerimiento> listarSolicitudRequerimientos();

    public SolicitudRequerimiento encontrarSolicitudRequerimientoPorId(SolicitudRequerimiento solicitudRequerimiento);

    public void registrarSolicitudRequerimiento(SolicitudRequerimiento solicitudRequerimiento);

    public void modificarSolicitudRequerimiento(SolicitudRequerimiento solicitudRequerimiento);

    public void eliminarSolicitudRequerimiento(SolicitudRequerimiento solicitudRequerimiento);
}