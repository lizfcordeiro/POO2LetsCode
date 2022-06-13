package SistemaLivraria;

import java.math.BigDecimal;
import java.util.List;

public class Filmes extends Produtos{
    private String genero;
    private List<String> estudio;
    private List<String> directores;
    private List<String> produtores;

    public Filmes(String nome, int id, BigDecimal preco, String genero, List<String> estudio, List<String> directores, List<String> produtores) {
        super(nome, id, preco);
        this.genero = genero;
        this.estudio = estudio;
        this.directores = directores;
        this.produtores = produtores;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public List<String> getEstudio() {
        return estudio;
    }

    public void setEstudio(List<String> estudio) {
        this.estudio = estudio;
    }

    public List<String> getDirectores() {
        return directores;
    }

    public void setDirectores(List<String> directores) {
        this.directores = directores;
    }

    public List<String> getProdutores() {
        return produtores;
    }

    public void setProdutores(List<String> produtores) {
        this.produtores = produtores;
    }
}
