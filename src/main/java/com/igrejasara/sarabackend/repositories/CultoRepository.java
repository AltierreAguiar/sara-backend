package com.igrejasara.sarabackend.repositories;

import com.igrejasara.sarabackend.entities.Culto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CultoRepository extends JpaRepository<Culto, Long> {
}