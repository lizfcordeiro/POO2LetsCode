package SistemaLivraria.CRUD;

import SistemaLivraria.*;

import java.util.Collection;
import java.util.List;
import java.util.stream.Stream;

public class crud extends Estoque {

    public crud(List<Livros> estoqueLivros, List<Games> estoqueGames, List<Filmes> estoqueFilmes,
                List<AlbunsDeMusica> estoqueAlbunsDeMusicas, List<Brinquedos> estoqueBrinquedos) {
        super(estoqueLivros, estoqueGames, estoqueFilmes, estoqueAlbunsDeMusicas, estoqueBrinquedos);
    }

    public void mostrarEstoqueGeral() {
        Stream.of(getEstoqueLivros(), getEstoqueBrinquedos(), getEstoqueFilmes(), getEstoqueGames(), getEstoqueAlbunsDeMusicas())
                .flatMap(Collection::stream)
                .toList().forEach(System.out::println);
    }
}