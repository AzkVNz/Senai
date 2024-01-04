/*
 *As organizações Viva Bem resolveram dar um aumento de salário aos seus
 *colaboradores e lhe contrataram para desenvolver o programa que calcula os
 *reajustes.
 *Faça um programa que recebe o salário de um colaborador e o reajuste
 *segundo o seguinte critério, baseado no salário atual:
 *❑ Salários até RS 280,00 (incluindo): aumento de 20%;
 *❑ Salários entre RS 280,00 e RS 700,00: aumento de 15%;
 *❑ Salários entre RS 700,00 e RS 1.500,00: aumento de 10%;
 *❑ Salários de RS 1500,00 em diante: aumento de 5% Após o aumento ser
 *realizado;
 *Informe na tela os seguintes dados:
 *✔ O salário antes do reajuste;
 *✔ O percentual de aumento aplicado;
 *✔ O valor do aumento;
 *✔ O novo salário, após o aumento
 */

import java.util.Scanner;

public class ReajusteSalarial {
    public static void main(String[] args) {
        Scanner imput = new Scanner(System.in);
        //Solicito o salario
        System.out.print("Olá! Informe seu salario:");
        //Armazeno o valor dentro de uma var double
        double salario = imput.nextDouble();

        //Se o salario for menor que 280 ele joga para o primeiro if
        if (salario < 280) {
            //Aqui eu só multipliquei o salario por 0.20, o mesmo seria se fosse 50%, seria por exemplo: 280 * 0.50.
            System.out.println("\nSeu salario antes do reajuste é de " + salario + ", você recebeu uma porcentagem de 20% , " + salario * 0.20 + " a mais, no final seu salario ficara " + (salario * 0.20 + salario));
        }
        //A lógica vai ser a mesma para todas as outras, mas com a % diferente, enquanto o salario for maior e igual a 280 e menor que 700, ele executa, e assim para todos os outros
        else if (salario >= 280 && salario < 700) {
            System.out.println("\nSeu salario antes do reajuste é de " + salario + ", você recebeu uma porcentagem de 15% , " + salario * 0.15 + " a mais, no final seu salario ficara " + (salario * 0.15 + salario));
        } else if (salario >= 700 && salario < 1500) {
            System.out.println("\nSeu salario antes do reajuste é de " + salario + ", você recebeu uma porcentagem de 10% , " + salario * 0.10 + " a mais, no final seu salario ficara " + (salario * 0.10 + salario));
        } else if (salario >= 1500) {
            System.out.println("\nSeu salario antes do reajuste é de " + salario + ", você recebeu uma porcentagem de 5% , " + salario * 0.05 + " a mais, no final seu salario ficara " + (salario * 0.05 + salario));
        }
    }
}
