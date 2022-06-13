package SistemaLivraria;

import java.math.BigDecimal;
import java.util.List;

public class AlbunsDeMusica extends Produtos{
    private List<String> genero;
    private String musico;
    private List<String> selo;

    public AlbunsDeMusica(String nome, int id, BigDecimal preco, List<String> genero, String musico, List<String> selo) {
        super(nome, id, preco);
        this.genero = genero;
        this.musico = musico;
        this.selo = selo;
    }

    public List<String> getGenero() {
        return genero;
    }

    public void setGenero(List<String> genero) {
        this.genero = genero;
    }

    public String getMusico() {
        return musico;
    }

    public void setMusico(String musico) {
        this.musico = musico;
    }

    public List<String> getSelo() {
        return selo;
    }

    public void setSelo(List<String> selo) {
        this.selo = selo;
    }
}
