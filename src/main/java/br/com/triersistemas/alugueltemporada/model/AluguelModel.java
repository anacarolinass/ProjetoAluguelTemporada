package br.com.triersistemas.alugueltemporada.model;

import lombok.Getter;

import java.util.UUID;

@Getter
public class AluguelModel {

    private UUID idHospedes;
    private UUID idImovel;
    private Integer dias;
}
