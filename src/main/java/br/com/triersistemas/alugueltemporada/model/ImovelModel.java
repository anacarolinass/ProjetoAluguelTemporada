package br.com.triersistemas.alugueltemporada.model;

import br.com.triersistemas.alugueltemporada.domain.Endereco;
import br.com.triersistemas.alugueltemporada.enuns.EnumStatusImovel;
import br.com.triersistemas.alugueltemporada.enuns.EnumTipoImovel;
import lombok.Getter;

import java.math.BigDecimal;
import java.util.UUID;

@Getter
public class ImovelModel {

    private String nome;
    private EnumTipoImovel tipoImovel;
    private Endereco endereco;
    private BigDecimal valorDiaria;
}
