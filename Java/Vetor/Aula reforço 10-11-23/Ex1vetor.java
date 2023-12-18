package com.company;

import java.util.Scanner;

public class Ex1vetor {

    public static void main(String[] args) {
        Scanner imput = new Scanner(System.in);
        int Valores[] = {25,68,156,354,189,789,165,33,897,66,189,369};

        System.out.println("Informe duas posições do indice, ele começa do 0 e vai até 11");
        int n1 = imput.nextInt();
        int n2 = imput.nextInt();

        System.out.println("A soma do índice "+n1+" + "+n2+" é igual a: "+ (Valores[n1] + Valores[n2]));
    }
}

