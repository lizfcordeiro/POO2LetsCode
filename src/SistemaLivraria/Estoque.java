package SistemaLivraria;

import java.util.ArrayList;
import java.util.List;

public abstract class Estoque{
  private List<Livros> estoqueLivros = new ArrayList<>();
  private List<Games> estoqueGames = new ArrayList<>();
  private List<Filmes> estoqueFilmes = new ArrayList<>();
  private List<AlbunsDeMusica> estoqueAlbunsDeMusicas = new ArrayList<>();
  private List<Brinquedos> estoqueBrinquedos = new ArrayList<>();

    public Estoque(List<Livros> estoqueLivros, List<Games> estoqueGames, List<Filmes> estoqueFilmes, List<AlbunsDeMusica> estoqueAlbunsDeMusicas, List<Brinquedos> estoqueBrinquedos) {
        this.estoqueLivros = estoqueLivros;
        this.estoqueGames = estoqueGames;
        this.estoqueFilmes = estoqueFilmes;
        this.estoqueAlbunsDeMusicas = estoqueAlbunsDeMusicas;
        this.estoqueBrinquedos = estoqueBrinquedos;
    }

    public List<Livros> getEstoqueLivros() {
        return estoqueLivros;
    }

    public void setEstoqueLivros(List<Livros> estoqueLivros) {
        this.estoqueLivros = estoqueLivros;
    }

    public List<Games> getEstoqueGames() {
        return estoqueGames;
    }

    public void setEstoqueGames(List<Games> estoqueGames) {
        this.estoqueGames = estoqueGames;
    }

    public List<Filmes> getEstoqueFilmes() {
        return estoqueFilmes;
    }

    public void setEstoqueFilmes(List<Filmes> estoqueFilmes) {
        this.estoqueFilmes = estoqueFilmes;
    }

    public List<AlbunsDeMusica> getEstoqueAlbunsDeMusicas() {
        return estoqueAlbunsDeMusicas;
    }

    public void setEstoqueAlbunsDeMusicas(List<AlbunsDeMusica> estoqueAlbunsDeMusicas) {
        this.estoqueAlbunsDeMusicas = estoqueAlbunsDeMusicas;
    }

    public List<Brinquedos> getEstoqueBrinquedos() {
        return estoqueBrinquedos;
    }

    public void setEstoqueBrinquedos(List<Brinquedos> estoqueBrinquedos) {
        this.estoqueBrinquedos = estoqueBrinquedos;
    }
}
