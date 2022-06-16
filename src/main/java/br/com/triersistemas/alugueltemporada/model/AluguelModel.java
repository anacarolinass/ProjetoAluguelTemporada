package br.com.triersistemas.alugueltemporada.model;

import br.com.triersistemas.alugueltemporada.Domain.Hospedes;
import br.com.triersistemas.alugueltemporada.Domain.Imovel;
import lombok.Getter;

import java.util.UUID;

@Getter
public class AluguelModel {

    private UUID IdImovel;
    private UUID IdHospedes;
}
