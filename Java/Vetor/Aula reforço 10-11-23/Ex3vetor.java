//Declare uma lista de 16 posições e troque os 8 primeiros valores pelos 8 últimos e vice-e-versa. Escreva ao final o vetor obtido.

import java.util.Random;

public class Ex3vetor {

    public static void main(String[] args) {

        int vetor[] = new int[16];
        Random random = new Random();

        System.out.println("Vetor normal:");
        for (int i = 0; i <= 15; i++) {
            vetor[i] = random.nextInt(56); ;
            System.out.println(vetor[i]);
        }
        System.out.println("\nVetor invertido:");
        for (int j = 15; j >= 0; j--) {
            System.out.println(vetor[j]);
        }

    }
}
