package br.com.triersistemas.alugueltemporada.repository.impl;

import br.com.triersistemas.alugueltemporada.Domain.Aluguel;
import br.com.triersistemas.alugueltemporada.Domain.Hospedes;
import br.com.triersistemas.alugueltemporada.repository.AluguelRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository
public class AluguelRepositoryImpl implements AluguelRepository {

    private static final List<Aluguel> LIST = new ArrayList<>();

    @Override
    public List<Aluguel> consultar() {
        return LIST;
    }


    @Override
    public Optional<Aluguel> consultar(UUID id) {
        return LIST.stream().filter(aluguel -> id.equals(aluguel.getId())).findFirst();
    }

    @Override
    public void cadastrar(Aluguel aluguel) {
        LIST.add(aluguel);
    }

    @Override
    public void remover(Aluguel aluguel) {
        LIST.remove(aluguel);
    }
}
