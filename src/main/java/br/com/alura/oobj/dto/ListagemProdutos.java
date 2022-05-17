package br.com.alura.oobj.dto;

import br.com.alura.oobj.model.Produto;

import java.math.BigDecimal;
import java.util.List;
import java.util.stream.Collectors;

public class ListagemProdutos {

    private Long id;

    private String nome;

    private String descricao;

    private BigDecimal preco;

    private BigDecimal precoPromocional;

    private String urlProduto;

    private String classeFiscal;

    public ListagemProdutos(Produto produto){
        this.id = produto.getId();
        this.nome = produto.getNomeProduto();
        this.descricao = produto.getDescricaoProduto();
        this.preco = produto.getPreco();
        this.precoPromocional = produto.getPrecoPromocional();
        this.classeFiscal = produto.getClasseFiscal();
        this.urlProduto = produto.getUrlImagemProduto();;
    }

    public static List<ListagemProdutos> converter(List<Produto> produtos){
        return produtos.stream().map(ListagemProdutos::new).collect(Collectors.toList());
    }

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public BigDecimal getPreco() {
        return preco;
    }

    public BigDecimal getPrecoPromocional() {
        return precoPromocional;
    }

    public String getUrlProduto() {
        return urlProduto;
    }

    public String getClasseFiscal() {
        return classeFiscal;
    }
}
