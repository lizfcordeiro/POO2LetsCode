package SistemaLivraria;

import java.math.BigDecimal;

public class Livros extends Produtos{
    private String genero;
    private String escritor;
    private String editora;

    public Livros(String nome, int id, BigDecimal preco, String genero, String escritor, String editora) {
        super(nome, id, preco);
        this.genero = genero;
        this.escritor = escritor;
        this.editora = editora;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getEscritor() {
        return escritor;
    }

    public void setEscritor(String escritor) {
        this.escritor = escritor;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }
}
