
package com.prj.compra.domain;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
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
@Table(name = "persona")
@NamedQueries({
    @NamedQuery(name = "Persona.findAll", query = "SELECT p FROM Persona p"),
    @NamedQuery(name = "Persona.findByIdPersona", query = "SELECT p FROM Persona p WHERE p.idPersona = :idPersona"),
    @NamedQuery(name = "Persona.findByCedula", query = "SELECT p FROM Persona p WHERE p.cedula = :cedula"),
    @NamedQuery(name = "Persona.findByNombre", query = "SELECT p FROM Persona p WHERE p.nombre = :nombre"),
    @NamedQuery(name = "Persona.findByCelular", query = "SELECT p FROM Persona p WHERE p.celular = :celular")})
public class Persona implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "idPersona")
    private Short idPersona;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "cedula")
    private String cedula;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 40)
    @Column(name = "nombre")
    private String nombre;
    @Size(max = 10)
    @Column(name = "celular")
    private String celular;
    @OneToMany(mappedBy = "idPersona", cascade = CascadeType.PERSIST)
    private List<Solicitante> solicitanteList;
    @OneToMany(mappedBy = "idPersona", cascade = CascadeType.PERSIST)
    private List<Aprobador> aprobadorList;

    public Persona() {
    }

    public Persona(Short idPersona) {
        this.idPersona = idPersona;
    }

    public Persona(Short idPersona, String cedula, String nombre) {
        this.idPersona = idPersona;
        this.cedula = cedula;
        this.nombre = nombre;
    }

    public Short getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(Short idPersona) {
        this.idPersona = idPersona;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public List<Solicitante> getSolicitanteList() {
        return solicitanteList;
    }

    public void setSolicitanteList(List<Solicitante> solicitanteList) {
        this.solicitanteList = solicitanteList;
    }

    public List<Aprobador> getAprobadorList() {
        return aprobadorList;
    }

    public void setAprobadorList(List<Aprobador> aprobadorList) {
        this.aprobadorList = aprobadorList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idPersona != null ? idPersona.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Persona)) {
            return false;
        }
        Persona other = (Persona) object;
        if ((this.idPersona == null && other.idPersona != null) || (this.idPersona != null && !this.idPersona.equals(other.idPersona))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.prj.compra.domain.Persona[ idPersona=" + idPersona + " ]";
    }
    
}
