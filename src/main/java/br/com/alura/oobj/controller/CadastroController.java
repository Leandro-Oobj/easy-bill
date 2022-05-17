package br.com.alura.oobj.controller;


import br.com.alura.oobj.dto.RequisicaoNovoProduto;
import br.com.alura.oobj.model.Produto;
import br.com.alura.oobj.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

@Controller
public class CadastroController {

    @Autowired
    private ProdutoRepository produtoRepository;


    @GetMapping("formulario")
    public String formulario(RequisicaoNovoProduto requisicao) {

        return "formulario";
    }

    @PostMapping("formulario/novo")
    public String novo(@Valid RequisicaoNovoProduto requisicao, BindingResult result) {

        if (result.hasErrors()) {
            return "formulario";
        }

        Produto produto = requisicao.toProduto();
        produtoRepository.save(produto);

        return "formulario";
    }

}

