package repositories;

import entities.Membro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository //Anotação que indica que esta interface vai se comunicar diretamente com o banco de dados
public interface MembroRepository extends JpaRepository<Membro, Long> {// Aqui são métodos prontos do Jpa  para que não precise Usar diretament os comandos SQL
}
