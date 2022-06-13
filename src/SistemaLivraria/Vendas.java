package SistemaLivraria;

import SistemaLivraria.CRUD.*;

public class Vendas implements iVendas{
    protected CaixaRegistradora caixaRegistradora;
    protected CRUDBrinquedos crudBrinquedos;
    protected CRUDFilmes crudFilmes;
    protected CRUDLivro crudLivro;
    protected CRUDAlbunsDeMusica crudAlbunsDeMusica;
    protected CRUDGames crudGames;

    @Override
    public void vendasLivros(double valorProduto, Livros livros) {
        if(crudLivro.getEstoqueLivros().contains(livros)){
            crudLivro.getEstoqueLivros().remove(livros);
            caixaRegistradora.valorDoCaixa(valorProduto);
        }
    }

    @Override
    public void vendasFilmes(double valorProduto, Filmes filmes) {
        if(crudFilmes.getEstoqueFilmes().contains(filmes)){
            crudFilmes.getEstoqueFilmes().remove(filmes);
            caixaRegistradora.valorDoCaixa(valorProduto);
        }
    }

    @Override
    public void vendasGames(double valorProduto, Games games) {
        if(crudGames.getEstoqueGames().contains(games)){
            crudGames.getEstoqueGames().remove(games);
            caixaRegistradora.valorDoCaixa(valorProduto);
        }
    }

    @Override
    public void vendasAlbunsDeMusica(double valorProduto, AlbunsDeMusica albunsDeMusica) {
        if(crudAlbunsDeMusica.getEstoqueAlbunsDeMusicas().contains(albunsDeMusica)){
            crudAlbunsDeMusica.getEstoqueAlbunsDeMusicas().remove(albunsDeMusica);
            caixaRegistradora.valorDoCaixa(valorProduto);
        }
    }

    @Override
    public void vendasBrinquedos(double valorProduto, Brinquedos brinquedos) {
        if(crudBrinquedos.getEstoqueBrinquedos().contains(brinquedos)){
            crudBrinquedos.getEstoqueBrinquedos().remove(brinquedos);
            caixaRegistradora.valorDoCaixa(valorProduto);
        }
    }
}
