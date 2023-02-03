package com.prj.compra.servicio;

import java.util.List;
import javax.ejb.*;
import javax.inject.Inject;
import com.prj.compra.domain.SolicitudRequerimiento;
import com.prj.compra.eis.SolicitudRequerimientoDao;

@Stateless
public class SolicitudRequerimientoServiceImpl implements SolicitudRequerimientoService {
	
	@Inject
	private SolicitudRequerimientoDao solicitudRequerimientoDao;

        @Override
	public List<SolicitudRequerimiento> listarSolicitudRequerimientos() {
		return solicitudRequerimientoDao.findAll();
	}

        @Override
	public SolicitudRequerimiento encontrarSolicitudRequerimientoPorId(SolicitudRequerimiento solicitudRequerimiento) {
		return solicitudRequerimientoDao.find(solicitudRequerimiento);
	}

        @Override
	public void registrarSolicitudRequerimiento(SolicitudRequerimiento solicitudRequerimiento) {
		solicitudRequerimientoDao.create(solicitudRequerimiento);
	}

        @Override
	public void modificarSolicitudRequerimiento(SolicitudRequerimiento solicitudRequerimiento) {
		solicitudRequerimientoDao.edit(solicitudRequerimiento);
	}

        @Override
	public void eliminarSolicitudRequerimiento(SolicitudRequerimiento solicitudRequerimiento) {
		solicitudRequerimientoDao.remove(solicitudRequerimiento);
	}
}