/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.prj.compra.domain;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author Desk
 */
@Entity
@Table(name = "requerimiento")
@NamedQueries({
    @NamedQuery(name = "Requerimiento.findAll", query = "SELECT r FROM Requerimiento r"),
    @NamedQuery(name = "Requerimiento.findByIdRequerimiento", query = "SELECT r FROM Requerimiento r WHERE r.idRequerimiento = :idRequerimiento"),
    @NamedQuery(name = "Requerimiento.findByDescripcion", query = "SELECT r FROM Requerimiento r WHERE r.descripcion = :descripcion")})
public class Requerimiento implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "idRequerimiento")
    private Short idRequerimiento;
    @Size(max = 45)
    @Column(name = "descripcion")
    private String descripcion;
    @OneToMany(mappedBy = "idRequerimiento")
    private List<SolicitudRequerimiento> solicitudRequerimientoList;

    public Requerimiento() {
    }

    public Requerimiento(Short idRequerimiento) {
        this.idRequerimiento = idRequerimiento;
    }

    public Short getIdRequerimiento() {
        return idRequerimiento;
    }

    public void setIdRequerimiento(Short idRequerimiento) {
        this.idRequerimiento = idRequerimiento;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
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
        hash += (idRequerimiento != null ? idRequerimiento.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Requerimiento)) {
            return false;
        }
        Requerimiento other = (Requerimiento) object;
        if ((this.idRequerimiento == null && other.idRequerimiento != null) || (this.idRequerimiento != null && !this.idRequerimiento.equals(other.idRequerimiento))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.prj.compra.domain.Requerimiento[ idRequerimiento=" + idRequerimiento + " ]";
    }
    
}
