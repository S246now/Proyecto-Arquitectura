package com.prj.compra.servicio;

import java.util.List;
import javax.ejb.*;
import javax.inject.Inject;
import com.prj.compra.domain.Solicitante;
import com.prj.compra.eis.SolicitanteDao;

@Stateless
public class SolicitanteServiceImpl implements SolicitanteService {
	
	@Inject
	private SolicitanteDao solicitanteDao;

        @Override
	public List<Solicitante> listarSolicitantes() {
		return solicitanteDao.findAll();
	}

        @Override
	public Solicitante encontrarSolicitantePorId(Solicitante solicitante) {
		return solicitanteDao.find(solicitante);
	}

        @Override
	public void registrarSolicitante(Solicitante solicitante) {
		solicitanteDao.create(solicitante);
	}

        @Override
	public void modificarSolicitante(Solicitante solicitante) {
		solicitanteDao.edit(solicitante);
	}

        @Override
	public void eliminarSolicitante(Solicitante solicitante) {
		solicitanteDao.remove(solicitante);
	}
}