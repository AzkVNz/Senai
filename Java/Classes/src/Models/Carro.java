package Models;

public class Carro extends Veiculo {
    private int numeroDePortas;

    public Carro(String marca, String modelo, int ano, int numeroDePortas) {
        super(marca, modelo, ano);
        this.numeroDePortas = numeroDePortas;
        this.modelo = modelo;
        this.marca = marca;
        this.ano = ano;
    }

    @Override
    public void display() {
        System.out.println("Marca: " + this.marca + "\nModelo: " + this.modelo + "\nAno de fabriação: " + this.ano + "\nNúmero de portas:" +this.numeroDePortas);

    }
}
