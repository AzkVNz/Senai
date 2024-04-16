/*
Exercício 1: A Classe Pessoa
1. Crie uma classe chamada Pessoa com os seguintes atributos privados: nome
(String), idade (int) e altura (double).
2. Adicione um construtor que inicialize esses atributos.
3. Implemente métodos públicos para obter (getters) e definir (setters) cada um
dos atributos.
4. Adicione um método falar() que imprime no console uma mensagem que diz:
"Olá, meu nome é [nome] e eu tenho [idade] anos."
 */

public class Pessoa {

    private String nome;
    private int idade;
    private double altura;

    public Pessoa() {

    }

    public Pessoa(String nome, int idade, double altura) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;

    }

    public String getNome() {
        return this.nome;
    }

    public int getIdade() {
        return this.idade;
    }

    public double getAltura() {
        return altura;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void falar(){
        System.out.println("Olá, meu nome é: "+ nome +
                " e eu tenho "+ idade + " anos de idade.");
    }

}


