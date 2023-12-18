/*Faça um programa para a leitura de duas notas parciais de um aluno.

1 - A mensagem “Aprovado”, se a média alcançada for maior ou igual a sete;
2 - A mensagem “Aprovado com Distinção”, se a média for igual a dez;
3 - A mensagem “Reprovado” se a média for menor de do que sete
 */

package com.company;

import java.util.Scanner;

public class Ex5 {

    public static void main(String[] args) {
        Scanner imput = new Scanner(System.in);
        System.out.println("Informe as duas notas do aluno");
        double n1 = imput.nextDouble();
        //Variavel para armazenar o primeiro valor
        double n2 = imput.nextDouble();
        //Variavel para armazenar o segundo valor

        if ((n1 + n2) / 2 == 10) {
           /*Se a soma das duas notas divididas por 2 for igual a 10
           (n1 + n2 /2), ele apresentar aluno aprovado com distinção
            */
            System.out.println("Aluno aprovado com distinção, parabéns");
        } else if ((n1 + n2) / 2 >= 7) {
            //O mesmo serve para o else if
            System.out.println("Aluno aprovado");
        } else {
            //Se for menor que 7
            System.out.println("Aluno reprovaod");
        }
    }
}




