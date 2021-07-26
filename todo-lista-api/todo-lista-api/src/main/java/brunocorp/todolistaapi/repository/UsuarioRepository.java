package brunocorp.todolistaapi.repository;

import org.springframework.data.repository.CrudRepository;

import brunocorp.todolistaapi.model.UsuarioModel;

public interface UsuarioRepository extends CrudRepository<UsuarioModel,Integer> {

}
