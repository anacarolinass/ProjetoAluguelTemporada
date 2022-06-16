package br.com.triersistemas.alugueltemporada.service.impl;

import br.com.triersistemas.alugueltemporada.Domain.Aluguel;
import br.com.triersistemas.alugueltemporada.Domain.Hospedes;
import br.com.triersistemas.alugueltemporada.exceptions.NaoExisteException;
import br.com.triersistemas.alugueltemporada.model.AluguelModel;
import br.com.triersistemas.alugueltemporada.model.HospedesModel;
import br.com.triersistemas.alugueltemporada.repository.AluguelRepository;
import br.com.triersistemas.alugueltemporada.repository.HospedesRepository;
import br.com.triersistemas.alugueltemporada.service.AluguelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class AluguelServiceImpl implements AluguelService {

    @Autowired
    private AluguelRepository aluguelRepository;

    @Override
    public List<Aluguel> consultar() {
        return aluguelRepository.consultar();
    }

    @Override
    public Aluguel consultar(UUID id) {
        return aluguelRepository.consultar(id).orElseThrow(NaoExisteException::new);
    }

    @Override
    public Aluguel cadastrar(AluguelModel model) {
        var aluguel = new Aluguel(model.getIdHospedes(), model.getIdImovel());
        aluguelRepository.cadastrar(aluguel);
        return aluguel;
    }

    @Override
    public Aluguel alterar(UUID id, AluguelModel model) {
        var aluguel = this.consultar(id);
        aluguel.editar(model.getIdHospedes(), model.getIdImovel());
        return aluguel;
    }

    @Override
    public Aluguel remover(UUID id) {
        Aluguel aluguel = this.consultar(id);
        aluguelRepository.remover(aluguel);
        return aluguel;
    }
}
