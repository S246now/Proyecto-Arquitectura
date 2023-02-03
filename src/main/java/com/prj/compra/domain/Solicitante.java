
package com.prj.compra.domain;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
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
@Table(name = "solicitante")
@NamedQueries({
    @NamedQuery(name = "Solicitante.findAll", query = "SELECT s FROM Solicitante s"),
    @NamedQuery(name = "Solicitante.findByIdSolicitante", query = "SELECT s FROM Solicitante s WHERE s.idSolicitante = :idSolicitante"),
    @NamedQuery(name = "Solicitante.findByCargo", query = "SELECT s FROM Solicitante s WHERE s.cargo = :cargo"),
    @NamedQuery(name = "Solicitante.findByDepartamento", query = "SELECT s FROM Solicitante s WHERE s.departamento = :departamento"),
    @NamedQuery(name = "Solicitante.findByCorreo", query = "SELECT s FROM Solicitante s WHERE s.correo = :correo")})
public class Solicitante implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idSolicitante")
    private Short idSolicitante;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "cargo")
    private String cargo;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "departamento")
    private String departamento;
    @Size(max = 45)
    @Column(name = "correo")
    private String correo;
    @JoinColumn(name = "idPersona", referencedColumnName = "idPersona")
    @ManyToOne//(cascade = CascadeType.PERSIST)
    private Persona idPersona;

    public Solicitante() {
    }

    public Solicitante(Short idSolicitante) {
        this.idSolicitante = idSolicitante;
    }

    public Solicitante(Short idSolicitante, String cargo, String departamento) {
        this.idSolicitante = idSolicitante;
        this.cargo = cargo;
        this.departamento = departamento;
    }

    public Short getIdSolicitante() {
        return idSolicitante;
    }

    public void setIdSolicitante(Short idSolicitante) {
        this.idSolicitante = idSolicitante;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
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
        hash += (idSolicitante != null ? idSolicitante.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Solicitante)) {
            return false;
        }
        Solicitante other = (Solicitante) object;
        if ((this.idSolicitante == null && other.idSolicitante != null) || (this.idSolicitante != null && !this.idSolicitante.equals(other.idSolicitante))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.prj.compra.domain.Solicitante[ idSolicitante=" + idSolicitante + " ]";
    }
    
}
