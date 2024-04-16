/*
Exercício 4: A Classe Calculadora
1. Implemente uma classe Calculadora que não possui atributos.
2. Adicione métodos estáticos para as quatro operações básicas: adição, subtração,
multiplicação e divisão. Cada método deve aceitar dois parâmetros numéricos e
retornar o resultado da operação.
3. Inclua tratamento de erro no método de divisão para evitar a divisão por zero,
retornando 0 se o denominador for 0 .
 */

public class Calculadora {

    private static double n1;
    private static double n2;

    public Calculadora() {

    }

    public Calculadora(double n1, double n2) {
        this.n1 = n1;
        this.n2 = n2;
    }

    public void adicao() {
        System.out.println("SOMA de " + n1 + " + " + n2 + " é igual a: " + (+n1 + n2));
    }

    public void subtracao() {
        System.out.println("SUBTRAÇÃO de " + n1 + " - " + n2 + " é igual a: " + (+n1 - n2));
    }

    public void multiplicacao() {
        System.out.println("MULTIPLICAÇÃO de " + n1 + " x " + n2 + " é igual a: " + (+n1 * n2));
    }

    public void divisao() {
        if (n2 == 0) {
            System.out.println("Não é possível realizar a operação");
        } else {
            System.out.println("DIVISÃO de " + n1 + " / " + n2 + " é igual a: " + (+n1 / n2));
        }
    }

}
