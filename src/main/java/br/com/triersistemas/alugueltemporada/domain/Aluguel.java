package br.com.triersistemas.alugueltemporada.domain;

import br.com.triersistemas.alugueltemporada.enuns.EnumStatusImovel;
import br.com.triersistemas.alugueltemporada.enuns.EnumStatusPedido;
import lombok.Getter;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;


@Getter
public class Aluguel {

    private UUID id;
    private Imovel imovel;
    private Hospedes hospede;
    private BigDecimal valorDiaria;

    private EnumStatusPedido statusPedido;

    private EnumStatusImovel statusImovel;

    public Aluguel(final Hospedes hospede, final Imovel imovel) {
        this.id = UUID.randomUUID();
        this.imovel = imovel;
        this.hospede = hospede;
        this.valorDiaria = BigDecimal.ZERO;
    }


    public Aluguel(UUID idHospedes, UUID idImovel) {
    }

    public void editar(UUID idHospedes, UUID idImovel) {
    }

    public Aluguel adicionarImoveis(final Imovel imovel) {
        if (EnumStatusImovel.DISPONIVEL.equals(this.statusImovel)) {
            this.imovel = imovel;
            this.valorDiaria = this.imovel.getValorDiaria();
        }
        return this;
    }


    public Aluguel pagar(final BigDecimal valorDiaria) {
        if (EnumStatusPedido.PENDENTE.equals(this.statusPedido) && valorDiaria.compareTo(this.valorDiaria) > 0) {

            this.statusPedido = EnumStatusPedido.PAGO;

        }
        return this;
    }


}