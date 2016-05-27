/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package st.entities;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Музаффар
 */
@Entity
@Table(name = "stanciya_spr")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "StanciyaSpr.findAll", query = "SELECT s FROM StanciyaSpr s"),
    @NamedQuery(name = "StanciyaSpr.findById", query = "SELECT s FROM StanciyaSpr s WHERE s.id = :id"),
    @NamedQuery(name = "StanciyaSpr.findByStName", query = "SELECT s FROM StanciyaSpr s WHERE s.stName = :stName")})
public class StanciyaSpr implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "id")
    private Integer id;
    @Size(max = 50)
    @Column(name = "stName")
    private String stName;

    public StanciyaSpr() {
    }

    public StanciyaSpr(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getStName() {
        return stName;
    }

    public void setStName(String stName) {
        this.stName = stName;
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
        if (!(object instanceof StanciyaSpr)) {
            return false;
        }
        StanciyaSpr other = (StanciyaSpr) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "st.entities.StanciyaSpr[ id=" + id + " ]";
    }
    
}
