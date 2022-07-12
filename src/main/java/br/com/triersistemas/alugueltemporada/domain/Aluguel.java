package br.com.triersistemas.alugueltemporada.domain;

import br.com.triersistemas.alugueltemporada.enuns.EnumStatusImovel;
import br.com.triersistemas.alugueltemporada.enuns.EnumStatusPedido;
import br.com.triersistemas.alugueltemporada.model.PagarImovelModel;
import lombok.Getter;

import java.math.BigDecimal;
import java.util.UUID;


@Getter
public class Aluguel {

    private UUID id;
    private Imovel imovel;
    private Hospedes hospede;
    private Integer dias;
    private BigDecimal valorTotalDiaria;

    private EnumStatusPedido statusPedido;

    private EnumStatusImovel statusImovel;

    public Aluguel(final Hospedes hospede, final Imovel imovel, final Integer dias) {
        this.id = UUID.randomUUID();
        this.imovel = imovel;
        this.hospede = hospede;
        this.dias = dias;
        this.imovel.alterarStatus();
        this.valorTotalDiaria = imovel.getValorDiaria().multiply(BigDecimal.valueOf(dias));
        this.statusImovel = EnumStatusImovel.LOCADO;
        this.statusPedido = EnumStatusPedido.PENDENTE;
    }


    public Aluguel(UUID idHospedes, UUID idImovel) {
    }

    public void editar(UUID idHospedes, UUID idImovel) {
    }

    public Aluguel adicionarImoveis(final Imovel imovel) {
        if (EnumStatusImovel.DISPONIVEL.equals(this.statusImovel)) {
            this.imovel = imovel;
            this.valorTotalDiaria = this.imovel.getValorDiaria();

        }
        return this;
    }


    public Aluguel pagar(PagarImovelModel model) {
        if (EnumStatusPedido.PENDENTE.equals(this.statusPedido) && valorTotalDiaria.compareTo(this.valorTotalDiaria) > 0) {

            this.statusPedido = EnumStatusPedido.PAGO;

        }
        return this;
    }


}