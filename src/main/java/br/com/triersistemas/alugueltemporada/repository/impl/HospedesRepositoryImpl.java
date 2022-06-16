package br.com.triersistemas.alugueltemporada.repository.impl;

import br.com.triersistemas.alugueltemporada.Domain.Hospedes;
import br.com.triersistemas.alugueltemporada.repository.HospedesRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository
public class HospedesRepositoryImpl implements HospedesRepository {

    private static final List<Hospedes> LIST = new ArrayList<>();

    @Override
    public List<Hospedes> consultar() {
        return LIST;
    }


    @Override
    public Optional<Hospedes> consultar(UUID id) {
        return LIST.stream().filter(hospedes -> id.equals(hospedes.getId())).findFirst();
    }

    @Override
    public void cadastrar(Hospedes hospedes) {
        LIST.add(hospedes);
    }

    @Override
    public void remover(Hospedes hospedes) {
        LIST.remove(hospedes);
    }
}
