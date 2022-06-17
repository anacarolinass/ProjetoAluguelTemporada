package br.com.triersistemas.alugueltemporada.controller;

import br.com.triersistemas.alugueltemporada.domain.Aluguel;
import br.com.triersistemas.alugueltemporada.model.AdicionarImovelModel;
import br.com.triersistemas.alugueltemporada.model.AluguelModel;
import br.com.triersistemas.alugueltemporada.model.PagarImovelModel;
import br.com.triersistemas.alugueltemporada.service.AluguelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping ("/aluguel")
public class AluguelController {

    @Autowired
    private AluguelService aluguelService;

    @GetMapping ("/consultar")
    public List<Aluguel> consultar() {
        return aluguelService.consultar();
    }

    @PostMapping ("/cadastrar")
    public Aluguel cadastrar(@RequestBody AluguelModel model) {
        return aluguelService.cadastrar(model);
    }

    @PutMapping("/adicionar-imoveis/{id}")
    public Aluguel adicionarProdutos(@PathVariable UUID id, @RequestBody AdicionarImovelModel model) {
        return aluguelService.adicionarProdutos(id, model);
    }

    @PutMapping("/pagar/{id}")
    public Aluguel pagar(@PathVariable UUID id, @RequestBody PagarImovelModel model) {
        return aluguelService.pagar(id, model);
    }


}
