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

    private Integer diaria;
    private BigDecimal valorDiaria;
    private EnumStatusImovel statusImovel;
    private EnumStatusPedido statusPedido;

    public Aluguel(final Hospedes hospede , final Imovel imovel) {
        this.id = UUID.randomUUID();
        this.imovel = imovel;
        this.hospede = hospede;
        this.diaria = diaria;
        this.valorDiaria = BigDecimal.ZERO;
    }


    public Aluguel(UUID idHospedes, UUID idImovel) {
    }

    public void editar(UUID idHospedes, UUID idImovel) {
    }


    public Aluguel pagar(final BigDecimal valorDiaria) {
        if (EnumStatusImovel.DISPONIVEL.equals(this.imovel) && valorDiaria.compareTo(this.valorDiaria) > 0) {

            this.statusPedido = EnumStatusPedido.PAGO;

        }
        return this;
    }

    public void addImovel(Imovel imovel) {
    }
}