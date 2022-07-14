package br.com.triersistemas.alugueltemporada.service;

import br.com.triersistemas.alugueltemporada.domain.Hospedes;
import br.com.triersistemas.alugueltemporada.model.HospedesModel;

import java.util.List;
import java.util.UUID;

public interface HospedesService {

    List<HospedesModel> consultar();

    HospedesModel consultar(UUID id);

    HospedesModel cadastrar(HospedesModel model);

    HospedesModel alterar(HospedesModel model);

    HospedesModel remover(UUID id);
}
