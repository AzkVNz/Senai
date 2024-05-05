package Models;

import java.util.ArrayList;
import java.util.List;

public class GerenciadorDeLivros {
    private List<Livros> ListaDeLivros = new ArrayList<>();

    public boolean AdicionarLivro(Livros livroInformado) {
        for (Livros livro : ListaDeLivros) {
            if (livro.getiSBN().equals(livroInformado.getiSBN())) {
                System.out.println("Não foi possível adicionar o livro, pois já existe um livro com esse ISBN\n");
                return false;
            }
        }
        ListaDeLivros.add(livroInformado);
        System.out.println("Livro adicionado com sucesso\n");
        return true;
    }

    public List<Livros> ObterListaDeLivros() {
        return ListaDeLivros;
    }

    private Livros ObterISBNR(String iSBNparaBusca) {
        for (Livros livros : ListaDeLivros) {
            if (livros.getiSBN().equals(iSBNparaBusca)) {
                return livros;
            }
        }
        return null;
    }

    public boolean AtualizarAutorETitulo(String iSBNparaComparar, String novoTitulo, String novoAutor) {
        Livros atualizarLivro = ObterISBNR(iSBNparaComparar);
        if (atualizarLivro != null) {
            atualizarLivro.setTitulo(novoTitulo);
            atualizarLivro.setAutor(novoAutor);
            System.out.println("Título e autor atualizados!\n");
            return true;
        }
        System.out.println("Não foi possível atualizar, pois o ISBN informado não consta no sistema\n");
        return false;

    }

    public boolean AtualizarSomenteTitulo(String iSBNparaComparar, String novoTitulo) {
        Livros atualizarTitulo = ObterISBNR(iSBNparaComparar);
        if (atualizarTitulo != null) {
            atualizarTitulo.setTitulo(novoTitulo);
            System.out.println("Título atualizado");
            return true;
        }
        System.out.println("Não foi possível atualizar, pois o ISBN informado não consta no sistema\n");
        return false;
    }

    public boolean AtualizarSomenteAutor(String iSBNParaComparar, String novoAutor) {
        Livros atulizarSomenteAutor = ObterISBNR(iSBNParaComparar);
        if (atulizarSomenteAutor != null) {
            atulizarSomenteAutor.setAutor(novoAutor);
            System.out.println("Autor atualizado");
            return true;
        }
        System.out.println("Não foi possível atualizar, pois o ISBN informado não consta no sistema\n");
        return false;
    }

    public boolean ExcluirLivro(String iSBNInformado) {
        Livros excluirLivros = ObterISBNR(iSBNInformado);
        if (excluirLivros != null) {
            ListaDeLivros.removeIf(Livros -> Livros.getiSBN().equals(iSBNInformado));
            System.out.println("livro excluido");
            return true;
        }
        System.out.println("Não foi possível excluir, pois o ISBN informado não consta no sistema\n");
        return false;
    }

}
