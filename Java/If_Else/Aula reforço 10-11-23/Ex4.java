//Faça um programa que verifique se uma letra digitada é vogal ou consoante.

package com.company;

import java.util.Scanner;

public class Ex4s {

    public static void main(String[] args) {
        Scanner imput = new Scanner(System.in);
        System.out.println("Informe uma letra:");
        String letra = imput.nextLine().toUpperCase();
        //Variavel string pra poder receber a letra, e o UpperCase para sempre ser maiúscula
        if (letra.equals("A") || letra.equals("E") || letra.equals("I") || letra.equals("O") || letra.equals("U")) {
            //If para poder verificar se é vogal
            System.out.println("A letra informada é uma vogal");
        } else {
            //Caso não seja vogal
            System.out.println("A letra informada é uma consoante");
        }
    }
}
