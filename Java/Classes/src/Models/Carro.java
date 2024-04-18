package Models;

public class Carro extends Veiculo {
    private int numeroDePortas;

    public Carro(String marca, String modelo, int ano, int numeroDePortas) {
        super(marca, modelo, ano);
        this.numeroDePortas = numeroDePortas;
    }

    @Override
    public void display() {
        System.out.println("Marca: " + marca + "\nModelo: " + modelo + "\nAno de fabriação: " + ano + "\nNúmero de portas:");

    }
}
