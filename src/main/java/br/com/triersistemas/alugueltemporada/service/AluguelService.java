package br.com.triersistemas.alugueltemporada.service;

import br.com.triersistemas.alugueltemporada.Domain.Aluguel;
import br.com.triersistemas.alugueltemporada.model.AluguelModel;

import java.util.List;
import java.util.UUID;

public interface AluguelService {

    List<Aluguel> consultar();

    Aluguel consultar(UUID id);

    Aluguel cadastrar(AluguelModel model);

    Aluguel alterar(UUID id, AluguelModel model);

    Aluguel remover(UUID id);

}
