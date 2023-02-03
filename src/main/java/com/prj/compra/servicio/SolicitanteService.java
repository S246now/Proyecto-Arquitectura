package com.prj.compra.servicio;

import java.util.List;
import javax.ejb.Local;
import com.prj.compra.domain.Solicitante;

@Local
public interface SolicitanteService {

    public List<Solicitante> listarSolicitantes();

    public Solicitante encontrarSolicitantePorId(Solicitante solicitante);

    public void registrarSolicitante(Solicitante solicitante);

    public void modificarSolicitante(Solicitante solicitante);

    public void eliminarSolicitante(Solicitante solicitante);
}