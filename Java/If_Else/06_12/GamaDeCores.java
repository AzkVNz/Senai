/*
 * Solicitar o comprimento de onda, e retornar com a cor determinada
 * E caso o comp não bater com nenhuma cor, retornar comp não identificado.
 * Violeta = 380-450
 * Azul = 450-495
 * Verde = 495-570
 * Amarelo = 570-590
 * Laranja = 590-620
 * Vermelho = 620-750
 */

import java.util.Scanner;

public class GamaDeCores {
    public static void main(String[] args) {
        Scanner imput = new Scanner(System.in);
        System.out.println(" ___________________ ");
        System.out.println("| Violeta: 380-450  |");
        System.out.println("| Azul: 450-495     |");
        System.out.println("| Verde: 495-570    |");
        System.out.println("| Amarelo: 570-590  |");
        System.out.println("| Laranja: 590-620  |");
        System.out.println("| Vermelho: 620-750 |");
        System.out.println(" -------------------\n ");
        //Sout para solicitar o comprimento de onda
        System.out.println("Olá! Informe o comprimento de onda: ");
        double nm = imput.nextDouble();

        //Agora farei uma sequencia de if para comparar o valor solicitado a cima com as cores.

        //Enquanto nm for maior ou igual 380 e menor que 450, a cor é violeta.
        if (nm >= 380 && nm < 450) {
            System.out.println("A cor é violeta!");
        }

        //Agora vou continuar seguindo o mesmo padrão do primeiro if.
        if (nm >= 450 && nm < 495) {
            System.out.println("A cor é Azul!");
        }

        if (nm >= 495 && nm < 570) {
            System.out.println("A cor é verde!");
        }

        if (nm >= 570 && nm < 590) {
            System.out.println("A cor é amarelo!");
        }

        if (nm >= 590 && nm < 620) {
            System.out.println("A cor é laranja!");
        }

        if (nm >= 620 && nm < 750) {
            System.out.println("A cor é vermelho!");
        }

        //Nesse caso fiz um if com || para comparar se o comprimento não bate com a tabela.
        if (nm < 380 || nm > 750) {
            System.out.println("O comprimento de onda não faz parte do asprectro visível");
        }
    }
}
