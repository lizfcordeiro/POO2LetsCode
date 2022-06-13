package SistemaLivraria;

import java.math.BigDecimal;

public class Brinquedos extends Produtos{
    private String tipo;

    public Brinquedos(String name, int id, BigDecimal preco, String tipo) {
        super(name, id, preco);
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
