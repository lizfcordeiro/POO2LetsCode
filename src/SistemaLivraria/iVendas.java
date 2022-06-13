package SistemaLivraria;

public interface iVendas {
    public void vendasLivros(double valorProduto, Livros livros);
    public void vendasFilmes(double valorProduto, Filmes filmes);
    public void vendasGames(double valorProduto, Games games);
    public void vendasAlbunsDeMusica(double valorProduto, AlbunsDeMusica albunsDeMusica);
    public void vendasBrinquedos(double valorProduto, Brinquedos brinquedos);

    }
