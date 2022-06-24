package br.com.triersistemas.alugueltemporada.domain;

import br.com.triersistemas.alugueltemporada.enuns.EnumStatusImovel;
import br.com.triersistemas.alugueltemporada.enuns.EnumTipoImovel;
import lombok.Getter;

import java.math.BigDecimal;
import java.util.Optional;
import java.util.UUID;


@Getter
public class Imovel {

    private UUID id;
    private String nome;
    private EnumTipoImovel tipoImovel;

    private EnumStatusImovel statusImovel;
    private Endereco endereco;

    private BigDecimal valorDiaria;

    public Imovel() {
        this.id = UUID.randomUUID();


    }

    public Imovel(final String nome, final EnumTipoImovel tipoImovel,
                  final EnumStatusImovel statusImovel, final Endereco endereco,
                  final BigDecimal valorDiaria) {
        this();
        this.nome = nome;
        this.tipoImovel = EnumTipoImovel.CASA;
        this.statusImovel = EnumStatusImovel.DISPONIVEL;
        this.endereco = endereco;
        this.valorDiaria = valorDiaria;
    }

    public void imoveisCadastrado() {

        new Imovel("Casa do Morro", EnumTipoImovel.CASA, EnumStatusImovel.DISPONIVEL,
                new Endereco("Rua. Idalino Manoel de Carvalho", 100, "Imbituba", "Praia do Rosa"), BigDecimal.valueOf(120.00));
        new Imovel("Casa Paraiso", EnumTipoImovel.CASA, EnumStatusImovel.DISPONIVEL,
                new Endereco("Av. Porto Novo", 380, "Imbituba", "Praia do Rosa"), BigDecimal.valueOf(180.00));
        new Imovel("Apartamento Alto Padrão", EnumTipoImovel.APARTAMENTO, EnumStatusImovel.DISPONIVEL,
                new Endereco("Av. Porto Novo", 56, "Imbituba", "Praia do Rosa"), BigDecimal.valueOf(1100.00));
        new Imovel("Apartamento Nobre", EnumTipoImovel.APARTAMENTO, EnumStatusImovel.DISPONIVEL,
                new Endereco("Rua. Caminho do Rei", 920, "Imbituba", "Praia do Rosa"), BigDecimal.valueOf(580.00));
        new Imovel("Apartamento Palace", EnumTipoImovel.APARTAMENTO, EnumStatusImovel.DISPONIVEL,
                new Endereco("Av. Porto Novo", 330, "Imbituba", "Praia do Rosa"), BigDecimal.valueOf(300.00));
        new Imovel("Cabana Sonho do Rosa", EnumTipoImovel.CABANA, EnumStatusImovel.DISPONIVEL,
                new Endereco("Rua Beija Flor", 10, "Imbituba", "Praia do Rosa"), BigDecimal.valueOf(170.00));
        new Imovel("Cabana Gauleses", EnumTipoImovel.CABANA, EnumStatusImovel.DISPONIVEL,
                new Endereco("Rua Clemente", 1020, "Imbituba", "Praia do Rosa"), BigDecimal.valueOf(150.00));


    }

    public Imovel editar(final String nome, final EnumTipoImovel tipoImovel,
                         final EnumStatusImovel statusImovel, final Endereco endereco,
                         final BigDecimal valorDiaria) {
        this.nome = nome;
        this.tipoImovel = EnumTipoImovel.CASA;
        this.statusImovel = EnumStatusImovel.DISPONIVEL;
        this.endereco = endereco;
        this.valorDiaria = valorDiaria;
        return this;
    }

}
