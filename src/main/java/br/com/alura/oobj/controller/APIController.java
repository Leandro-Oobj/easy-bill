package br.com.alura.oobj.controller;


import br.com.alura.oobj.dto.ListagemProdutos;
import br.com.alura.oobj.model.Produto;
import br.com.alura.oobj.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class APIController {

    @Autowired
    private ProdutoRepository produtoRepository;

    @GetMapping("/api/produtos")
    public List<ListagemProdutos> listandoProdutos() {
        List<Produto> produtos = produtoRepository.findAll();

        return ListagemProdutos.converter(produtos);

    }
}
