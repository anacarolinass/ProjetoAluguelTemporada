package br.com.triersistemas.alugueltemporada.model;

import br.com.triersistemas.alugueltemporada.domain.Endereco;
import br.com.triersistemas.alugueltemporada.enuns.EnumTipoImovel;
import lombok.Getter;

import java.math.BigDecimal;

@Getter
public class ImovelModel {

    private Integer id;
    private String nome;
    private EnumTipoImovel tipoImovel;
    private Endereco endereco;
    private BigDecimal valorDiaria;
}
