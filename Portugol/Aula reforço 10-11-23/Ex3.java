//Faça um programa que verifique se uma letra digitada é “F” ou “M”. Conforme a letra escrever: F – Feminino, M- Masculino, Sexo inválido.

package com.company;

import java.util.Scanner;

public class Ex4 {

    public static void main(String[] args) {
        Scanner imput = new Scanner(System.in);
        System.out.println("Informe seu sexo:\nF = feminino\nM = masculino");
        String letra = imput.nextLine().toUpperCase();
        //String com UpperCase para sempre receber a letra em maiúscula
        if (letra.equals("F")) {
            //Caso seja igual a F
            System.out.println("Sexo feminino");
        } else if (letra.equals("M")) {
            //Caso seja igual a M
            System.out.println("Sexo masculino");
        } else {
            //Se não for nenhum dos informados
            System.out.println("Sexo inválido");
        }

    }
}
