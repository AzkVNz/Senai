import Models.*;

public class Main {
    public static void main(String[] args) {
        Pessoa eu = new Pessoa("Vini", 19, 1.85);
        ContaBancaria conta = new ContaBancaria("9999", "Vinícius");
        Livro livro = new Livro("Harry Potter","JK Rolling", 2000);
        Calculadora calculadora = new Calculadora(0,10);
        Carro carroInfo = new Carro("C","P", 2000, 4);
        carroInfo.display();

    }
}