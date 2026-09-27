package controllers;

import entities.FichaConversao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import service.FichaConversaoService;

import java.util.List;

@RestController
@RequestMapping("/api/novos-convertidos")
@CrossOrigin(origins = "*")
public class FIchaConversaoController {

    @Autowired
    private FichaConversaoService service;

    @PostMapping
    public ResponseEntity<FichaConversao> criarFicha(@RequestBody FichaConversao ficha){
        FichaConversao fichaSalva = service.salvarFicha(ficha);
        return ResponseEntity.status(HttpStatus.CREATED).body(fichaSalva);
    }

    @GetMapping
    public ResponseEntity<List<FichaConversao>> listarFichas(){
        return ResponseEntity.ok(service.listarTodas());
    }

}
