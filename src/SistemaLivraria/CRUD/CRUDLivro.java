package SistemaLivraria.CRUD;

import SistemaLivraria.*;

import java.util.List;

public class CRUDLivro extends Estoque {
    public CRUDLivro(List<Livros> estoqueLivros, List<Games> estoqueGames, List<Filmes> estoqueFilmes, List<AlbunsDeMusica> estoqueAlbunsDeMusicas, List<Brinquedos> estoqueBrinquedos) {
        super(estoqueLivros, estoqueGames, estoqueFilmes, estoqueAlbunsDeMusicas, estoqueBrinquedos);
    }

    public <T extends Produtos> void criarProduto(T produto) {
        if (produto instanceof Livros livro) {
            getEstoqueLivros().add((Livros) produto);
        }
    }

    public List<Livros> lerLivros() {
        return getEstoqueLivros();
    }

    public void encontrarPorId(int id, Produtos produtos) {
        if (produtos instanceof Livros) {
            getEstoqueLivros().stream().filter(product -> Livros.getId() == id).toString();
        }
    }

    public void quantidadeLivros() {
        System.out.println(getEstoqueLivros().size());
    }

    public void deletarPorId(int id, Produtos produtos) {
        if (produtos instanceof Livros) {
            getEstoqueLivros().removeIf(product -> Livros.getId() == id);
        }
    }
}