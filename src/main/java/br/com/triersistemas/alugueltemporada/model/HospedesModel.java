package br.com.triersistemas.alugueltemporada.model;

import br.com.triersistemas.alugueltemporada.domain.Endereco;
import br.com.triersistemas.alugueltemporada.domain.Hospedes;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.br.CPF;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;
import java.util.UUID;

@NoArgsConstructor
@Getter
public class HospedesModel {

    private UUID id;
    private String nome;
    private String cpf;
    private LocalDate dataNasc;
    private String telefone;


    public HospedesModel(Hospedes hospedes) {
        this.id = hospedes.getId();
        this.nome = hospedes.getNome();
        this.cpf = hospedes.getCpf();
        this.dataNasc = hospedes.getDataNasc();

        this.telefone = hospedes.getTelefone();


    }
}
