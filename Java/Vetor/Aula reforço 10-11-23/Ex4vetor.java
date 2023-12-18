import java.util.Scanner;

public class Ex4vetor {

    public static void main(String[] args) {
        Scanner imput = new Scanner(System.in);
        int Vetor[] = new int[20];
        //Inicialize a posição como -1 (indicando que o valor não foi encontrado)
        int posicao = -1;

        //For somente para adicionar valores ao vetor
        for (int i = 0; i < 20; i++) {
            Vetor[i] = i;
        }
        System.out.println("Informe um valor");
        int valor = imput.nextInt();
        //For para contagem do vetor, para comparar
        for (int x = 0; x < 20; x++) {
            //Vai comparar o valor com o vetor
            if (Vetor[x] == valor) {
                posicao = x;
            }

        }
        //Comparando se o valor foi encotrado ou não
        if (posicao != -1) {
            System.out.println("O valor " + valor + " foi encotrado na posição: " + posicao);
        } else {
            System.out.println("O valor " + valor + " não foi encontrado");
        }

    }
}