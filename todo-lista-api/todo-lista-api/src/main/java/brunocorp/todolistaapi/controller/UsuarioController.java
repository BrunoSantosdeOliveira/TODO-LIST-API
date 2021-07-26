package brunocorp.todolistaapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import brunocorp.todolistaapi.repository.UsuarioRepository;

@RestController
public class UsuarioController {
	@Autowired
	private UsuarioRepository repository;
	
	 @GetMapping(path ="api/usuario/{codigo}")
     public ResponseEntity consultar(@PathVariable("codigo") Integer codigo) {
    	 return repository.findById(codigo)
    			 .map(record -> ResponseEntity.ok().body(record))
    			 .orElse(ResponseEntity.notFound().build());
     }
}
