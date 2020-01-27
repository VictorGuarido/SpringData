package br.com.mastertech.livraria.controller;

import br.com.mastertech.livraria.model.LivrariaModel;
import br.com.mastertech.livraria.service.LivrariaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class LivrariaController {

    @Autowired
    private LivrariaService service;

    @GetMapping
    public String mostrarHome(){
        return "index";
    }

    @PostMapping("/cadastrar")
    public String cadastrarLivro(LivrariaModel livro){
        service.cadastrarLivro(livro);
        return "index";
    }

}
