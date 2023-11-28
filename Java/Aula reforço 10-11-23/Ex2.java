//Faça um programa que peça um valor e mostre na tela se o valor é positivo ou negativo

package com.company;

import java.util.Scanner;

public class Ex2 {

    public static void main(String[] args) {
        Scanner imput = new Scanner(System.in);

        System.out.println("Informe um valor inteiro");
        int valor = imput.nextInt();
        //variavel para receber o valor

        if (valor < 0) {
            //Se valor for menor que 0, o valor sera negativo
            System.out.println("O valor informado é negativo");
        } else {
            //Se ele for maior ou igual, o valor sera positvo
            System.out.println("O valor informado é positivo");
        }
    }

}
