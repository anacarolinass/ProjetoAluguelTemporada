package br.com.triersistemas.alugueltemporada.service.impl;

import br.com.triersistemas.alugueltemporada.domain.Endereco;
import br.com.triersistemas.alugueltemporada.domain.Hospedes;
import br.com.triersistemas.alugueltemporada.domain.Imovel;
import br.com.triersistemas.alugueltemporada.enuns.EnumStatusImovel;
import br.com.triersistemas.alugueltemporada.enuns.EnumTipoImovel;
import br.com.triersistemas.alugueltemporada.exceptions.NaoExisteException;
import br.com.triersistemas.alugueltemporada.model.ImovelModel;
import br.com.triersistemas.alugueltemporada.repository.HospedesRepository;
import br.com.triersistemas.alugueltemporada.repository.ImovelRepository;
import br.com.triersistemas.alugueltemporada.service.ImovelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class ImovelServiceImpl implements ImovelService {

    @Autowired
    private ImovelRepository imovelRepository;

    @Override
    public List<Imovel> consultar() {
        return imovelRepository.consultar();
    }

    @Override
    public Imovel consultar(UUID id) {

        return imovelRepository.consultar(id).orElseThrow(NaoExisteException::new);
    }

    @Override
    public Imovel cadastrar(ImovelModel model) {
        var imovel = new Imovel(model.getNome(), model.getTipoImovel(), model.getEndereco(), model.getValorDiaria());
        imovelRepository.cadastrar(imovel);
        return imovel;
    }

    @Override
    public List<Imovel> cadastrarAutomatico() {

        List<Imovel> ListaImoveis = new ArrayList<>();

        ListaImoveis.add(new Imovel("Casa do Morro", EnumTipoImovel.CASA,
                new Endereco("Rua. Idalino Manoel de Carvalho", 100, "Imbituba", "Praia do Rosa"), BigDecimal.valueOf(120.00)));
        ListaImoveis.add(new Imovel("Casa Paraiso", EnumTipoImovel.CASA,
                new Endereco("Av. Porto Novo", 380, "Imbituba", "Praia do Rosa"), BigDecimal.valueOf(180.00)));
        ListaImoveis.add(new Imovel("Apartamento Alto Padrão", EnumTipoImovel.APARTAMENTO,
                new Endereco("Av. Porto Novo", 56, "Imbituba", "Praia do Rosa"), BigDecimal.valueOf(1100.00)));
        ListaImoveis.add(new Imovel("Apartamento Nobre", EnumTipoImovel.APARTAMENTO,
                new Endereco("Rua. Caminho do Rei", 920, "Imbituba", "Praia do Rosa"), BigDecimal.valueOf(580.00)));
        ListaImoveis.add(new Imovel("Apartamento Palace", EnumTipoImovel.APARTAMENTO,
                new Endereco("Av. Porto Novo", 330, "Imbituba", "Praia do Rosa"), BigDecimal.valueOf(300.00)));
        ListaImoveis.add(new Imovel("Cabana Sonho do Rosa", EnumTipoImovel.CABANA,
                new Endereco("Rua Beija Flor", 10, "Imbituba", "Praia do Rosa"), BigDecimal.valueOf(170.00)));
        ListaImoveis.add(new Imovel("Cabana Gauleses", EnumTipoImovel.CABANA,
                new Endereco("Rua Clemente", 1020, "Imbituba", "Praia do Rosa"), BigDecimal.valueOf(150.00)));

        for (Imovel imovel : ListaImoveis) {
            this.imovelRepository.cadastrar(imovel);
        }
        return ListaImoveis;

    }


    @Override
    public Imovel alterar(UUID id, ImovelModel model) {
        var imovel = this.consultar(id);
        imovel.editar(model.getNome(), model.getTipoImovel(), model.getEndereco(), model.getValorDiaria());
        return imovel;


    }

    @Override
    public Imovel remover(UUID id) {

        Imovel imovel = this.consultar(id);
        imovelRepository.remover(imovel);
        return imovel;


    }
}
