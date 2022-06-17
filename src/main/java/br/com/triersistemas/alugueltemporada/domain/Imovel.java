package br.com.triersistemas.alugueltemporada.domain;

import br.com.triersistemas.alugueltemporada.enuns.EnumStatusImovel;
import br.com.triersistemas.alugueltemporada.enuns.EnumStatusPedido;
import br.com.triersistemas.alugueltemporada.enuns.EnumTipoImovel;
import lombok.Getter;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;


@Getter
public class Imovel {

    private UUID id;
    private String nome;
    private EnumTipoImovel tipoImovel;

    private EnumStatusImovel statusImovel;
    private Endereco endereco;

    private BigDecimal valorDiaria;

    public Imovel() {
        this.id = UUID.randomUUID();


    }

    public Imovel(final String nome, final EnumTipoImovel tipoImovel,
                  final EnumStatusImovel statusImovel, final Endereco endereco,
                  final BigDecimal valorDiaria) {
        this();
        this.nome = nome;
        this.tipoImovel = EnumTipoImovel.CASA;
        this.statusImovel = EnumStatusImovel.DISPONIVEL;
        this.endereco = endereco;
        this.valorDiaria = valorDiaria;
    }

    public void imoveisCadastrado() {

        new Imovel("Casa do Morro", EnumTipoImovel.CASA, EnumStatusImovel.DISPONIVEL, new Endereco("Rua. Idalino Manoel de Carvalho", 100, "Imbituba", "Praia do Rosa"), BigDecimal.valueOf(120.00));



    }

    public Imovel editar(final String nome, final EnumTipoImovel tipoImovel,
                         final EnumStatusImovel statusImovel, final Endereco endereco,
                         final BigDecimal valorDiaria) {
        this.nome = nome;
        this.tipoImovel = EnumTipoImovel.CASA;
        this.statusImovel = EnumStatusImovel.DISPONIVEL;
        this.endereco = endereco;
        this.valorDiaria = valorDiaria;
        return this;
    }

}