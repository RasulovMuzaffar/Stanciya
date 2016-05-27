/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package st.entities;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Музаффар
 */
@Entity
@Table(name = "poezd")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Poezd.findAll", query = "SELECT p FROM Poezd p"),
    @NamedQuery(name = "Poezd.findByNomerP", query = "SELECT p FROM Poezd p WHERE p.nomerP = :nomerP")})
public class Poezd implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "nomerP")
    private Integer nomerP;
    @OneToMany(mappedBy = "idPoezd")
    private Collection<VagonSpr> vagonSprCollection;

    public Poezd() {
    }

    public Poezd(Integer nomerP) {
        this.nomerP = nomerP;
    }

    public Integer getNomerP() {
        return nomerP;
    }

    public void setNomerP(Integer nomerP) {
        this.nomerP = nomerP;
    }

    @XmlTransient
    public Collection<VagonSpr> getVagonSprCollection() {
        return vagonSprCollection;
    }

    public void setVagonSprCollection(Collection<VagonSpr> vagonSprCollection) {
        this.vagonSprCollection = vagonSprCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (nomerP != null ? nomerP.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Poezd)) {
            return false;
        }
        Poezd other = (Poezd) object;
        if ((this.nomerP == null && other.nomerP != null) || (this.nomerP != null && !this.nomerP.equals(other.nomerP))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "st.entities.Poezd[ nomerP=" + nomerP + " ]";
    }
    
}
