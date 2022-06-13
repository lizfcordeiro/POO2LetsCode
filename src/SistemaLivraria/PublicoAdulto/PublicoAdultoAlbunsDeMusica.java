package SistemaLivraria.PublicoAdulto;

import SistemaLivraria.AlbunsDeMusica;

import java.math.BigDecimal;
import java.util.List;

public class PublicoAdultoAlbunsDeMusica extends AlbunsDeMusica {
    private boolean isAdulto = true;

    public PublicoAdultoAlbunsDeMusica(String nome, int id, BigDecimal preco, List<String> genero, String musico, List<String> selo) {
        super(nome, id, preco, genero, musico, selo);
    }

    public boolean isAdulto() {
        return isAdulto;
    }

    public void setAdulto(boolean adulto) {
        isAdulto = adulto;
    }
}
