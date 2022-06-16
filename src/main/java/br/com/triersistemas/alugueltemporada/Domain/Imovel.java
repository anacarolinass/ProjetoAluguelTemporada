package br.com.triersistemas.alugueltemporada.Domain;

import br.com.triersistemas.alugueltemporada.enuns.EnumStatusImovel;
import br.com.triersistemas.alugueltemporada.enuns.EnumTipoImovel;
import lombok.Getter;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;


@Getter
public class Imovel {

    private UUID id;
    private String nome;
    private EnumTipoImovel tipoImovel;
    private EnumStatusImovel statusImovel;
    private Endereco endereco;

    private BigDecimal valorDiaria;

    public Imovel(Integer id, String nome, EnumTipoImovel tipoImovel,
                  EnumStatusImovel statusImovel,
                  Endereco endereco, BigDecimal valorDiaria) {
        this.id = UUID.randomUUID();
        this.nome = nome;
        this.tipoImovel = EnumTipoImovel.APARTAMENTO;
        this.endereco = endereco;
        this.valorDiaria = BigDecimal.ZERO;
        this.statusImovel = EnumStatusImovel.DISPONIVEL;
    }

    public static List<String> getImoveis() {
        List<String> listaImoveis = new ArrayList<>();
        listaImoveis.add("Casa do Morro");
        listaImoveis.add("");
        listaImoveis.add("");
        listaImoveis.add("");
        listaImoveis.add("");
        listaImoveis.add("");
        listaImoveis.add("");
        listaImoveis.add("");
        listaImoveis.add("");
        listaImoveis.add("");

        return listaImoveis;
    }

}