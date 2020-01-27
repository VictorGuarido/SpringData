package br.com.mastertech.livraria.repository;


import br.com.mastertech.livraria.model.LivrariaModel;
import org.springframework.data.repository.CrudRepository;

public interface LivrariaRepository extends CrudRepository<LivrariaModel, String> {

}
