package com.prj.compra.servicio;

import java.util.List;
import javax.ejb.Local;
import com.prj.compra.domain.Solicitud;

@Local
public interface SolicitudService {

    public List<Solicitud> listarSolicitudes();

    public Solicitud encontrarSolicitudPorId(Solicitud solicitud);

    public void registrarSolicitud(Solicitud solicitud);

    public void modificarSolicitud(Solicitud solicitud);

    public void eliminarSolicitud(Solicitud solicitud);
}