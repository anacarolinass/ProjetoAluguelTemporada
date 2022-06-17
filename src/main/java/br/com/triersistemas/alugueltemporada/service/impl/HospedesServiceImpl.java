package br.com.triersistemas.alugueltemporada.service.impl;

import br.com.triersistemas.alugueltemporada.domain.Hospedes;
import br.com.triersistemas.alugueltemporada.exceptions.NaoExisteException;
import br.com.triersistemas.alugueltemporada.model.HospedesModel;
import br.com.triersistemas.alugueltemporada.repository.HospedesRepository;
import br.com.triersistemas.alugueltemporada.service.HospedesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class HospedesServiceImpl implements HospedesService {

    @Autowired
    private HospedesRepository hospedesRepository;

    @Override
    public List<Hospedes> consultar() {
        return hospedesRepository.consultar();
    }

    @Override
    public Hospedes consultar(UUID id) {
        return hospedesRepository.consultar(id).orElseThrow(NaoExisteException::new);
    }

    @Override
    public Hospedes cadastrar(HospedesModel model) {
        var hospedes = new Hospedes(model.getNome(), model.getCpf(), model.getTelefone(), model.getDataNasc(),model.getEndereco());
        hospedesRepository.cadastrar(hospedes);
        return hospedes;
    }

    @Override
    public Hospedes alterar(UUID id, HospedesModel model) {
        var hospedes = this.consultar(id);
        hospedes.editar(model.getNome(), model.getCpf(), model.getTelefone(), model.getDataNasc(),model.getEndereco());
        return hospedes;
    }

    @Override
    public Hospedes remover(UUID id) {
        Hospedes hospedes = this.consultar(id);
        hospedesRepository.remover(hospedes);
        return hospedes;
    }
}
