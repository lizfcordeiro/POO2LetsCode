package SistemaLivraria;

import java.math.BigDecimal;

public class Games extends Produtos{
    private String genero;
    private String distribuidora;
    private String estudio;

    public Games(String nome, int id, BigDecimal preco, String genero, String distribuidora, String estudio) {
        super(nome, id, preco);
        this.genero = genero;
        this.distribuidora = distribuidora;
        this.estudio = estudio;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getDistribuidora() {
        return distribuidora;
    }

    public void setDistribuidora(String distribuidora) {
        this.distribuidora = distribuidora;
    }

    public String getEstudio() {
        return estudio;
    }

    public void setEstudio(String estudio) {
        this.estudio = estudio;
    }
}
