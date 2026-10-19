package com.igrejasara.sarabackend.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Data
@Entity
@Table(name = "tb_cultos")
public class Culto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private LocalDate data;

    @Column(length = 50)
    private String tipo; // Ex: Celebração, Ensino, Oração

    private Integer totalPresentes;

    private Integer totalVisitantes;

    @Column(columnDefinition = "TEXT")
    private String observacoes;
}
