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
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author Desk
 */
@Entity
@Table(name = "aprobador")
@NamedQueries({
    @NamedQuery(name = "Aprobador.findAll", query = "SELECT a FROM Aprobador a"),
    @NamedQuery(name = "Aprobador.findByIdAprobador", query = "SELECT a FROM Aprobador a WHERE a.idAprobador = :idAprobador"),
    @NamedQuery(name = "Aprobador.findByCargo", query = "SELECT a FROM Aprobador a WHERE a.cargo = :cargo"),
    @NamedQuery(name = "Aprobador.findByCorreo", query = "SELECT a FROM Aprobador a WHERE a.correo = :correo")})
public class Aprobador implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idAprobador")
    private Short idAprobador;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "cargo")
    private String cargo;
    @Size(max = 45)
    @Column(name = "correo")
    private String correo;
    @JoinColumn(name = "idPersona", referencedColumnName = "idPersona")
    @ManyToOne
    private Persona idPersona;

    public Aprobador() {
    }

    public Aprobador(Short idAprobador) {
        this.idAprobador = idAprobador;
    }

    public Aprobador(Short idAprobador, String cargo) {
        this.idAprobador = idAprobador;
        this.cargo = cargo;
    }

    public Short getIdAprobador() {
        return idAprobador;
    }

    public void setIdAprobador(Short idAprobador) {
        this.idAprobador = idAprobador;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public Persona getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(Persona idPersona) {
        this.idPersona = idPersona;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idAprobador != null ? idAprobador.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Aprobador)) {
            return false;
        }
        Aprobador other = (Aprobador) object;
        if ((this.idAprobador == null && other.idAprobador != null) || (this.idAprobador != null && !this.idAprobador.equals(other.idAprobador))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.prj.compra.domain.Aprobador[ idAprobador=" + idAprobador + " ]";
    }
    
}
