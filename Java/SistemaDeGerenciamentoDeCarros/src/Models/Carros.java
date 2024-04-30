package Models;

public class Carros {
    private String placa;
    private String modelo;
    private String cor;
    private int anoDeFabricacao;

    public Carros(String placa, String modelo, String cor, int anoDeFabricacao) {
        this.placa = placa;
        this.modelo = modelo;
        this.cor = cor;
        this.anoDeFabricacao = anoDeFabricacao;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getAnoDeFabricacao() {
        return anoDeFabricacao;
    }

    public void setAnoDeFabricacao(int anoDeFabricacao) {
        this.anoDeFabricacao = anoDeFabricacao;
    }

    @Override
    public String toString() {
        return "Carros --- " +
                "Placa: " + placa + '\'' +
                ", Modelo: " + modelo + '\'' +
                ", Cor: " + cor + '\'' +
                ", Ano de fabricação: " + anoDeFabricacao +
                '}';
    }
}
