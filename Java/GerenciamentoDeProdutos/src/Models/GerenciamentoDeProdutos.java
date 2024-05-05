package Models;

import java.util.ArrayList;
import java.util.List;

public class GerenciamentoDeProdutos {
    private List<Produto> ListaDeProdutos = new ArrayList<>();

    public boolean AdicionarProduto(Produto produtoInformado) {
        for (Produto produto : ListaDeProdutos) {
            if (produto.getCodigo().equals(produtoInformado.getCodigo())) {
                System.out.println("Não foi possível adicionar o produto, cógio já cadastrado");
                return false;
            }

        }
        ListaDeProdutos.add(produtoInformado);
        System.out.println("Produto adicionado");
        return true;
    }

    public List<Produto> ObterListaDeProdutos() {
        return ListaDeProdutos;

    }

    private Produto ObterCodigoProduto(String codigoInformaod) {
        for (Produto produto : ListaDeProdutos) {
            if (produto.getCodigo().equals(codigoInformaod)) {
                return produto;
            }
        }
        return null;
    }

    public boolean AtualizarCategoria(String codigoInformado, String novaCategoria) {
        Produto atualizarCategoria = ObterCodigoProduto(codigoInformado);
        if (atualizarCategoria != null) {
            atualizarCategoria.setCategoria(novaCategoria);
            System.out.println("Atualizado com sucesso");
            return true;
        }
        System.out.println("Não foi possível atualizar, código informado não cadastrado");
        return false;

    }

    public boolean AtualizarPreco(String codigoInformado, double novoPreco) {
        Produto atualizarPreco = ObterCodigoProduto(codigoInformado);
        if (atualizarPreco != null) {
            atualizarPreco.setPreco(novoPreco);
            System.out.println("Atualizado com sucesso\n");
            return true;
        }
        System.out.println("Não foi possível atualizar, código informado não cadastrado\n");
        return false;
    }

    public boolean ExcluirProduto(String codigoInformado) {
        Produto excluirProduto = ObterCodigoProduto(codigoInformado);
        if (excluirProduto != null) {
            ListaDeProdutos.removeIf(Produto -> Produto.getCodigo().equals(codigoInformado));
            System.out.println("Produto excluido");
            return true;
        }
        System.out.println("Não foi possível excluir, código informado não cadastrado");
        return false;
    }

}

