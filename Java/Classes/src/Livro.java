/*
Exercício 3: A Classe Livro
1. Crie uma classe Livro com os atributos: titulo (String), autor (String),
anoDePublicacao (int) e estaEmprestado (boolean).
2. Adicione um construtor para inicializar todos os atributos exceto
estaEmprestado , que deve ser inicializado como false .
3. Implemente métodos para emprestar e devolver o livro, alterando o estado de
estaEmprestado conforme necessário. Se alguém tentar emprestar um livro já
emprestado, deve ser exibida uma mensagem de erro.
4. Crie um método imprimirInformacoes() que mostra todas as informações do
livro.
 */

public class Livro {
    private String titulo;
    private String autor;
    private int anoDePubliacao;

    private boolean estaEmprestado;

    public Livro(String titulo, String autor, int anoDePubliacao) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoDePubliacao = anoDePubliacao;
        this.estaEmprestado = false;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getAnoDePubliacao() {
        return anoDePubliacao;
    }

    public boolean isEstaEmprestado() {
        return estaEmprestado;
    }

    public void pegar() {
        if (this.estaEmprestado == false) {
            System.out.println("O livros está emprestado");
        } else {
            System.out.println("Cuidado com o livro e boa leitura ;)");
        }
    }

    public void devolver() {
        this.estaEmprestado = true;

    }

    public void situacao() {
        if (this.estaEmprestado == false) {
            System.out.println("O livro está cupado");
        } else {
            System.out.println("O livro está livre");
        }
    }

    public void imprimirInformacoes() {
        System.out.printf("Nome do livro: " + titulo + "| Nome do autor: " + autor + "| Ano de publicação: " + anoDePubliacao + " | ");
        situacao();
    }

}


