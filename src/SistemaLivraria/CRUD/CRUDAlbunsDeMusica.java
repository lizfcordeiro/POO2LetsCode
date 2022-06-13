package SistemaLivraria.CRUD;

import SistemaLivraria.*;

import java.util.List;

public class CRUDAlbunsDeMusica extends Estoque {
    public CRUDAlbunsDeMusica(List<Livros> estoqueLivros, List<Games> estoqueGames, List<Filmes> estoqueFilmes, List<AlbunsDeMusica> estoqueAlbunsDeMusicas, List<Brinquedos> estoqueBrinquedos) {
        super(estoqueLivros, estoqueGames, estoqueFilmes, estoqueAlbunsDeMusicas, estoqueBrinquedos);
    }

    public <T extends Produtos> void criarProduto(T produto) {
        if (produto instanceof AlbunsDeMusica albunsDeMusica) {
            getEstoqueAlbunsDeMusicas().add((AlbunsDeMusica) produto);
        }
    }
    public List<AlbunsDeMusica> lerAlbunsDeMusica() {
        return getEstoqueAlbunsDeMusicas();
    }
    public void encontrarPorId(int id, String tipo){
     if (tipo.equals("ALBUNS_DE_MUSICA")) {
        getEstoqueAlbunsDeMusicas().stream().filter(product -> AlbunsDeMusica.getId() == id);
    }
}
    public void quantidadeAlbunsDeMusica(){
        System.out.println(getEstoqueAlbunsDeMusicas().size());
    }
    public void deletarPorId(int id, Produtos produtos) {
        if (produtos instanceof AlbunsDeMusica) {
            getEstoqueAlbunsDeMusicas().removeIf(product -> AlbunsDeMusica.getId() == id);
        }
    }
}