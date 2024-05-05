package Models;

public class Livros {

    private String iSBN;
    private String titulo;
    private String autor;
    private int anoDePublicacao;

    public Livros(String iSBN, String titulo, String autor, int anoDePublicacao) {
        this.iSBN = iSBN;
        this.titulo = titulo;
        this.autor = autor;
        this.anoDePublicacao = anoDePublicacao;
    }

    public String getiSBN() {
        return iSBN;
    }

    public void setiSBN(String iSBN) {
        this.iSBN = iSBN;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAnoDePublicacao() {
        return anoDePublicacao;
    }

    public void setAnoDePublicacao(int anoDePublicacao) {
        this.anoDePublicacao = anoDePublicacao;
    }

    @Override
    public String toString() {
        return "ISBN: " + iSBN + " ---" +
                " Titulo: " + titulo + " ---" +
                " Autor: " + autor + " ---" +
                " Ano de Publicação: " + anoDePublicacao + "\n";
    }
}


