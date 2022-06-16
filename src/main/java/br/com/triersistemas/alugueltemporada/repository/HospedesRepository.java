package br.com.triersistemas.alugueltemporada.repository;

import br.com.triersistemas.alugueltemporada.Domain.Hospedes;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface HospedesRepository {

    List<Hospedes> consultar();

    Optional<Hospedes> consultar(UUID id);

    void cadastrar(Hospedes hospedes);

    void remover(Hospedes hospedes);
}
