/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.prj.compra.domain;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author Desk
 */
@Entity
@Table(name = "solicitud_requerimiento")
@NamedQueries({
    @NamedQuery(name = "SolicitudRequerimiento.findAll", query = "SELECT s FROM SolicitudRequerimiento s"),
    @NamedQuery(name = "SolicitudRequerimiento.findByIdsolicitudRequerimiento", query = "SELECT s FROM SolicitudRequerimiento s WHERE s.idsolicitudRequerimiento = :idsolicitudRequerimiento"),
    @NamedQuery(name = "SolicitudRequerimiento.findByCantidad", query = "SELECT s FROM SolicitudRequerimiento s WHERE s.cantidad = :cantidad"),
    @NamedQuery(name = "SolicitudRequerimiento.findByPrecioReferencial", query = "SELECT s FROM SolicitudRequerimiento s WHERE s.precioReferencial = :precioReferencial")})
public class SolicitudRequerimiento implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idsolicitud_requerimiento")
    private Short idsolicitudRequerimiento;
    @Column(name = "cantidad")
    private Integer cantidad;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "precioReferencial")
    private Double precioReferencial;
    @JoinColumn(name = "idRequerimiento", referencedColumnName = "idRequerimiento")
    @ManyToOne
    private Requerimiento idRequerimiento;
    @JoinColumn(name = "idSolicitud", referencedColumnName = "idSolicitud")
    @ManyToOne
    private Solicitud idSolicitud;

    public SolicitudRequerimiento() {
    }

    public SolicitudRequerimiento(Short idsolicitudRequerimiento) {
        this.idsolicitudRequerimiento = idsolicitudRequerimiento;
    }

    public Short getIdsolicitudRequerimiento() {
        return idsolicitudRequerimiento;
    }

    public void setIdsolicitudRequerimiento(Short idsolicitudRequerimiento) {
        this.idsolicitudRequerimiento = idsolicitudRequerimiento;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public Double getPrecioReferencial() {
        return precioReferencial;
    }

    public void setPrecioReferencial(Double precioReferencial) {
        this.precioReferencial = precioReferencial;
    }

    public Requerimiento getIdRequerimiento() {
        return idRequerimiento;
    }

    public void setIdRequerimiento(Requerimiento idRequerimiento) {
        this.idRequerimiento = idRequerimiento;
    }

    public Solicitud getIdSolicitud() {
        return idSolicitud;
    }

    public void setIdSolicitud(Solicitud idSolicitud) {
        this.idSolicitud = idSolicitud;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idsolicitudRequerimiento != null ? idsolicitudRequerimiento.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SolicitudRequerimiento)) {
            return false;
        }
        SolicitudRequerimiento other = (SolicitudRequerimiento) object;
        if ((this.idsolicitudRequerimiento == null && other.idsolicitudRequerimiento != null) || (this.idsolicitudRequerimiento != null && !this.idsolicitudRequerimiento.equals(other.idsolicitudRequerimiento))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.prj.compra.domain.SolicitudRequerimiento[ idsolicitudRequerimiento=" + idsolicitudRequerimiento + " ]";
    }
    
}
