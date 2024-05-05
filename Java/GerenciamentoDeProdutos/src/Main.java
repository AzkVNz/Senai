import Models.GerenciamentoDeProdutos;
import Models.Produto;

import javax.xml.transform.Source;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        GerenciamentoDeProdutos gerenciar = new GerenciamentoDeProdutos();
        Scanner imput = new Scanner(System.in);

        while (true) {

            System.out.println("\nEscolha uma opção\n1 - Adicionar produto\n2 - Listar todos os produtos\n3 - Atualizar Produto\n4 - Excluir produto\n5 - Sair");
            int opcao = imput.nextInt();
            imput.nextLine();
            switch (opcao) {
                case 1:
                    System.out.println("informe o código do produto:");
                    String codigo = imput.nextLine();
                    System.out.println("Informe o nome:");
                    String nome = imput.nextLine();
                    System.out.println("Informe a categoria:");
                    String categoria = imput.nextLine();
                    System.out.println("Informe o preço:");
                    double preco = imput.nextDouble();
                    Produto novoProduto = new Produto(codigo, nome, categoria, preco);
                    imput.nextLine();
                    if (!gerenciar.AdicionarProduto(novoProduto)) {

                    } else {

                    }
                    break;
                case 2:
                    System.out.println(gerenciar.ObterListaDeProdutos());
                    break;

                case 3:
                    System.out.println("Você deseja:\n1 - Atualizar categoria\n2 - Atualizar preço");
                    int escolha = imput.nextInt();
                    imput.nextLine();

                    switch (escolha){
                        case 1:
                            System.out.println("Informe o cógido:");
                            String codigoParaBuscaCategoria = imput.nextLine();
                            System.out.println("Informe a categoria:");
                            String novaCategoria = imput.nextLine();
                            gerenciar.AtualizarCategoria(codigoParaBuscaCategoria, novaCategoria);
                            break;

                        case 2:
                            System.out.println("Informe o código");
                            String codigoParaBuscaPreco = imput.nextLine();
                            System.out.println("Informe o preço");
                            double novoPreco = imput.nextDouble();
                            gerenciar.AtualizarPreco(codigoParaBuscaPreco, novoPreco);
                            break;

                        default:
                            System.out.println("Opção invalida");
                            return;
                    }
                    break;
                case 4:
                    System.out.println("Informe o código para excluir");
                    String codigoParaExcluir = imput.nextLine();
                    gerenciar.ExcluirProduto(codigoParaExcluir);
                    break;

                case 5:
                    imput.close();
                    return;
                default:
                    System.out.println("Invalido");
            }

        }
    }
}