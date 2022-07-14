package br.com.triersistemas.alugueltemporada.domain;

import br.com.triersistemas.alugueltemporada.model.HospedesModel;
import lombok.Getter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDate;
import java.util.UUID;

@Getter
@Entity
@Table(name = "hospedes")
public class Hospedes {

    @Id
    private UUID id;
    private String nome;
    private String cpf;
    private String telefone;
    private LocalDate dataNasc;



    public Hospedes(final String nome, final String cpf,
                    final String telefone,
                    final LocalDate dataNasc
                    ) {
        this.id = UUID.randomUUID();
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
        this.dataNasc = dataNasc;

    }

    public Hospedes(HospedesModel model) {

    }

    public Hospedes editar(final String nome,
                           final String cpf,
                           final String telefone,
                           final LocalDate dataNasc
                           ) {
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
        this.dataNasc = dataNasc;

        return this;
    }
}




