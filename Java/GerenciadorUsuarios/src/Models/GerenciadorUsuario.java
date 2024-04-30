package Models;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GerenciadorUsuario {
    Scanner imput = new Scanner(System.in);

    private List<Usuario> usuarios = new ArrayList<>();

    public boolean AdicionarUsuario(Usuario usuario) {
        for (int i = 0; i < usuarios.size(); i++) {

            if (usuario.getId().equals(usuarios.get(i).getId())) {
                System.out.println("ID já utilizado");
                return false;
            }
        }
        usuarios.add(usuario);
        System.out.println("Usuario adicionado");
        return true;
    }


}
