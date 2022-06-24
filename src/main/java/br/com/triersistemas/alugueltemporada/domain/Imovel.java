package br.com.triersistemas.alugueltemporada.domain;

import br.com.triersistemas.alugueltemporada.enuns.EnumStatusImovel;
import br.com.triersistemas.alugueltemporada.enuns.EnumTipoImovel;
import lombok.Getter;

import java.math.BigDecimal;
import java.util.Optional;
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
                  final Endereco endereco,
                  final BigDecimal valorDiaria) {
        this();
        this.nome = nome;
        this.tipoImovel = tipoImovel;
        this.statusImovel = EnumStatusImovel.DISPONIVEL;
        this.endereco = endereco;
        this.valorDiaria = valorDiaria;
    }

    public Imovel editar(final String nome, final EnumTipoImovel tipoImovel,
                         final Endereco endereco,
                         final BigDecimal valorDiaria) {
        if (this.statusImovel.equals(EnumStatusImovel.DISPONIVEL)) {
            this.nome = nome;
            this.tipoImovel = tipoImovel;
            this.endereco = endereco;
            this.valorDiaria = valorDiaria;
        }
        return this;
    }

    public Imovel alterarStatus() {

        this.statusImovel = EnumStatusImovel.LOCADO;

        return this;

    }
}
