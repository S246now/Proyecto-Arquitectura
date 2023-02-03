package com.prj.compra.beans;

import java.util.List;
import javax.annotation.PostConstruct;
import javax.inject.Inject;
import javax.inject.Named;
import com.prj.compra.domain.Solicitud;
import com.prj.compra.domain.Requerimiento;
import com.prj.compra.domain.SolicitudRequerimiento;
import com.prj.compra.servicio.SolicitudService;
import com.prj.compra.servicio.RequerimientoService;
import com.prj.compra.servicio.SolicitudRequerimientoService;
import java.io.Serializable;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;

@Named
@ViewScoped
public class SolicitudController implements Serializable{
    
    @Inject
    private SolicitudService solicitudService;
    @Inject
    private RequerimientoService requerimientoService;
    @Inject
    private SolicitudRequerimientoService solicitudrequerimientoService;

    private Solicitud solicitud;
    private Requerimiento requerimiento;
    private SolicitudRequerimiento solicitudrequerimiento;

    List<Solicitud> solicitudList;
    List<Requerimiento> requerimientoList;
    List<SolicitudRequerimiento> solicitudRequerimientoList;
    
    public SolicitudController(){
        
    }
    
    @PostConstruct
    public void init(){
        solicitud = new Solicitud();
        requerimiento = new Requerimiento();
        solicitudrequerimiento = new SolicitudRequerimiento();
        solicitudList = solicitudService.listarSolicitudes();
        requerimientoList = requerimientoService.listarRequerimientos();
        solicitudRequerimientoList = solicitudrequerimientoService.listarSolicitudRequerimientos();
    }

    public Solicitud getSolicitud() {
        return solicitud;
    }

    public void setSolicitud(Solicitud solicitud) {
        this.solicitud = solicitud;
    }

    public Requerimiento getRequerimiento() {
        return requerimiento;
    }

    public void setRequerimiento(Requerimiento requerimiento) {
        this.requerimiento = requerimiento;
    }

    public SolicitudRequerimiento getSolicitudrequerimiento() {
        return solicitudrequerimiento;
    }

    public void setSolicitudrequerimiento(SolicitudRequerimiento solicitudrequerimiento) {
        this.solicitudrequerimiento = solicitudrequerimiento;
    }

    public SolicitudService getSolicitudService() {
        return solicitudService;
    }
    public void setSolicitudService(SolicitudService solicitudService) {
        this.solicitudService = solicitudService;
    }

    public RequerimientoService getRequerimientoService() {
        return requerimientoService;
    }
    public void setRequerimientoService(RequerimientoService requerimientoService) {
        this.requerimientoService = requerimientoService;
    }

    public SolicitudRequerimientoService getSolicitudrequerimientoService() {
        return solicitudrequerimientoService;
    }
    public void setSolicitudrequerimientoService(SolicitudRequerimientoService solicitudrequerimientoService) {
        this.solicitudrequerimientoService = solicitudrequerimientoService;
    }

    public List<Solicitud> getSolicitudList() {
        return solicitudList;
    }
    public void setSolicitudList(List<Solicitud> solicitudList) {
        this.solicitudList = solicitudList;
    }

    public List<Requerimiento> getRequerimientoList() {
        return requerimientoList;
    }
    public void setRequerimientoList(List<Requerimiento> RequerimientoList) {
        this.requerimientoList = RequerimientoList;
    }

    public List<SolicitudRequerimiento> getSolicitudRequerimientoList() {
        return solicitudRequerimientoList;
    }
    public void setSolicitudRequerimientoList(List<SolicitudRequerimiento> SolicitudRequerimientoList) {
        this.solicitudRequerimientoList = SolicitudRequerimientoList;
    }
    
    
    public String GuardarSolicitud(){
//        Usuario us;
        String redireccion = null;
        
        try{
//            us = EJBUsuario.iniciarSesion(usuario);
            solicitudService.registrarSolicitud(this.solicitud);
            requerimientoService.registrarRequerimiento(this.requerimiento);
            solicitudrequerimientoService.registrarSolicitudRequerimiento(this.solicitudrequerimiento);
            this.solicitud = null;
            this.requerimiento = null;
            this.solicitudrequerimiento = null;
            //actualizamos la lista
            this.init();
            if(this.solicitud != null){
                FacesContext.getCurrentInstance().getExternalContext().getSessionMap().put("usuario", this.solicitud);
                redireccion = "index?faces-redirect=true";
            } else {
                FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_WARN, "Aviso", "Credenciales Incorrectas."));
            }
        } catch (Exception e){
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_FATAL, "Aviso", "Error."));
        }
        return redireccion;
    }
    
}