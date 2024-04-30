import Models.Carros;
import Models.GerenciadorDeCarros;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner imput = new Scanner(System.in);
        GerenciadorDeCarros gerenciar = new GerenciadorDeCarros();

        while (true) {
            System.out.printf("Escolha uma opção:\n");
            System.out.println("1. Adicionar carro");
            System.out.println("2. Listar Todos os carros");
            System.out.println("3. Localizar carro por placa");
            System.out.println("4. Atualizar carro");
            System.out.println("5. Remover carro");
            System.out.println("6. Sair");
            int opcao = imput.nextInt();
            imput.nextLine();

            switch (opcao) {
                case 1:
                    System.out.println("Placa:");
                    String placa = imput.nextLine();
                    System.out.println("Modelo:");
                    String modelo = imput.nextLine();
                    System.out.println("Cor:");
                    String cor = imput.nextLine();
                    System.out.println("Ano de fabricação:");
                    int anoDeFabricacao = imput.nextInt();
                    Carros novoCarro = new Carros(placa, modelo, cor, anoDeFabricacao);
                    imput.nextLine();

                    if (!gerenciar.adicionarCarro(novoCarro)) {
                        System.out.println("Já existe um carro com essa placa!\n");
                    } else {
                        System.out.println("Carro adicionado!\n");
                    }
                    break;

                case 2:
                    System.out.println("Lista de todos os carros cadastrados:");
                    List<Carros> ListaDeCarros = gerenciar.ObterListaDeCarros();
                    ListaDeCarros.forEach(System.out::println);
                    break;

                case 3:
                    System.out.printf("Você deseja\n1 - Atualizar o modelo e a cor\n2 - Apenas o modelo\n3 - Apenas a cor");
                    int escolha = imput.nextInt();

                    switch (escolha){
                        case 1:
                            System.out.printf("Informe a placa para poder atualizar a cor e modelo:");
                            String placaParaAtualizar = imput.nextLine();
                            System.out.printf("Nova cor:");
                            String novaCor = imput.nextLine();
                            System.out.printf("Novo modelo");
                            String novoModelo = imput.nextLine();
                            gerenciar
                    }
            }


        }


    }


}