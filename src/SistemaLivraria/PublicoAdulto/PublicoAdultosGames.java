package SistemaLivraria.PublicoAdulto;

import SistemaLivraria.Games;

import java.math.BigDecimal;

public class PublicoAdultosGames extends Games {
    private boolean isAdulto = true;

    public PublicoAdultosGames(String nome, int id, BigDecimal preco, String genero, String distribuidora, String estudio) {
        super(nome, id, preco, genero, distribuidora, estudio);
    }

    public boolean isAdulto() {
        return isAdulto;
    }

    public void setAdulto(boolean adulto) {
        isAdulto = adulto;
    }
}
