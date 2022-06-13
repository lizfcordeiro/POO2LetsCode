package SistemaLivraria.CRUD;

import SistemaLivraria.*;

import java.util.List;

public class CRUDBrinquedos extends Estoque {
    public CRUDBrinquedos(List<Livros> estoqueLivros, List<Games> estoqueGames, List<Filmes> estoqueFilmes, List<AlbunsDeMusica> estoqueAlbunsDeMusicas, List<Brinquedos> estoqueBrinquedos) {
        super(estoqueLivros, estoqueGames, estoqueFilmes, estoqueAlbunsDeMusicas, estoqueBrinquedos);
    }

    public <T extends Produtos> void criarProduto(T produto) {
        if (produto instanceof Brinquedos brinquedos) {
            getEstoqueBrinquedos().add((Brinquedos) produto);
        }
    }
    public List<Brinquedos> lerBrinquedos(){
        return getEstoqueBrinquedos();
    }
    public void encontrarPorId(int id, String tipo){
        if (tipo.equals("BRINQUEDOS")) {
            getEstoqueBrinquedos().stream().filter(product -> Brinquedos.getId() == id);
        }
    }
    public void quantidadeBrinquedos(){
        System.out.println(getEstoqueBrinquedos().size());
    }
    public void deletarPorId(int id, Produtos produtos) {
        if (produtos instanceof Brinquedos) {
            getEstoqueBrinquedos().removeIf(product -> Brinquedos.getId() == id);
        }
    }
}