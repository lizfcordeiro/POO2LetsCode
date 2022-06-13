package SistemaLivraria;

import SistemaLivraria.CRUD.*;

public class Vendas implements iVendas{
    protected CaixaRegistradora caixaRegistradora;
    protected CRUDBrinquedos brinquedos;
    protected CRUDFilmes filmes;
    protected CRUDLivro livro;
    protected CRUDAlbunsDeMusica albuns;
    protected CRUDGames game;

    @Override
    public void vendas(double valorProduto, int id, Produtos produtos) {

    }
}
