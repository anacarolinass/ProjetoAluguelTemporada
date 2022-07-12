package br.com.triersistemas.alugueltemporada.model;

import br.com.triersistemas.alugueltemporada.domain.Endereco;
import lombok.Getter;
import org.hibernate.validator.constraints.br.CPF;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;

@Getter
public class HospedesModel {


    @NotNull
    @NotBlank
    private String nome;

    @CPF
    private String cpf;

    private String telefone;

    @NotNull
    @NotBlank
    private LocalDate dataNasc;


}
