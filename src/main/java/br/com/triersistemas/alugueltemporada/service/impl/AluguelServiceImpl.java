package br.com.triersistemas.alugueltemporada.service.impl;

import br.com.triersistemas.alugueltemporada.domain.Aluguel;
import br.com.triersistemas.alugueltemporada.domain.Imovel;
import br.com.triersistemas.alugueltemporada.exceptions.NaoExisteException;
import br.com.triersistemas.alugueltemporada.model.AdicionarImovelModel;
import br.com.triersistemas.alugueltemporada.model.AluguelModel;
import br.com.triersistemas.alugueltemporada.model.PagarImovelModel;
import br.com.triersistemas.alugueltemporada.repository.AluguelRepository;
import br.com.triersistemas.alugueltemporada.service.AluguelService;
import br.com.triersistemas.alugueltemporada.service.HospedesService;
import br.com.triersistemas.alugueltemporada.service.ImovelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class AluguelServiceImpl implements AluguelService {

    @Autowired
    private AluguelRepository aluguelRepository;

    @Autowired
    private HospedesService hospedesService;

    @Autowired
    private ImovelService imovelService;


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
        var hospedes = hospedesService.consultar(model.getIdHospedes());
        var imovel = imovelService.consultar(model.getIdImovel());
        var aluguel = new Aluguel(hospedes, imovel, model.getDias());
        aluguelRepository.cadastrar(aluguel);
        return aluguel;
    }


    @Override
    public Aluguel adicionarImovel(UUID id, AdicionarImovelModel model) {
        Aluguel aluguel = this.consultar(id);
        Imovel imovel = imovelService.consultar(model.getIdImovel());
        aluguel.adicionarImoveis(imovel);
        return aluguel;
    }

    @Override
    public Aluguel pagar(UUID id, PagarImovelModel model) {
        var aluguel = this.consultar(id);
        return aluguel.pagar(model);
    }
}
