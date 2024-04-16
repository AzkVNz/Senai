/*
Exercício 2: A Classe ContaBancaria
1. Defina uma classe ContaBancaria com os atributos privados: numeroDaConta
(String), nomeDoTitular (String) e saldo (double).
2. Crie um construtor para inicializar os atributos numeroDaConta e nomeDoTitular .
O saldo inicial deve ser 0.
3. Implemente um método depositar(double valor) que aumenta o saldo da
conta.
4. Implemente um método sacar(double valor) que diminui o saldo da conta,
mas não permite que o saldo fique negativo. Se a operação não puder ser
realizada, imprima uma mensagem de erro.
5. Adicione um método imprimirExtrato() que mostra o nome do titular, o
número da conta e o saldo atual.
 */

public class ContaBancaria {

    private String nomeDaConta;
    private String nomeDoTitular;
    private double saldo;

    public ContaBancaria() {

    }

    public ContaBancaria(String nomeDaConta, String nomeDoTitular) {
        this.nomeDaConta = nomeDaConta;
        this.nomeDoTitular = nomeDoTitular;
        this.saldo = 0;
    }

    public String getNomeDoTitular() {
        return nomeDoTitular;
    }

    public String getNomeDaConta() {
        return nomeDaConta;
    }

    public double getSaldo() {
        return saldo;
    }


    public void setNomeDoTitular(String nomeDoTitular) {
        this.nomeDoTitular = nomeDoTitular;
    }


    public void sacar(double saldo) {
        if (this.saldo < saldo) {
            System.out.println("Valor insuficiente");
        } else if (this.saldo == 0) {

            System.out.println("Não a nada na conta");
        } else {
            System.out.println("Valor de " + saldo + " sacado");
            this.saldo = this.saldo - saldo;
        }

    }

    public void depositar(double saldo) {
        this.saldo = this.saldo + saldo;
    }

    public void imprimirExtrato() {
        System.out.println("Conta número: " + nomeDaConta + " Nome do titular: " + nomeDoTitular + " Saldo: " + saldo);
    }
}
