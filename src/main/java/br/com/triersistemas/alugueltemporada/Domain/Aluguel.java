package br.com.triersistemas.alugueltemporada.Domain;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;


@Getter
public class Aluguel {

    private UUID id;
    private List<Imovel> imovel;
    private Hospedes hospede;
    private Integer diaria;
    private BigDecimal valorDiaria;

    public Aluguel(final Hospedes hospede) {
        this.id = UUID.randomUUID();
        this.imovel = new ArrayList<>();
        this.hospede = hospede;
        this.diaria = diaria;
        this.valorDiaria = BigDecimal.ZERO;
    }


    public Aluguel(UUID idHospedes, UUID idImovel) {
    }

    public void editar(UUID idHospedes, UUID idImovel) {
    }
}