package repositories;

import entities.FichaConversao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FichaConversaoRepository extends JpaRepository<FichaConversao, Long> {
}
