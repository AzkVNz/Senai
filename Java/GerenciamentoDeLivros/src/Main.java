import Models.GerenciadorDeLivros;
import Models.Livros;

import javax.xml.transform.Source;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner imput = new Scanner(System.in);
        GerenciadorDeLivros gerenciar = new GerenciadorDeLivros();

        while (true) {

            System.out.println("Informe a opção desejada:");
            System.out.println("1 - Adicionar livro");
            System.out.println("2 - Listar todos os livros");
            System.out.println("3 - Atualizar livro");
            System.out.println("4 - Excluir livro");
            System.out.println("5 - Sair");
            int opcao = imput.nextInt();
            imput.nextLine();

            switch (opcao) {
                case 1:
                    System.out.println("Informe o ISBN do seu livro");
                    String iSBN = imput.nextLine();
                    System.out.println("Informe o título do livro:");
                    String titulo = imput.nextLine();
                    System.out.println("Informe o nome do autor do livro");
                    String autor = imput.nextLine();
                    System.out.println("Informe o ano de publicação");
                    int anoDeLancamento = imput.nextInt();
                    Livros novoLivro = new Livros(iSBN, titulo, autor, anoDeLancamento);

                    if (!gerenciar.AdicionarLivro(novoLivro)) {
                    } else {

                    }
                    break;

                case 2:
                    System.out.println(gerenciar.ObterListaDeLivros());
                    break;

                case 3:
                    System.out.println("Escolha:\n1 - Atualizar título e autor\n2 - Atualizar somente título\n3 - Atualizar somente autor");
                    int escolha = imput.nextInt();
                    imput.nextLine();

                    switch (escolha) {
                        case 1:
                            System.out.println("Informe o ISBNR");
                            String iSBNparaComparar = imput.nextLine();
                            System.out.println("Informe o título");
                            String novoTitulo = imput.nextLine();
                            System.out.println("Informe o autor");
                            String novoAutor = imput.nextLine();
                            gerenciar.AtualizarAutorETitulo(iSBNparaComparar, novoTitulo, novoAutor);
                            break;

                        case 2:

                            System.out.println("Informe o ISBNR");
                            String iSBNparaCompararSomenteTitulo = imput.nextLine();
                            System.out.println("Informe o título");
                            String novoTituloSomentetitulo = imput.nextLine();
                            gerenciar.AtualizarSomenteTitulo(iSBNparaCompararSomenteTitulo, novoTituloSomentetitulo);
                            break;

                        case 3:
                            System.out.println("Informe o ISBNR");
                            String iSBNparaCompararSomenteAutor = imput.nextLine();
                            System.out.println("Informe o autor");
                            String novoAutorSomenteAutor = imput.nextLine();
                            gerenciar.AtualizarSomenteAutor(iSBNparaCompararSomenteAutor, novoAutorSomenteAutor);
                            break;
                    }
                    break;
                case 4:
                    System.out.println("Informe o ISBN:");
                    String iSBNParaComparar = imput.nextLine();
                    gerenciar.ExcluirLivro(iSBNParaComparar);
                    break;

                case 5:
                    imput.close();
                    return;
                default:
                    System.out.println("Opção invalida");

            }


        }


    }
}