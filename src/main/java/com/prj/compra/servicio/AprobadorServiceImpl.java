package com.prj.compra.servicio;

import java.util.List;
import javax.ejb.*;
import javax.inject.Inject;
import com.prj.compra.domain.Aprobador;
import com.prj.compra.eis.AprobadorDao;

@Stateless
public class AprobadorServiceImpl implements AprobadorService {
	
	@Inject
	private AprobadorDao aprobadorDao;

        @Override
	public List<Aprobador> listarAprobadores() {
		return aprobadorDao.findAll();
	}

        @Override
	public Aprobador encontrarAprobadorPorId(Aprobador aprobador) {
		return aprobadorDao.find(aprobador);
	}

        @Override
	public void registrarAprobador(Aprobador aprobador) {
		aprobadorDao.create(aprobador);
	}

        @Override
	public void modificarAprobador(Aprobador aprobador) {
		aprobadorDao.edit(aprobador);
	}

        @Override
	public void eliminarAprobador(Aprobador aprobador) {
		aprobadorDao.remove(aprobador);
	}
}