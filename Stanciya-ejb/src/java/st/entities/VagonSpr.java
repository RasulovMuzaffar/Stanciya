/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package st.entities;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Музаффар
 */
@Entity
@Table(name = "vagon_spr")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "VagonSpr.findAll", query = "SELECT v FROM VagonSpr v"),
    @NamedQuery(name = "VagonSpr.findByNomerV", query = "SELECT v FROM VagonSpr v WHERE v.nomerV = :nomerV"),
    @NamedQuery(name = "VagonSpr.findByDlina", query = "SELECT v FROM VagonSpr v WHERE v.dlina = :dlina"),
    @NamedQuery(name = "VagonSpr.findByObyem", query = "SELECT v FROM VagonSpr v WHERE v.obyem = :obyem")})
public class VagonSpr implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "nomerV")
    private Integer nomerV;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @NotNull
    @Column(name = "dlina")
    private BigDecimal dlina;
    @Basic(optional = false)
    @NotNull
    @Column(name = "obyem")
    private BigDecimal obyem;
    @JoinColumn(name = "id_poezd", referencedColumnName = "nomerP")
    @ManyToOne
    private Poezd idPoezd;
    @JoinColumn(name = "id_tip", referencedColumnName = "id")
    @OneToOne
    private TipSpr idTip;

    public VagonSpr() {
    }

    public VagonSpr(Integer nomerV) {
        this.nomerV = nomerV;
    }

    public VagonSpr(Integer nomerV, BigDecimal dlina, BigDecimal obyem) {
        this.nomerV = nomerV;
        this.dlina = dlina;
        this.obyem = obyem;
    }

    public Integer getNomerV() {
        return nomerV;
    }

    public void setNomerV(Integer nomerV) {
        this.nomerV = nomerV;
    }

    public BigDecimal getDlina() {
        return dlina;
    }

    public void setDlina(BigDecimal dlina) {
        this.dlina = dlina;
    }

    public BigDecimal getObyem() {
        return obyem;
    }

    public void setObyem(BigDecimal obyem) {
        this.obyem = obyem;
    }

    public Poezd getIdPoezd() {
        return idPoezd;
    }

    public void setIdPoezd(Poezd idPoezd) {
        this.idPoezd = idPoezd;
    }

    public TipSpr getIdTip() {
        return idTip;
    }

    public void setIdTip(TipSpr idTip) {
        this.idTip = idTip;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (nomerV != null ? nomerV.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof VagonSpr)) {
            return false;
        }
        VagonSpr other = (VagonSpr) object;
        if ((this.nomerV == null && other.nomerV != null) || (this.nomerV != null && !this.nomerV.equals(other.nomerV))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "st.entities.VagonSpr[ nomerV=" + nomerV + " ]";
    }
    
}
