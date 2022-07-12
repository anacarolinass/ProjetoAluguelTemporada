package br.com.triersistemas.alugueltemporada.domain;

import lombok.Getter;

import java.time.LocalDate;
import java.util.UUID;


@Getter
public class Hospedes {

    private UUID id;
    private String nome;
    private String cpf;
    private String telefone;
    private LocalDate dataNasc;
    private Endereco endereco;


    public Hospedes(final String nome, final String cpf,
                    final String telefone,
                    final LocalDate dataNasc,
                    final Endereco endereco) {
        this.id = UUID.randomUUID();
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
        this.dataNasc = dataNasc;
        this.endereco = endereco;
    }

    public Hospedes editar(final String nome,
                           final String cpf,
                           final String telefone,
                           final LocalDate dataNasc,
                           final Endereco endereco) {
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
        this.dataNasc = dataNasc;
        this.endereco = endereco;
        return this;
    }
}




