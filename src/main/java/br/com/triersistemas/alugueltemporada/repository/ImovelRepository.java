package br.com.triersistemas.alugueltemporada.repository;

import br.com.triersistemas.alugueltemporada.domain.Imovel;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface ImovelRepository {

    List<Imovel> consultar();
    Optional<Imovel> consultar(UUID id);
    void cadastrar(Imovel imovel);
    void remover(Imovel imovel);
}
