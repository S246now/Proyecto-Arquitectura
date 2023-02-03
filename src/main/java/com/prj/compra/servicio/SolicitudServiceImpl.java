package com.prj.compra.servicio;

import java.util.List;
import javax.ejb.*;
import javax.inject.Inject;
import com.prj.compra.domain.Solicitud;
import com.prj.compra.eis.SolicitudDao;

@Stateless
public class SolicitudServiceImpl implements SolicitudService {
	
	@Inject
	private SolicitudDao solicitudDao;

        @Override
	public List<Solicitud> listarSolicitudes() {
		return solicitudDao.findAll();
	}

        @Override
	public Solicitud encontrarSolicitudPorId(Solicitud solicitud) {
		return solicitudDao.find(solicitud);
	}

        @Override
	public void registrarSolicitud(Solicitud solicitud) {
		solicitudDao.create(solicitud);
	}

        @Override
	public void modificarSolicitud(Solicitud solicitud) {
		solicitudDao.edit(solicitud);
	}

        @Override
	public void eliminarSolicitud(Solicitud solicitud) {
		solicitudDao.remove(solicitud);
	}
}