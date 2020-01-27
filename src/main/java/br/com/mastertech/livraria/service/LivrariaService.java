package br.com.mastertech.livraria.service;

import br.com.mastertech.livraria.model.LivrariaModel;
import br.com.mastertech.livraria.repository.LivrariaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LivrariaService {

    @Autowired
    private LivrariaRepository repository;

    public LivrariaModel cadastrarLivro(LivrariaModel livro) {
        return repository.save(livro);
    }
}
