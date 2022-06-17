package br.com.triersistemas.alugueltemporada.service.impl;

import br.com.triersistemas.alugueltemporada.domain.Imovel;
import br.com.triersistemas.alugueltemporada.model.ImovelModel;
import br.com.triersistemas.alugueltemporada.repository.HospedesRepository;
import br.com.triersistemas.alugueltemporada.repository.ImovelRepository;
import br.com.triersistemas.alugueltemporada.service.ImovelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class ImovelServiceImpl implements ImovelService {

    @Autowired
    private ImovelRepository imovelRepository;

    @Override
    public List<Imovel> consultar() {
        return null;
    }

    @Override
    public Imovel consultar(UUID id) {
        return null;
    }

    @Override
    public Imovel cadastrar(ImovelModel model) {
        return null;
    }

    @Override
    public Imovel alterar(UUID id, ImovelModel model) {
        return null;
    }

    @Override
    public Imovel remover(UUID id) {
        return null;
    }
}
