package SistemaLivraria.PublicoAdulto;

import SistemaLivraria.Livros;

import java.math.BigDecimal;

public class PublicoAdultoLivro extends Livros {
    private boolean isAdulto = true;


    public PublicoAdultoLivro(String nome, int id, BigDecimal preco, String genero, String escritor, String editora) {
        super(nome, id, preco, genero, escritor, editora);
    }

    public boolean isAdulto() {
        return isAdulto;
    }

    public void setAdulto(boolean adulto) {
        isAdulto = adulto;
    }
}
