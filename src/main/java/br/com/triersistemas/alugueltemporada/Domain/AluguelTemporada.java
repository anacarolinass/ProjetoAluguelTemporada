package br.com.triersistemas.alugueltemporada.Domain;

import br.com.triersistemas.alugueltemporada.enuns.EnumTipoImovel;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class AluguelTemporada {

    private static final List<Imovel> imoveisDisponiveisLocacao = new ArrayList<Imovel>();
    private static final List<Hospedes> listaHospedes = new ArrayList<Hospedes>();
    private static final List<Aluguel> listaAlugueis = new ArrayList<Aluguel>();

    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        carregaImoveis();

        do {

            int opcaoMenu = obterOpcaoMenu();

        } while (obterOpcaoMenu() != 0);

    }

    private static void imprimeImoveis() {

        for (Imovel imovel : imoveisDisponiveisLocacao) {
            System.out.println(imovel);
        }
    }

    //IMOVEIS JÁ CADASTRADOS
    private static void carregaImoveis() {

        imoveisDisponiveisLocacao.add(new Imovel(1, "Casa do Morro", EnumTipoImovel.CASA,
                new Endereco("Rua. Idalino Manoel de Carvalho", 100, "Imbituba", "Praia do Rosa"), 120.00));

        imoveisDisponiveisLocacao.add(new Imovel(2, "Casa Paraiso", EnumTipoImovel.CASA,
                new Endereco("Av. Porto Novo", 380, "Imbituba", "Praia do Rosa"), 180.00));

        imoveisDisponiveisLocacao.add(new Imovel(3, "Apartamento Alto Padrão", EnumTipoImovel.APARTAMENTO,
                new Endereco("Av. Porto Novo", 56, "Imbituba", "Praia do Rosa"), 1000.00));

        imoveisDisponiveisLocacao.add(new Imovel(4, "Apartamento Nobre", EnumTipoImovel.APARTAMENTO,
                new Endereco("Rua. Caminho do Rei", 920, "Imbituba", "Praia do Rosa"), 190.00));

        imoveisDisponiveisLocacao.add(new Imovel(5, "Apartamento Palace", EnumTipoImovel.APARTAMENTO,
                new Endereco("Av. Porto Novo", 330, "Imbituba", "Praia do Rosa"), 250.00));

        imoveisDisponiveisLocacao.add(new Imovel(6, "Cabana Sonho do Rosa", EnumTipoImovel.CABANA,
                new Endereco("Rua Beija Flor", 10, "Imbituba", "Praia do Rosa"), 170.00));

        imoveisDisponiveisLocacao.add(new Imovel(7, "Cabana Gauleses", EnumTipoImovel.CABANA,
                new Endereco(" Rua Clemente", 1020, "Imbituba", "Praia do Rosa"), 200.00));


    }

    //OPÇÃO MENU
    public static int obterOpcaoMenu() {
        int menu = 0;

        System.out.println("Escolha a opção desejada:" + "\n");
        System.out.println("[1] Fazer Check-in");
        System.out.println("[2] Consultar Alugueis");
        System.out.println("[3] Fazer Check-out");

        menu = sc.nextInt();

        System.out.println();

        if (menu == 1) {

            opcaoAluguel();
            return menu;

        } else if (menu == 2) {

            consultarAlugueis();

            return menu;

        } else if (menu == 3) {

            fazerCheckout();


        }
        return menu;

    }

    //LISTAR OS HOSPEDES E OS IMOVEIS SELECIONADOS
    private static void consultarAlugueis() {

        System.out.println("=========LISTA DE ALUGUEIS=========");
        System.out.println();

        for (Aluguel aluguel : listaAlugueis) {
            System.out.println(aluguel);
            System.out.println("\n");
        }

    }

    //OPCAO DOS IMOVEIS PARA LOCAÇÃO
    public static void opcaoAluguel() {

        var opcaoEscolhida = 0;


        System.out.println("Qual imovel você deseja alugar? \n");

        imprimeImoveis();

        opcaoEscolhida = sc.nextInt();


        if (opcaoEscolhida <= imoveisDisponiveisLocacao.size()) {

            System.out.println();
            fazerCheckin(opcaoEscolhida - 1);


        } else {
            System.out.println("Opção inválida");
        }

    }

    //REMOVER HOSPEDES
    public static void fazerCheckout() {


        int idHospede = 0;
        for (Hospedes hospedes : listaHospedes) {

            System.out.println("Id: " + (idHospede++));
            System.out.println(hospedes);
            System.out.println();

        }

        System.out.print("Digite o id do hospede que deseja remover: ");
        int codigo = sc.nextInt();
        System.out.println();


        if (listaHospedes.size() >= codigo) {

            listaHospedes.remove(codigo);
            System.out.println("Id: " + codigo + " --> Removido!");

        } else {
            System.out.println("Id " + codigo + " " + "não existe!");
        }
    }


    // CADASTRAR HOSPEDES
    public static void fazerCheckin(int codigoImovelEscolhido) {

        char resposta;

        do {

            System.out.print("==========CADASTRAR HOSPEDES==========\n");
            System.out.println();
            System.out.print("Digite seu nome completo: ");
            var nomeCompleto = sc.next();
            System.out.print("Digite seu cpf: ");
            var cpf = sc.next();
            System.out.print("Digite seu telefone: ");
            var telefone = sc.next();
            System.out.print("Digite sua data de nascimento: ");
            var data = sc.next();
            LocalDate dataNasc = LocalDate.parse(data, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
            System.out.print("Digite a cidade: ");
            var cidade = sc.next();
            System.out.println();


            Hospedes novoHospede = new Hospedes(nomeCompleto, cpf, telefone, dataNasc, cidade);
            listaHospedes.add(novoHospede);


            Imovel imovel = imoveisDisponiveisLocacao.get(codigoImovelEscolhido);


            System.out.print("Quantos dias deseja permanecer no imovel? ");
            int diarias = sc.nextInt();


            Aluguel aluguel = new Aluguel(imovel, novoHospede, diarias);
            System.out.println("Valor total diaria = " + "R$ " + aluguel.getTotal() + " Reais");

            listaAlugueis.add(aluguel);
            System.out.println();
            System.out.print("Continuar Cadastrando --> S/N ? ");
            resposta = sc.next().charAt(0);
            System.out.println();
            System.out.println();

        } while (resposta == 'S' || resposta == 's');

    }
}