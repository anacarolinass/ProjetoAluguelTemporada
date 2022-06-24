package br.com.triersistemas.alugueltemporada.repository.impl;

import br.com.triersistemas.alugueltemporada.domain.Imovel;
import br.com.triersistemas.alugueltemporada.enuns.EnumStatusImovel;
import br.com.triersistemas.alugueltemporada.repository.ImovelRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository
public class ImovelRepositoryImpl implements ImovelRepository {

    private static final List<Imovel> LIST = new ArrayList<>();

    @Override
    public List<Imovel> consultar() {
        var buscarImovelDisponivel = LIST.stream().filter(aluguel -> aluguel.getStatusImovel().equals(EnumStatusImovel.DISPONIVEL)).toList();

        return buscarImovelDisponivel;
        }



    @Override
    public Optional<Imovel> consultar(UUID id) {
        return LIST.stream().filter(imovel -> id.equals(imovel.getId())).findFirst();
    }

    @Override
    public void cadastrar(Imovel imovel) {
        LIST.add(imovel);
    }


    @Override
    public void remover(Imovel imovel) {

        LIST.remove(imovel);
    }
}
