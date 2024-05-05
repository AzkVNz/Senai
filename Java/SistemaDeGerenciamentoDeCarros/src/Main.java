import Models.Carros;
import Models.GerenciadorDeCarros;

import javax.sound.midi.Soundbank;
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

                    if (!gerenciar.adicionarCarro(novoCarro)) {
                        System.out.println("Não foi possível adicionar seus dados, já existe um carro com essa placa!\n");
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
                    System.out.println("Informe a placa para procurar o carro:");
                    String placaParaLocalizacao = imput.nextLine();
                    if(gerenciar.CompararPlaca(placaParaLocalizacao)){
                        break;
                    }
                    System.out.println(gerenciar.ObterCarroPorPlaca(placaParaLocalizacao));
                    break;

                case 4:
                    System.out.println("Você deseja\n1 - Atualizar o modelo e a cor\n2 - Apenas o modelo\n3 - Apenas a cor");
                    int escolha = imput.nextInt();
                    imput.nextLine();

                    switch (escolha) {
                        case 1:
                            System.out.println("Informe a placa para poder atualizar a cor e modelo:");
                            String placaParaProcurar = imput.nextLine();
                            if (gerenciar.CompararPlaca(placaParaProcurar) == true) {
                                break;
                            }
                            System.out.println("Nova cor:");
                            String novaCor = imput.nextLine();
                            System.out.println("Novo modelo");
                            String novoModelo = imput.nextLine();
                            gerenciar.AtualizarModeloECor(placaParaProcurar, novaCor, novoModelo);
                            break;

                        case 2:
                            System.out.println("Informe a placa para poder atualizar a cor");
                            String placaParaProcura2 = imput.nextLine();
                            if (gerenciar.CompararPlaca(placaParaProcura2) == true) {
                                break;
                            }
                            System.out.println("Informe a nova cor");
                            String novaCor2 = imput.nextLine();
                            gerenciar.AtualizarCor(placaParaProcura2, novaCor2);
                            break;

                        case 3:
                            System.out.println("Informe a placa para poder atualizar a cor");
                            String placaParaProcura3 = imput.nextLine();
                            if (gerenciar.CompararPlaca(placaParaProcura3) == true) {
                                break;
                            }
                            System.out.println("Informe o novo modelo:");
                            String novoModelo2 = imput.nextLine();
                            gerenciar.AtualizarModelo(placaParaProcura3, novoModelo2);
                            break;
                    }

                    break;

                case 5:
                    System.out.println("Informe a placa do carro para poder excluir:");
                    String placaParaExcluir = imput.nextLine();
                    gerenciar.ExluirCarroPorId(placaParaExcluir);
                    break;


                case 6:
                    imput.close();
                    return;
                default:
                    System.out.println("Opção invalida");
            }


        }


    }


}