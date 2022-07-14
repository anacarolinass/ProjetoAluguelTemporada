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
    public List<HospedesModel> consultar(){
        return hospedesRepository.findAll().stream().map(HospedesModel::new).toList();
    }

    @Override
    public HospedesModel consultar(UUID id) {
        return new HospedesModel(this.buscarHospedesId(id));
    }

    @Override
    public HospedesModel cadastrar(HospedesModel model) {
        Hospedes hospedes = new Hospedes(model);

        return new HospedesModel(hospedesRepository.save(hospedes));
    }

    @Override
    public HospedesModel alterar(HospedesModel model) {
        Hospedes hospedes = this.buscarHospedesId(model.getId());
        hospedes.editar(model.getNome(), model.getCpf(),model.getDataNasc(),model.getTelefone());
        return new HospedesModel(this.hospedesRepository.save(hospedes));
    }


    @Override
    public HospedesModel remover(UUID id) {
        Hospedes hospedes = this.buscarHospedesId(id);
        hospedesRepository.delete(hospedes);
        return new HospedesModel(hospedes);
    }

    private Hospedes buscarHospedesId(UUID id){
        return hospedesRepository.findById(id).orElseThrow(NaoExisteException::new);
    }
}
