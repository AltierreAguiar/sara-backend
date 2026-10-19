package com.igrejasara.sarabackend.controllers;

import com.igrejasara.sarabackend.entities.Culto;
import com.igrejasara.sarabackend.repositories.CultoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/cultos")
@CrossOrigin(origins = "*")
public class CultoController {

    @Autowired
    private CultoRepository repository;

    @GetMapping
    public ResponseEntity<List<Culto>> listarTodos() {
        return ResponseEntity.ok(repository.findAll());
    }

    @PostMapping
    public ResponseEntity<Culto> registrarCulto(@RequestBody Culto culto) {
        return ResponseEntity.status(HttpStatus.CREATED).body(repository.save(culto));
    }
}