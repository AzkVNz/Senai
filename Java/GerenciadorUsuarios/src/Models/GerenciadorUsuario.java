package Models;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GerenciadorUsuario {
    Scanner imput = new Scanner(System.in);

    private List<Usuario> usuarios = new ArrayList<>();

    public void AdicionarUsuario(Usuario usuario){
        for(int i = 0; i < usuarios.size(); i++){

            if (usuario.getId().equals(usuarios.get(i).getId())){
                System.out.println("ID já utilizado");
                return;
            }
        }
            System.out.println();
    }


}
