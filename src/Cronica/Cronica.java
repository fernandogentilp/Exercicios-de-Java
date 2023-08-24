package Cronica;

public class Cronica {
    private String titulo;

    private String texto;

    private String autor;

    private int dataCriacao;


    public void cadastrarCronica(String titulo, String texto, String autor, int dataCriacao) {
        this.titulo = titulo;
        this.texto = texto;
        this.autor = autor;
        this.dataCriacao = dataCriacao;
    }



    public void cadastrarCronica(String titulo, String texto, int data) {
        this.titulo = titulo;

        this.texto = texto;

        this.dataCriacao = data;

        this.autor = "Anônimo";
    }

    public String listarCronicas() {

        return this.titulo + "\n" + this.texto + "\n" + this.dataCriacao + "\n" + this.autor;
    }


}

