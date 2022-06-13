package SistemaLivraria.PublicoAdulto;

import SistemaLivraria.Filmes;

import java.math.BigDecimal;
import java.util.List;

public class PublicoAdultoFilmes extends Filmes {
    private boolean isAdulto = true;

    public PublicoAdultoFilmes(String nome, int id, BigDecimal preco, String genero, List<String> estudio, List<String> directores, List<String> produtores) {
        super(nome, id, preco, genero, estudio, directores, produtores);
    }

    public boolean isAdulto() {
        return isAdulto;
    }

    public void setAdulto(boolean adulto) {
        isAdulto = adulto;
    }
}
