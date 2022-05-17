package br.com.alura.oobj.dto;

import br.com.alura.oobj.model.Produto;

import javax.validation.constraints.*;
import java.math.BigDecimal;
import java.util.List;
import java.util.stream.Collectors;

public class RequisicaoNovoProduto {

    @NotBlank
    @Size(max = 150, message
            = "O campo nome nao não deve exceder 150 caracteres")
    private String nomeProduto;

    @Size(max = 1000, message
            = "O campo descrição nao não deve exceder 1000 caracteres")
    private String descricaoProduto;
    @NotNull
    @DecimalMin(value = "0.1", message = "O valor deve ser maior que zero")
    private BigDecimal preco;

    private BigDecimal precoPromocional;

    @NotBlank
    @Size(max = 500, message
            = "O campo descrição nao não deve exceder 500 caracteres")
    private String urlImagemProduto;

    @NotBlank
    private String classeFiscal;

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public String getDescricaoProduto() {
        return descricaoProduto;
    }

    public void setDescricaoProduto(String descricaoProduto) {
        this.descricaoProduto = descricaoProduto;
    }

    public BigDecimal getPreco() {
        return preco;
    }

    public void setPreco(BigDecimal preco) {
        this.preco = preco;
    }

    public BigDecimal getPrecoPromocional() {
        return precoPromocional;
    }

    public void setPrecoPromocional(BigDecimal precoPromocional) {
        if (precoPromocional.compareTo(preco) == -1) {
            this.precoPromocional = precoPromocional;
        }
    }

    public String getUrlImagemProduto() {
        return urlImagemProduto;
    }

    public void setUrlImagemProduto(String urlImagemProduto) {
        this.urlImagemProduto = urlImagemProduto;
    }

    public String getClasseFiscal() {
        return classeFiscal;
    }

    public void setClasseFiscal(String classeFiscal) {
        this.classeFiscal = classeFiscal;
    }





    public Produto toProduto() {
        Produto produto = new Produto();
        produto.setNomeProduto(nomeProduto);
        produto.setDescricaoProduto(descricaoProduto);
        produto.setPreco(preco);
        produto.setPrecoPromocional(precoPromocional);
        produto.setClasseFiscal(classeFiscal);
        produto.setUrlImagemProduto(urlImagemProduto);
        return  produto;
    }

}
