package controllers;

import entities.Celula;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import repositories.CelulaRepository;

import java.util.List;

@RestController
@RequestMapping("/api/celulas")
@CrossOrigin(origins = "*")
public class CelulaController {
    @Autowired
    private CelulaRepository repository;

    @GetMapping
    public ResponseEntity<List<Celula>> listarTodas() {
        return ResponseEntity.ok(repository.findAll());
    }

    @PostMapping
    public ResponseEntity<Celula> criarCelula(@RequestBody Celula celula) {
        return ResponseEntity.status(HttpStatus.CREATED).body(repository.save(celula));
    }
}
