package com.prj.compra.servicio;

import java.util.List;
import javax.ejb.Stateless;
import javax.inject.Inject;
import com.prj.compra.domain.Persona;
import com.prj.compra.eis.PersonaDao;

@Stateless
public class PersonaServiceImpl implements  PersonaService {
	
	@Inject
	private PersonaDao personaDao;

        @Override
	public List<Persona> listarPersonas() {
		return personaDao.findAll();
	}

        @Override
	public Persona encontrarPersonaPorId(Persona persona) {
		return personaDao.find(persona);
	}

//        @Override
//	public Persona encontrarPersonaPorEmail(Persona persona) {
//		return personaDao.find(persona);
//	}

        @Override
	public void registrarPersona(Persona persona) {
		//montón de código
                personaDao.create(persona);
	}

        @Override
	public void modificarPersona(Persona persona) {
		personaDao.edit(persona);
	}

        @Override
	public void eliminarPersona(Persona persona) {
		personaDao.remove(persona);
	}
}