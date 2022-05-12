package br.com.alura.oobj.controller;


import br.com.alura.oobj.dto.RequesicaoNovoProduto;
import br.com.alura.oobj.model.Produto;
import br.com.alura.oobj.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class CadastroController {

    @Autowired
    private ProdutoRepository produtoRepository;


    @GetMapping("formulario")
    public String formulario(){
        return "formulario";
    }

    @PostMapping("formulario/novo")
    public String novo (RequesicaoNovoProduto requisicao){

        Produto produto = requisicao.toProduto();
        produtoRepository.save(produto);

        return "formulario";
    }

}

