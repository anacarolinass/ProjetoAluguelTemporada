package br.com.triersistemas.alugueltemporada.model;

import br.com.triersistemas.alugueltemporada.enuns.EnumFormaPagamento;
import lombok.Getter;

import javax.validation.constraints.NotNull;
import java.math.BigDecimal;

@Getter
public class PagarImovelModel {

    @NotNull
    private EnumFormaPagamento formaPagamento;
}
