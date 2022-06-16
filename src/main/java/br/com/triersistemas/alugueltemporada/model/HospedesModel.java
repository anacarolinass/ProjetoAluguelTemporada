package br.com.triersistemas.alugueltemporada.model;

import br.com.triersistemas.alugueltemporada.Domain.Endereco;
import lombok.Getter;

import java.time.LocalDate;

@Getter
public class HospedesModel {


    private String nome;
    private String cpf;
    private String telefone;
    private LocalDate dataNasc;
    private Endereco endereco;
}
