package br.com.triersistemas.alugueltemporada.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@AllArgsConstructor
@ToString
@Getter
public class Endereco {

    private String endereco;
    private int numero;
    private String bairro;
    private String cidade;
}