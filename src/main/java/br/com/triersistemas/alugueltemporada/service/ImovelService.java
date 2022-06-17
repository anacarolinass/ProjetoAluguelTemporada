package br.com.triersistemas.alugueltemporada.service;

import br.com.triersistemas.alugueltemporada.domain.Imovel;
import br.com.triersistemas.alugueltemporada.model.ImovelModel;

import java.util.List;
import java.util.UUID;

public interface ImovelService {

    List<Imovel> consultar();

    Imovel consultar(UUID id);

    Imovel cadastrar(ImovelModel model);

    Imovel alterar(UUID id, ImovelModel model);

    Imovel remover(UUID id);
}
