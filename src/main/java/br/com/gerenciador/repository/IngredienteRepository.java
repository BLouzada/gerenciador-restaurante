package br.com.gerenciador.repository;

import br.com.gerenciador.entity.ClienteEntity;
import br.com.gerenciador.entity.IngredienteEntity;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by 201320336 on 20/04/2017.
 */
public interface IngredienteRepository extends CrudRepository<IngredienteEntity,Long> {

}
