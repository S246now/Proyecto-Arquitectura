
package com.prj.compra.beans;

import com.prj.compra.domain.Persona;
import com.prj.compra.domain.Solicitante;
import com.prj.compra.eis.SolicitanteDao;
import com.prj.compra.servicio.PersonaService;
import com.prj.compra.servicio.SolicitanteService;
import java.io.Serializable;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;
import org.primefaces.event.RowEditEvent;
/**
 *
 * @author Desk
 */
@Named
@ViewScoped
public class SolicitanteController implements Serializable{
    
    @EJB
    private SolicitanteDao solicitanteEJB;
    
    private Solicitante solicitante;
    private Persona persona;
    @Inject
    private PersonaService personaService;
    @Inject
    private SolicitanteService solicitanteService;
    List<Persona> personasList;
    List<Solicitante> solicitantesList;
    
    public SolicitanteController() {
    }
    
    @PostConstruct
    public void init(){
        solicitante = new Solicitante();
        persona = new Persona();
        personasList = personaService.listarPersonas();
        solicitantesList = solicitanteService.listarSolicitantes();
    }

    public SolicitanteDao getSolicitanteEJB() {
        return solicitanteEJB;
    }
    public void setSolicitanteEJB(SolicitanteDao solicitanteEJB) {
        this.solicitanteEJB = solicitanteEJB;
    }

    public Solicitante getSolicitante() {
        return solicitante;
    }
    public void setSolicitante(Solicitante solicitante) {
        this.solicitante = solicitante;
    }

    public Persona getPersona() { //getPersonaSeleccionada
        return persona;
    }
    public void setPersona(Persona personaSeleccionada) { //setPersonaSeleccionada
        this.persona = personaSeleccionada;
    }

    public PersonaService getPersonaService() {
        return personaService;
    }
    public void setPersonaService(PersonaService personaService) {
        this.personaService = personaService;
    }

    public List<Persona> getPersonasList() {
        return personasList;
    }
    public void setPersonasList(List<Persona> personas) {
        this.personasList = personas;
    }

    public SolicitanteService getSolicitanteService() {
        return solicitanteService;
    }
    public void setSolicitanteService(SolicitanteService solicitanteService) {
        this.solicitanteService = solicitanteService;
    }

    public List<Solicitante> getSolicitantesList() {
        return solicitantesList;
    }
    public void setSolicitantesList(List<Solicitante> solicitantesList) {
        this.solicitantesList = solicitantesList;
    }
    
    
    
    public void reiniciarEmpleado() {
        this.persona = new Persona();
        this.solicitante = new Solicitante();
    }

    public void agregarEmpleado() {
        personaService.registrarPersona(this.persona);
        solicitanteService.registrarSolicitante(this.solicitante);
        this.solicitante = null;
        this.persona = null;
        //actualizamos la lista
        this.init();
    }

    public void eliminarEmpleado() {
        personaService.eliminarPersona(this.persona);
        solicitanteService.eliminarSolicitante(this.solicitante);
        this.solicitante = null;
        this.persona = null;
        //actualizamos la lista
        this.init();
    }
    
    public void editListenerPersona(RowEditEvent event) {
        Persona persona = (Persona) event.getObject();
        personaService.modificarPersona(persona);
    }
    public void editListenerSolicitante(RowEditEvent event) {
        Solicitante solicitante = (Solicitante) event.getObject();
        solicitanteService.modificarSolicitante(solicitante);
    }
    
    
}
