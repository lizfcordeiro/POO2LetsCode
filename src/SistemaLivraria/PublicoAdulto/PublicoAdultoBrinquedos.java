package SistemaLivraria.PublicoAdulto;

import SistemaLivraria.Brinquedos;

import java.math.BigDecimal;

public class PublicoAdultoBrinquedos extends Brinquedos {
    private boolean isAdulto = true;

    public PublicoAdultoBrinquedos(String name, int id, BigDecimal preco, String tipo) {
        super(name, id, preco, tipo);
    }

    public boolean isAdulto() {
        return isAdulto;
    }

    public void setAdulto(boolean adulto) {
        isAdulto = adulto;
    }
}
