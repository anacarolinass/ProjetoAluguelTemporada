package br.com.triersistemas.alugueltemporada.repository;

import br.com.triersistemas.alugueltemporada.domain.Aluguel;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface AluguelRepository {

    List<Aluguel> consultar();

    Optional<Aluguel> consultar(UUID id);

    void cadastrar(Aluguel aluguel);

    void remover(Aluguel aluguel);
}
