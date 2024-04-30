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

    public void

}
