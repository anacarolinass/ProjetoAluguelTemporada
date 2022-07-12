package br.com.triersistemas.alugueltemporada.model;

import br.com.triersistemas.alugueltemporada.enuns.EnumFormaDePagamento;
import lombok.Getter;

import javax.validation.constraints.NotNull;

@Getter
public class PagarImovelModel {

    @NotNull
    private EnumFormaDePagamento enumFormaDePagamento;
}
