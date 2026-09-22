package entities;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Data
@Entity //Mostra que esta entidade representa uma tabela no banco de dados
@Table(name="tb_membros") //nome da tabela de membros
public class Membro {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Essa linha faz com que gere sempre um ID novo a cada nova pessoa cadastrada
    private Long id; //A chave primária(primaryKey)

    @Column(nullable = false, length = 100) // Cria uma coluna e diz que é obrigatório o preenchimento(nullable = false), e diz o tamanha tem que ser 100(length = 100)
    private String nome;

    @Column(length = 20)
    private String telefone;

    @Column(length = 100)
    private String bairro;

    @Column(nullable = false, length = 50)
    private String status;

    @Column(name = "data_cadastro")
    private LocalDate dataCadastro;
}
