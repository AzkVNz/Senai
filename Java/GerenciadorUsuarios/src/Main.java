import Models.GerenciadorUsuario;
import Models.Usuario;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner imput = new Scanner(System.in);
        GerenciadorUsuario comando = new GerenciadorUsuario();

        System.out.println("Informe a opção desejada:\n1 - Adicionar Usuario\n2 - Lista De Todos Os Usuarios\n3 - Usuario Por ID\n4 - Atualizar Dados De Um Usuario\n5 - Remover Usuario Por ID");
        int escolha = imput.nextInt();


        switch (escolha) {
            case 1:
                String id, nome, email;
                System.out.printf("Informe o ID: ");
                id = imput.nextLine();
                System.out.printf("Informe o seu nome: ");
                nome = imput.nextLine();
                System.out.printf("Informe seu e-mail: ");
                email = imput.nextLine();
                Usuario usuario = new Usuario(id, nome, email);
                comando.AdicionarUsuario(usuario);

                break;
        }

    }
}