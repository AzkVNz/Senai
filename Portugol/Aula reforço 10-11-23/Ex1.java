//Faça um programa que peça dois números e imprima o maior deles

package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner imput = new Scanner(System.in);

        System.out.println("Informe dois números");
        //Recebendo os dois valores
        int num1 = imput.nextInt();
        //Variavel para o primeiro valor
        int num2 = imput.nextInt();
        //Variavel para o segundo valor

        if (num1 > num2) {
            //If para comparar se num1 é maior que num2
            int maior = num1;
            System.out.println("O maior numero é:" + maior);
            //Se num1 > for maior que num2, é apresentado
        } else {
            //Caso num1 não seja o maior, o num2 será
            int maior = num2;
            System.out.println("O maior numero é:" + maior);

        }


    }
}
