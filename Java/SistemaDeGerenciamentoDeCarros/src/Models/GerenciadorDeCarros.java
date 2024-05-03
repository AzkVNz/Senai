package Models;

import java.util.ArrayList;
import java.util.List;

public class GerenciadorDeCarros {
    private List<Carros> ListaDeCarros = new ArrayList<>();

    public boolean adicionarCarro(Carros carros) {
        for (Carros car : ListaDeCarros) {
            if (car.getPlaca().equals(carros.getPlaca())) {
                return false;
            }

        }
        ListaDeCarros.add(carros);
        return true;
    }

    public List<Carros> ObterListaDeCarros() {
        return ListaDeCarros;
    }


    private Carros ObterPlaca(String placaFornecidaParaBusca) {
        for (Carros carros : ListaDeCarros) {
            if (carros.getPlaca().equals(placaFornecidaParaBusca)) {
                return carros;
            }
        }
        return null;
    }

    public Carros ObterCarroPorPlaca(String placaParaLocalizacao) {
        for (Carros carros : ListaDeCarros) {
            if (carros.getPlaca().equals(placaParaLocalizacao)) {
                return carros;
            }
        }
        return null;
    }


    public boolean CompararPlaca(String placaParaComparar) {
        for (Carros carros : ListaDeCarros) {
            if (carros.getPlaca().equals(placaParaComparar)) {
                return false;
            }
        }
        return true;
    }


    public void AtualizarModeloECor(String placaParaProcurar, String novaCor, String novoModelo) {
        Carros atualizarModeloECor = ObterPlaca(placaParaProcurar);
        if (atualizarModeloECor != null) {
            atualizarModeloECor.setCor(novaCor);
            atualizarModeloECor.setModelo(novoModelo);
            System.out.println("Cor e modelo atualizados!");

        } else {
            System.out.println("Essa placa não existe no sistema!");
        }

    }

    public void AtualizarCor(String placaParaProcura2, String novaCor2) {
        Carros atualizarCor = ObterPlaca(placaParaProcura2);
        if (atualizarCor != null) {
            atualizarCor.setCor(novaCor2);
            System.out.println("Cor atualizada!");
        } else {
            System.out.println("Essa placa não existe no sistema!");
        }

    }

    public void AtualizarModelo(String placaParaProcura3, String novoModelo2) {
        Carros atualizarModelo = ObterPlaca(placaParaProcura3);
        if (atualizarModelo != null) {
            atualizarModelo.setModelo(novoModelo2);
            System.out.println("Modelo atualizado!");
        } else {
            System.out.println("Essa placa não existe no sistema!");
        }
    }
}

