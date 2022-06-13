package SistemaLivraria.Caixa;

import SistemaLivraria.*;

public interface iVendas {
    public void vendasLivros(double valorProduto, Livros livros);
    public void vendasFilmes(double valorProduto, Filmes filmes);
    public void vendasGames(double valorProduto, Games games);
    public void vendasAlbunsDeMusica(double valorProduto, AlbunsDeMusica albunsDeMusica);
    public void vendasBrinquedos(double valorProduto, Brinquedos brinquedos);
    public void vendasLivrosAdultos(Livros livros, Documento documento, double valor);
    public void vendasGamesAdultos(Games games, Documento documento, double valor);
    public void vendasFilmesAdultos(Filmes filmes, Documento documento, double valor);
    public void vendasBrinquedosAdultos(Brinquedos brinquedos, Documento documento, double valor);
    public void vendasAlbunsDeMusicaAdultos(AlbunsDeMusica albunsDeMusica, Documento documento, double valor);
    }
