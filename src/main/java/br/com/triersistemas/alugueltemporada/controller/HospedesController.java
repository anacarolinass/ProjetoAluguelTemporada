package br.com.triersistemas.alugueltemporada.controller;

import br.com.triersistemas.alugueltemporada.domain.Hospedes;
import br.com.triersistemas.alugueltemporada.model.HospedesModel;
import br.com.triersistemas.alugueltemporada.service.HospedesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/hospedes")
public class HospedesController {


    @Autowired
    private HospedesService hospedesService;

    @GetMapping("/consultar")
    public List<Hospedes> consultar() {
        return hospedesService.consultar();
    }

    @PostMapping("/cadastrar")
    public Hospedes cadastrar(@RequestBody HospedesModel model) {
        return hospedesService.cadastrar(model);
    }

    @PutMapping("/alterar/{id}")
    public Hospedes alterar(@PathVariable UUID id, @RequestBody HospedesModel model) {
        return hospedesService.alterar(id, model);
    }

    @DeleteMapping("/remover/{id}")
    public Hospedes remover(@PathVariable UUID id) {
        return hospedesService.remover(id);
    }


}


