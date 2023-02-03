package com.prj.compra.beans;

import java.util.List;
import javax.annotation.PostConstruct;
import javax.inject.Inject;
import javax.inject.Named;
import com.prj.compra.domain.Aprobador;
import com.prj.compra.domain.Persona;
import com.prj.compra.servicio.AprobadorService;
import com.prj.compra.servicio.PersonaService;
import org.primefaces.event.RowEditEvent;
import javax.enterprise.context.RequestScoped;

@Named
@RequestScoped
public class AprobadorController{

    @Inject
    private AprobadorService aprobadorService;
    @Inject
    private PersonaService personaService;

    private Aprobador aprobadorSeleccionada;
    private Persona personaSeleccionada;

    List<Aprobador> aprobadores;
    List<Persona> personas;

    public AprobadorController() {
    }

    @PostConstruct
    public void inicializar() {
        //Iniciamos las variables
        aprobadores = aprobadorService.listarAprobadores();
        personas = personaService.listarPersonas();
        aprobadorSeleccionada = new Aprobador();
        personaSeleccionada = new Persona();
    }

    public void editListener(RowEditEvent event) {
        Aprobador aprobador = (Aprobador) event.getObject();
        aprobadorService.modificarAprobador(aprobador);
    }

    public List<Aprobador> getAprobadores() {
        return aprobadores;
    }

    public void setAprobadores(List<Aprobador> aprobadores) {
        this.aprobadores = aprobadores;
    }

    public Aprobador getAprobadorSeleccionada() {
        return aprobadorSeleccionada;
    }

    public void setAprobadorSeleccionada(Aprobador aprobadorSeleccionada) {
        this.aprobadorSeleccionada = aprobadorSeleccionada;
    }

    public void reiniciarAprobadorSeleccionada() {
        this.aprobadorSeleccionada = new Aprobador();
    }

    public PersonaService getPersonaService() {
        return personaService;
    }

    public void setPersonaService(PersonaService personaService) {
        this.personaService = personaService;
    }

    public Persona getPersonaSeleccionada() {
        return personaSeleccionada;
    }

    public void setPersonaSeleccionada(Persona personaSeleccionada) {
        this.personaSeleccionada = personaSeleccionada;
    }

    public List<Persona> getPersonas() {
        return personas;
    }

    public void setPersonas(List<Persona> personas) {
        this.personas = personas;
    }
    
    

    public void agregarAprobador() {
        aprobadorService.registrarAprobador(this.aprobadorSeleccionada);
        this.aprobadorSeleccionada = null;
        //actualizamos la lista
        this.inicializar();
    }

    public void eliminarAprobador() {
        aprobadorService.eliminarAprobador(this.aprobadorSeleccionada);
        this.aprobadorSeleccionada = null;
        //actualizamos la lista
        this.inicializar();
    }

    public AprobadorService getAprobadorService() {
        return aprobadorService;
    }

    public void setAprobadorService(AprobadorService aprobadorService) {
        this.aprobadorService = aprobadorService;
    }
    
    //que muestre solo los que son Aprobadores
    
}