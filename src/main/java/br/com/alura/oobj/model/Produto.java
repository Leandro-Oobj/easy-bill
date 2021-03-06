package br.com.alura.oobj.model;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
public class Produto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 150, nullable = false)
    private String nomeProduto;

    @Column(length = 500, nullable = false)
    private String urlImagemProduto;

    @Column(length = 1000)
    private String descricaoProduto;

    private BigDecimal preco;

    private BigDecimal precoPromocional;

    @Column(length = 10)
    private String classeFiscal;


    public String getNomeProduto() {
        return nomeProduto;
    }

    public Long getId() {
        return id;
    }

    public String getUrlImagemProduto() {
        return urlImagemProduto;
    }

    public String getDescricaoProduto() {
        return descricaoProduto;
    }

    public BigDecimal getPreco() {
        return preco;
    }

    public BigDecimal getPrecoPromocional() {
        return precoPromocional;
    }

    public String getClasseFiscal() {
        return classeFiscal;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public void setDescricaoProduto(String descricaoProduto) {
        this.descricaoProduto = descricaoProduto;
    }

    public void setPreco(BigDecimal preco) {
        this.preco = preco;
    }

    public void setPrecoPromocional(BigDecimal precoPromocional) {
        this.precoPromocional = precoPromocional;
    }

    public void setClasseFiscal(String classeFiscal) {
        this.classeFiscal = classeFiscal;
    }

    public void setUrlImagemProduto(String urlImagemProduto) {
        this.urlImagemProduto = urlImagemProduto;
    }
}
