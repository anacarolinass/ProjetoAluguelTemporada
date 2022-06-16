package br.com.triersistemas.alugueltemporada.service;

import br.com.triersistemas.alugueltemporada.Domain.Hospedes;
import br.com.triersistemas.alugueltemporada.model.HospedesModel;

import java.util.List;
import java.util.UUID;

public interface HospedesService {

    List<Hospedes> consultar();

    Hospedes consultar(UUID id);

    Hospedes cadastrar(HospedesModel model);

    Hospedes alterar(UUID id, HospedesModel model);

    Hospedes remover(UUID id);
}
