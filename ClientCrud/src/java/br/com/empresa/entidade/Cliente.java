/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.empresa.entidade;

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
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author ian_l
 */
@Entity
@Table(name = "tb_cliente")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TbCliente.findAll", query = "SELECT t FROM TbCliente t")
    , @NamedQuery(name = "TbCliente.findByIdClient", query = "SELECT t FROM TbCliente t WHERE t.idClient = :idClient")
    , @NamedQuery(name = "TbCliente.findByNmCliente", query = "SELECT t FROM TbCliente t WHERE t.nmCliente = :nmCliente")
    , @NamedQuery(name = "TbCliente.findByCpfCliente", query = "SELECT t FROM TbCliente t WHERE t.cpfCliente = :cpfCliente")
    , @NamedQuery(name = "TbCliente.findByAniversarioCliente", query = "SELECT t FROM TbCliente t WHERE t.aniversarioCliente = :aniversarioCliente")
    , @NamedQuery(name = "TbCliente.findByTelefoneCliente", query = "SELECT t FROM TbCliente t WHERE t.telefoneCliente = :telefoneCliente")
    , @NamedQuery(name = "TbCliente.findByDsEmail", query = "SELECT t FROM TbCliente t WHERE t.dsEmail = :dsEmail")
    , @NamedQuery(name = "TbCliente.findByNmMaeCliente", query = "SELECT t FROM TbCliente t WHERE t.nmMaeCliente = :nmMaeCliente")
    , @NamedQuery(name = "TbCliente.findByNmPaiCliente", query = "SELECT t FROM TbCliente t WHERE t.nmPaiCliente = :nmPaiCliente")})
public class Cliente implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_client")
    private Integer idClient;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 70)
    @Column(name = "nm_cliente")
    private String nmCliente;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 11)
    @Column(name = "cpf_cliente")
    private String cpfCliente;
    @Basic(optional = false)
    @NotNull
    @Column(name = "aniversario_cliente")
    @Temporal(TemporalType.DATE)
    private Date aniversarioCliente;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 12)
    @Column(name = "telefone_cliente")
    private String telefoneCliente;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 80)
    @Column(name = "ds_email")
    private String dsEmail;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 70)
    @Column(name = "nm_mae_cliente")
    private String nmMaeCliente;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 70)
    @Column(name = "nm_pai_cliente")
    private String nmPaiCliente;

    public Cliente() {
    }

    public Cliente(Integer idClient) {
        this.idClient = idClient;
    }

    public Cliente(Integer idClient, String nmCliente, String cpfCliente, Date aniversarioCliente, String telefoneCliente, String dsEmail, String nmMaeCliente, String nmPaiCliente) {
        this.idClient = idClient;
        this.nmCliente = nmCliente;
        this.cpfCliente = cpfCliente;
        this.aniversarioCliente = aniversarioCliente;
        this.telefoneCliente = telefoneCliente;
        this.dsEmail = dsEmail;
        this.nmMaeCliente = nmMaeCliente;
        this.nmPaiCliente = nmPaiCliente;
    }

    public Integer getIdClient() {
        return idClient;
    }

    public void setIdClient(Integer idClient) {
        this.idClient = idClient;
    }

    public String getNmCliente() {
        return nmCliente;
    }

    public void setNmCliente(String nmCliente) {
        this.nmCliente = nmCliente;
    }

    public String getCpfCliente() {
        return cpfCliente;
    }

    public void setCpfCliente(String cpfCliente) {
        this.cpfCliente = cpfCliente;
    }

    public Date getAniversarioCliente() {
        return aniversarioCliente;
    }

    public void setAniversarioCliente(Date aniversarioCliente) {
        this.aniversarioCliente = aniversarioCliente;
    }

    public String getTelefoneCliente() {
        return telefoneCliente;
    }

    public void setTelefoneCliente(String telefoneCliente) {
        this.telefoneCliente = telefoneCliente;
    }

    public String getDsEmail() {
        return dsEmail;
    }

    public void setDsEmail(String dsEmail) {
        this.dsEmail = dsEmail;
    }

    public String getNmMaeCliente() {
        return nmMaeCliente;
    }

    public void setNmMaeCliente(String nmMaeCliente) {
        this.nmMaeCliente = nmMaeCliente;
    }

    public String getNmPaiCliente() {
        return nmPaiCliente;
    }

    public void setNmPaiCliente(String nmPaiCliente) {
        this.nmPaiCliente = nmPaiCliente;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idClient != null ? idClient.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Cliente)) {
            return false;
        }
        Cliente other = (Cliente) object;
        if ((this.idClient == null && other.idClient != null) || (this.idClient != null && !this.idClient.equals(other.idClient))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.empresa.entidade.TbCliente[ idClient=" + idClient + " ]";
    }
    
}
