package entities;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Data
@Entity
@Table(name = "tb_fichas_conversao")

public class FichaConversao {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 50)
    private String tipo;

    @Column(nullable = false, length = 100)
    private String nomeCompleto;

    private LocalDate dataNascimento;

    @Column(length = 100)
    private String endereco;

    @Column(length = 100)
    private String bairro;

    @Column(length = 20)
    private String whatsapp;

    private boolean participaCelula;

    @Column(length = 100)
    private String nomeLiderCelula;

    @Column(length = 100)
    private String nomeAcompanhante; // Quem convidou

    @Column(length = 50)
    private String necessidadeOracao; // Espiritual, Saúde, Emocional, Financeiro, Mental

    @Column(length = 100)
    private String responsavelAcompanhamento;

    @Column(nullable = false)
    private LocalDate dataFicha;

    @Column(columnDefinition = "TEXT")
    private String observacao;
}