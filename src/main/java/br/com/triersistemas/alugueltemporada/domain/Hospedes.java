package br.com.triersistemas.alugueltemporada.domain;

import java.util.UUID;
import java.time.LocalDate;

import lombok.Getter;


@Getter
public class Hospedes {

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




