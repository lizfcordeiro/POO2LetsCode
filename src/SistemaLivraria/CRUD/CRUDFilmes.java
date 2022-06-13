package SistemaLivraria.CRUD;

import SistemaLivraria.*;

import java.util.List;

public class CRUDFilmes extends Estoque {
    public CRUDFilmes(List<Livros> estoqueLivros, List<Games> estoqueGames, List<Filmes> estoqueFilmes, List<AlbunsDeMusica> estoqueAlbunsDeMusicas, List<Brinquedos> estoqueBrinquedos) {
        super(estoqueLivros, estoqueGames, estoqueFilmes, estoqueAlbunsDeMusicas, estoqueBrinquedos);
    }

    public <T extends Produtos> void criarProduto(T produto) {
         if (produto instanceof Filmes filmes) {
            getEstoqueFilmes().add((Filmes) produto);
        }
    }
    public List<Filmes> lerFilmes(){
        return getEstoqueFilmes();
    }
    public void encontrarPorId(int id, String tipo){
        if (tipo.equals("FILMES")) {
            getEstoqueFilmes().stream().filter(product -> Filmes.getId() == id);
        }
    }
    public void quantidadeFilmes(){
        System.out.println(getEstoqueFilmes().size());
    }
    public void deletarPorId(int id, Produtos produtos) {
        if (produtos instanceof Filmes) {
            getEstoqueFilmes().removeIf(product -> Filmes.getId() == id);
        }
    }
}