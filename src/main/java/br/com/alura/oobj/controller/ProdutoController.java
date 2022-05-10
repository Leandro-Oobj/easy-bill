package br.com.alura.oobj.controller;

import br.com.alura.oobj.model.Produto;
import br.com.alura.oobj.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


import java.util.List;

@Controller
public class ProdutoController {


    @Autowired
    private ProdutoRepository repository;

    @GetMapping("/produto")
    public String produto(Model model){
        List<Produto> produtos = repository.recuperaTodosOsProdutos();
        model.addAttribute("produtos", produtos);
        return "produto";

    }


}
