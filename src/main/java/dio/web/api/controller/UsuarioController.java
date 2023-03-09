package dio.web.api.controller;

import dio.web.api.model.Usuario;
import dio.web.api.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {
    @Autowired
    UsuarioRepository repository;

    @GetMapping()
    public List<Usuario> findAll(){
        return repository.findAll();
    }
    @GetMapping("/{nome}")
    public Usuario findByName(@PathVariable String nome){
        return repository.findByUsername(nome);
    }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id){
        repository.deleteById(id);
    }
    @PostMapping()
    public void save(@RequestBody Usuario usuario){
        repository.save(usuario);
    }
    @PutMapping
    public void update(@RequestBody Usuario usuario){ repository.save(usuario); }
}
