package com.prj.compra.servicio;

import java.util.List;
import javax.ejb.*;
import javax.inject.Inject;
import com.prj.compra.domain.Requerimiento;
import com.prj.compra.eis.RequerimientoDao;

@Stateless
public class RequerimientoServiceImpl implements RequerimientoService {
	
	@Inject
	private RequerimientoDao requerimientoDao;

        @Override
	public List<Requerimiento> listarRequerimientos() {
		return requerimientoDao.findAll();
	}

        @Override
	public Requerimiento encontrarRequerimientoPorId(Requerimiento requerimiento) {
		return requerimientoDao.find(requerimiento);
	}

        @Override
	public void registrarRequerimiento(Requerimiento requerimiento) {
		requerimientoDao.create(requerimiento);
	}

        @Override
	public void modificarRequerimiento(Requerimiento requerimiento) {
		requerimientoDao.edit(requerimiento);
	}

        @Override
	public void eliminarRequerimiento(Requerimiento requerimiento) {
		requerimientoDao.remove(requerimiento);
	}
}