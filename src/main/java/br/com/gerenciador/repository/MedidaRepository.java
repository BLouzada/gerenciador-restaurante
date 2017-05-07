package br.com.gerenciador.repository;

import br.com.gerenciador.entity.IngredienteEntity;
import br.com.gerenciador.entity.MedidaEntity;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by 201320336 on 20/04/2017.
 */
public interface MedidaRepository extends CrudRepository<MedidaEntity,Long> {

}
