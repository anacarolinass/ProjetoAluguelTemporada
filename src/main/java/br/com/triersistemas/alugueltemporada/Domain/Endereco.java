package br.com.triersistemas.alugueltemporada.Domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@AllArgsConstructor
@ToString
@Getter
public class Endereco {

    private String endereco;
    private int numero;
    private String cidade;
    private String bairro;
}