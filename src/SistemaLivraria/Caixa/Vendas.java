package SistemaLivraria.Caixa;

import SistemaLivraria.*;
import SistemaLivraria.CRUD.*;
import SistemaLivraria.PublicoAdulto.*;

import java.time.LocalDate;

public class Vendas implements iVendas {
    protected CaixaRegistradora caixaRegistradora;
    protected CRUDBrinquedos crudBrinquedos;
    protected CRUDFilmes crudFilmes;
    protected CRUDLivro crudLivro;
    protected CRUDAlbunsDeMusica crudAlbunsDeMusica;
    protected CRUDGames crudGames;

    @Override
    public void vendasLivros(double valorProduto, Livros livros) {
        if(livros instanceof PublicoAdultoLivro){
            throw new RuntimeException("Você não pode comprar itens adultos sem identificação");
        }
        if(crudLivro.getEstoqueLivros().contains(livros)){
            crudLivro.getEstoqueLivros().remove(livros);
            if (valorProduto > 200){
                valorProduto = valorProduto - (valorProduto*0.15);
                caixaRegistradora.valorDoCaixa(valorProduto);
            }
            caixaRegistradora.valorDoCaixa(valorProduto);
        }
    }

    @Override
    public void vendasFilmes(double valorProduto, Filmes filmes) {
        if(filmes instanceof PublicoAdultoFilmes){
            throw new RuntimeException("Você não pode comprar itens adultos sem identificação");
        }
        if(crudFilmes.getEstoqueFilmes().contains(filmes)){
            crudFilmes.getEstoqueFilmes().remove(filmes);
            caixaRegistradora.valorDoCaixa(valorProduto);
        }
    }

    @Override
    public void vendasGames(double valorProduto, Games games) {
        if(games instanceof PublicoAdultosGames){
            throw new RuntimeException("Você não pode comprar itens adultos sem identificação");
        }
        if(crudGames.getEstoqueGames().contains(games)){
            crudGames.getEstoqueGames().remove(games);
            caixaRegistradora.valorDoCaixa(valorProduto);
        }
    }

    @Override
    public void vendasAlbunsDeMusica(double valorProduto, AlbunsDeMusica albunsDeMusica) {
        if(albunsDeMusica instanceof PublicoAdultoAlbunsDeMusica){
            throw new RuntimeException("Você não pode comprar itens adultos sem identificação");
        }
        if(crudAlbunsDeMusica.getEstoqueAlbunsDeMusicas().contains(albunsDeMusica)){
            crudAlbunsDeMusica.getEstoqueAlbunsDeMusicas().remove(albunsDeMusica);
            caixaRegistradora.valorDoCaixa(valorProduto);
        }
    }

    @Override
    public void vendasBrinquedos(double valorProduto, Brinquedos brinquedos) {
        if(brinquedos instanceof PublicoAdultoBrinquedos){
            throw new RuntimeException("Você não pode comprar itens adultos sem identificação");
        }
        if(crudBrinquedos.getEstoqueBrinquedos().contains(brinquedos)){
            crudBrinquedos.getEstoqueBrinquedos().remove(brinquedos);
            caixaRegistradora.valorDoCaixa(valorProduto);
        }
    }

    @Override
    public void vendasLivrosAdultos(Livros livros, Documento documento,double valor) {
        if(!verificarIdadeDoCliente(documento)){
            throw new RuntimeException("Você não pode comprar um item adulto sendo menor de 18 anos");
        }
        vendasLivros(valor, livros);
    }

    @Override
    public void vendasGamesAdultos(Games games, Documento documento, double valor) {
        if(!verificarIdadeDoCliente(documento)){
            throw new RuntimeException("Você não pode comprar um item adulto sendo menor de 18 anos");
        }
        vendasGames(valor, games);
    }


    @Override
    public void vendasFilmesAdultos(Filmes filmes, Documento documento, double valor) {
        if(!verificarIdadeDoCliente(documento)){
            throw new RuntimeException("Você não pode comprar um item adulto sendo menor de 18 anos");
        }
        vendasFilmes(valor, filmes);
    }


    @Override
    public void vendasBrinquedosAdultos(Brinquedos brinquedos, Documento documento, double valor) {
        if(!verificarIdadeDoCliente(documento)){
            throw new RuntimeException("Você não pode comprar um item adulto sendo menor de 18 anos");
        }
        vendasBrinquedos(valor, brinquedos);
    }


    @Override
    public void vendasAlbunsDeMusicaAdultos(AlbunsDeMusica albunsDeMusica, Documento documento, double valor) {
        if(!verificarIdadeDoCliente(documento)){
            throw new RuntimeException("Você não pode comprar um item adulto sendo menor de 18 anos");
        }
        vendasAlbunsDeMusica(valor, albunsDeMusica);
    }


    private boolean verificarIdadeDoCliente(Documento documento){
        if(documento.getDataDeNascimento().getYear() - LocalDate.EPOCH.getYear() < 18){
            return false;
        }
        return true;
    }
}
