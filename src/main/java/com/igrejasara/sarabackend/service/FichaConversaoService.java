package com.igrejasara.sarabackend.service;

import com.igrejasara.sarabackend.entities.FichaConversao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.igrejasara.sarabackend.repositories.FichaConversaoRepository;

import java.time.LocalDate;
import java.util.List;

@Service
public class FichaConversaoService {
    @Autowired
    private FichaConversaoRepository repository;

    public FichaConversao salvarFicha(FichaConversao ficha){
      //A data da ficha sempre é a atual que foi cadastrada no sistema
        ficha.setDataFicha(LocalDate.now());
        return repository.save(ficha);
    }

    public List<FichaConversao> listarTodas(){
        return repository.findAll();
    }
}
