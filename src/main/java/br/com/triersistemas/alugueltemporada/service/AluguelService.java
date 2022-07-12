package br.com.triersistemas.alugueltemporada.service;

import br.com.triersistemas.alugueltemporada.domain.Aluguel;
import br.com.triersistemas.alugueltemporada.model.AdicionarImovelModel;
import br.com.triersistemas.alugueltemporada.model.AluguelModel;
import br.com.triersistemas.alugueltemporada.model.PagarImovelModel;

import java.util.List;
import java.util.UUID;

public interface AluguelService {

    List<Aluguel> consultar();

    Aluguel consultar(UUID id);

    Aluguel cadastrar(AluguelModel model);

    Aluguel adicionarImovel(UUID id, AdicionarImovelModel model);

    Aluguel pagar(UUID id, PagarImovelModel model);


    Aluguel remover(UUID id);
}
