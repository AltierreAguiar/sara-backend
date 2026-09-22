package controllers;

import entities.Membro;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import service.MembroService;

import java.util.List;

@RestController // Diz que esta classe vai ter requisições da internet
@RequestMapping("api/membros") // Esta é a url padrão(End point) que eu defini
@CrossOrigin(origins = "*")

public class MembroController {

    @Autowired
    private MembroService service;

    @GetMapping
    public ResponseEntity<List<Membro>> buscarTodos(){
        List<Membro> lista = service.listarTodos();
        return ResponseEntity.ok(lista);
    }

    @PostMapping
    public ResponseEntity<Membro> criarMembro(@RequestBody Membro membro){
        Membro membroSalvo = service.salvarMembro(membro);
        return ResponseEntity.status(HttpStatus.CREATED).body(membroSalvo);
    }
}
