/*
 * Faça um programa que pergunte em que turno você estuda. Peça
 * para digitar
 * ● M - matutino
 * ● V - vespertino
 * ● N - noturno
 * Imprima a mensagem:
 * ● “Bom dia!”
 * ● “Boa Tarde!”
 * ● “Boa Noite”
 * ou “Valor inválido”, conforme o caso
 */

import java.util.Scanner;

public class TurnoQueEstuda {
    public static void main(String[] args) {
        Scanner imput = new Scanner(System.in);

        //Solicito para informar o turno
        System.out.println("Informe o turno que você estuda:\n● M - matutino\n● V - vespertino\n● N - noturno");
        //Jogo para a variavel turno
        char turno = imput.next().charAt(0);
        //Aqui uso o toUpperCase para a letra sempre ser maiscúlo, para ser mais fácil para comparar
        turno = Character.toUpperCase(turno);

        //Sequencia de if e else if para comparar a letra.
        if (turno == 'M') {
            System.out.println("Bom dia!");
        } else if (turno == 'V') {
            System.out.println("Boa tarde!");
        } else if (turno == 'N') {
            System.out.println("Boa noite!");
        } else {
            System.out.println("Turno não informado");
        }
    }
}
