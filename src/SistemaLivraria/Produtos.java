package SistemaLivraria;

import java.math.BigDecimal;

public class Produtos {
    private String nome;
    private static int id;
    private BigDecimal preco;

    public Produtos(String nome, int id, BigDecimal preco) {
        this.nome = nome;
        this.id = id;
        this.preco = preco;
    }

    public Produtos() {

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public static int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public BigDecimal getPreco() {
        return preco;
    }

    public void setPreco(BigDecimal preco) {
        this.preco = preco;
    }

}
