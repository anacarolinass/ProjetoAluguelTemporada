package br.com.triersistemas.alugueltemporada.controller;

import br.com.triersistemas.alugueltemporada.domain.Imovel;
import br.com.triersistemas.alugueltemporada.model.ImovelModel;
import br.com.triersistemas.alugueltemporada.service.ImovelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/imovel")
public class ImovelController {

    @Autowired
    private ImovelService imovelService;

    @GetMapping("/consultar")
    public List<Imovel> consultar() {
        return imovelService.consultar();
    }

    @PostMapping("/cadastrar")
    public Imovel cadastrar(@RequestBody ImovelModel model) {
        return imovelService.cadastrar(model);
    }

    @PutMapping("/alterar/{id}")
    public Imovel alterar(@PathVariable UUID id, @RequestBody ImovelModel model) {
        return imovelService.alterar(id, model);
    }

    @DeleteMapping("/remover/{id}")
    public Imovel remover(@PathVariable UUID id) {
        return imovelService.remover(id);
    }




}
