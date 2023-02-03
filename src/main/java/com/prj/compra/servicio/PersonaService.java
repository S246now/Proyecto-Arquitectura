package com.prj.compra.servicio;

import java.util.List;
import javax.ejb.Local;
import com.prj.compra.domain.Persona;

@Local
public interface PersonaService {

    public List<Persona> listarPersonas();

    public Persona encontrarPersonaPorId(Persona persona);

//    public Persona encontrarPersonaPorEmail(Persona persona);

    public void registrarPersona(Persona persona);

    public void modificarPersona(Persona persona);

    public void eliminarPersona(Persona persona);
}