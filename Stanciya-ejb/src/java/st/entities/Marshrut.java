/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package st.entities;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Музаффар
 */
@Entity
@Table(name = "marshrut")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Marshrut.findAll", query = "SELECT m FROM Marshrut m"),
    @NamedQuery(name = "Marshrut.findById", query = "SELECT m FROM Marshrut m WHERE m.id = :id"),
    @NamedQuery(name = "Marshrut.findByType", query = "SELECT m FROM Marshrut m WHERE m.type = :type"),
    @NamedQuery(name = "Marshrut.findByDateStart", query = "SELECT m FROM Marshrut m WHERE m.dateStart = :dateStart"),
    @NamedQuery(name = "Marshrut.findByDateEnd", query = "SELECT m FROM Marshrut m WHERE m.dateEnd = :dateEnd")})
public class Marshrut implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Column(name = "type")
    private Integer type;
    @Column(name = "date_start")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateStart;
    @Column(name = "date_end")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateEnd;

    public Marshrut() {
    }

    public Marshrut(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Date getDateStart() {
        return dateStart;
    }

    public void setDateStart(Date dateStart) {
        this.dateStart = dateStart;
    }

    public Date getDateEnd() {
        return dateEnd;
    }

    public void setDateEnd(Date dateEnd) {
        this.dateEnd = dateEnd;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Marshrut)) {
            return false;
        }
        Marshrut other = (Marshrut) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "st.entities.Marshrut[ id=" + id + " ]";
    }
    
}
