package service;

import entities.Membro;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repositories.MembroRepository;

import java.time.LocalDate;
import java.util.List;

@Service
public class MembroService {
    @Autowired// E a injeção de dependencias
    private MembroRepository repository;

    public List<Membro> listarTodos(){
        return repository.findAll(); //Metodo herdado da interface MembroRepository
    }

    public Membro salvarMembro (Membro membro){
        membro.setDataCadastro(LocalDate.now());//Aqui é uma regra: Grava a data de hoje automaticamente
        return repository.save(membro);
    }
}
