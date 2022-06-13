package SistemaLivraria.CRUD;

import SistemaLivraria.*;

import java.util.List;

public class CRUDGames extends Estoque{
    public CRUDGames(List<Livros> estoqueLivros, List<Games> estoqueGames, List<Filmes> estoqueFilmes, List<AlbunsDeMusica> estoqueAlbunsDeMusicas, List<Brinquedos> estoqueBrinquedos) {
        super(estoqueLivros, estoqueGames, estoqueFilmes, estoqueAlbunsDeMusicas, estoqueBrinquedos);
    }
    public <T extends Produtos> void criarProduto(T produto) {
        if (produto instanceof Games games) {
            getEstoqueGames().add((Games) produto);
        }
    }
    public List<Games> lerGames(){
        return getEstoqueGames();
    }
    public void encontrarPorId(int id, String tipo){
        if (tipo.equals("Games")) {
            getEstoqueGames().stream().filter(product -> Games.getId() == id);
        }
    }
    public void quantidadeGames(){
        System.out.println(getEstoqueGames().size());
    }
    public void deletarPorId(int id, Produtos produtos) {
        if (produtos instanceof Games) {
            getEstoqueGames().removeIf(product -> Games.getId() == id);
        }
    }
}