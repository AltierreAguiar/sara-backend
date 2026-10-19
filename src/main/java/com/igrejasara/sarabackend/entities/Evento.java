package com.igrejasara.sarabackend.entities;

import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDate;

@Data
@Entity
@Table(name = "tb_eventos")
public class Evento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 100)
    private String nome; // Ex: Retiro de Jovens, Conferência

    private LocalDate dataInicio;

    private LocalDate dataFim;

    @Column(length = 150)
    private String local;

    @Column(columnDefinition = "TEXT")
    private String descricao;

    private Double valorInscricao;
}