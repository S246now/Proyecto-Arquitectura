/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.prj.compra.domain;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author Desk
 */
@Entity
@Table(name = "solicitud")
@NamedQueries({
    @NamedQuery(name = "Solicitud.findAll", query = "SELECT s FROM Solicitud s"),
    @NamedQuery(name = "Solicitud.findByIdSolicitud", query = "SELECT s FROM Solicitud s WHERE s.idSolicitud = :idSolicitud"),
    @NamedQuery(name = "Solicitud.findByFecha", query = "SELECT s FROM Solicitud s WHERE s.fecha = :fecha"),
    @NamedQuery(name = "Solicitud.findByIdSolicitante", query = "SELECT s FROM Solicitud s WHERE s.idSolicitante = :idSolicitante"),
    @NamedQuery(name = "Solicitud.findByIdAprobador", query = "SELECT s FROM Solicitud s WHERE s.idAprobador = :idAprobador"),
    @NamedQuery(name = "Solicitud.findByJustificacion", query = "SELECT s FROM Solicitud s WHERE s.justificacion = :justificacion"),
    @NamedQuery(name = "Solicitud.findByPresupuesto", query = "SELECT s FROM Solicitud s WHERE s.presupuesto = :presupuesto"),
    @NamedQuery(name = "Solicitud.findByPrioridad", query = "SELECT s FROM Solicitud s WHERE s.prioridad = :prioridad"),
    @NamedQuery(name = "Solicitud.findByEstado", query = "SELECT s FROM Solicitud s WHERE s.estado = :estado")})
public class Solicitud implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "idSolicitud")
    private Short idSolicitud;
    @Basic(optional = false)
    @NotNull
    @Column(name = "fecha")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecha;
    @Column(name = "idSolicitante")
    private Short idSolicitante;
    @Column(name = "idAprobador")
    private Short idAprobador;
    @Size(max = 250)
    @Column(name = "justificacion")
    private String justificacion;
    @Basic(optional = false)
    @NotNull
    @Column(name = "presupuesto")
    private double presupuesto;
    @Basic(optional = false)
    @NotNull
    @Column(name = "prioridad")
    private Character prioridad;
    @Column(name = "estado")
    private Character estado;
    @OneToMany(mappedBy = "idSolicitud")
    private List<SolicitudRequerimiento> solicitudRequerimientoList;

    public Solicitud() {
    }

    public Solicitud(Short idSolicitud) {
        this.idSolicitud = idSolicitud;
    }

    public Solicitud(Short idSolicitud, Date fecha, double presupuesto, Character prioridad) {
        this.idSolicitud = idSolicitud;
        this.fecha = fecha;
        this.presupuesto = presupuesto;
        this.prioridad = prioridad;
    }

    public Short getIdSolicitud() {
        return idSolicitud;
    }

    public void setIdSolicitud(Short idSolicitud) {
        this.idSolicitud = idSolicitud;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Short getIdSolicitante() {
        return idSolicitante;
    }

    public void setIdSolicitante(Short idSolicitante) {
        this.idSolicitante = idSolicitante;
    }

    public Short getIdAprobador() {
        return idAprobador;
    }

    public void setIdAprobador(Short idAprobador) {
        this.idAprobador = idAprobador;
    }

    public String getJustificacion() {
        return justificacion;
    }

    public void setJustificacion(String justificacion) {
        this.justificacion = justificacion;
    }

    public double getPresupuesto() {
        return presupuesto;
    }

    public void setPresupuesto(double presupuesto) {
        this.presupuesto = presupuesto;
    }

    public Character getPrioridad() {
        return prioridad;
    }

    public void setPrioridad(Character prioridad) {
        this.prioridad = prioridad;
    }

    public Character getEstado() {
        return estado;
    }

    public void setEstado(Character estado) {
        this.estado = estado;
    }

    public List<SolicitudRequerimiento> getSolicitudRequerimientoList() {
        return solicitudRequerimientoList;
    }

    public void setSolicitudRequerimientoList(List<SolicitudRequerimiento> solicitudRequerimientoList) {
        this.solicitudRequerimientoList = solicitudRequerimientoList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idSolicitud != null ? idSolicitud.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Solicitud)) {
            return false;
        }
        Solicitud other = (Solicitud) object;
        if ((this.idSolicitud == null && other.idSolicitud != null) || (this.idSolicitud != null && !this.idSolicitud.equals(other.idSolicitud))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.prj.compra.domain.Solicitud[ idSolicitud=" + idSolicitud + " ]";
    }
    
}
