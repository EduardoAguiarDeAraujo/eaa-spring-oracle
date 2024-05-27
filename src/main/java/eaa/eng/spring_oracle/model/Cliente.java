package eaa.eng.spring_oracle.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Table(name = "CLIENTE")
public class Cliente {

    @Id
    @Column(name = "ID")
    private Integer id;

    @Column(name = "RAZAO_SOCIAL")
    private String razaoSocial;

    @Column(name = "CNPJ")
    private String cnpj;

    @Column(name = "SEGMERCADO_ID")
    private String segmercadoId;

    @Column(name = "DATA_INCLUSAO")
    private LocalDate dataInclusao;

    @Column(name = "FATURAMENTO_PREVISTO")
    private BigDecimal faturamentoPrevisto;

    @Column(name = "CATEGORIA")
    private String categoria;

    public Cliente() {

    }

    public Cliente(Integer id, String razaoSocial, String cnpj, String segmentoID, LocalDate dataInclusao, BigDecimal faturamentoPrevisto, String categoria) {
        this.id = id;
        this.razaoSocial = razaoSocial;
        this.cnpj = cnpj;
        this.segmercadoId = segmentoID;
        this.dataInclusao = dataInclusao;
        this.faturamentoPrevisto = faturamentoPrevisto;
        this.categoria = categoria;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getSegmentoID() {
        return segmercadoId;
    }

    public void setSegmentoID(String segmentoID) {
        this.segmercadoId = segmentoID;
    }

    public LocalDate getDataInclusao() {
        return dataInclusao;
    }

    public void setDataInclusao(LocalDate dataInclusao) {
        this.dataInclusao = dataInclusao;
    }

    public BigDecimal getFaturamentoPrevisto() {
        return faturamentoPrevisto;
    }

    public void setFaturamentoPrevisto(BigDecimal faturamentoPrevisto) {
        this.faturamentoPrevisto = faturamentoPrevisto;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
}
