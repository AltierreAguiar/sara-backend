package com.igrejasara.sarabackend.entities;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "tb_celulas")
public class Celula {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 100)
    private String nome; // Ex: Célula Videira

    @Column(length = 100)
    private String bairro; // Ex: Bairro Cuidos

    @Column(length = 50)
    private String diaHorario; // Ex: Terças, 19h30

    @Column(length = 50)
    private String status; // Ex: Ativa, Em multiplicação

    // Relacionamentos com a tabela de Membros
    @ManyToOne
    @JoinColumn(name = "lider_id")
    private Membro lider;

    @ManyToOne
    @JoinColumn(name = "colider_id")
    private Membro colider;

    @ManyToOne
    @JoinColumn(name = "anfitriao_id")
    private Membro anfitriao;
}
