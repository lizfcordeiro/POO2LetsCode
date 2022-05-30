package DeckGame;

public interface ITabuleiro {
    default void insiraDeck(int deck) {
    }
    boolean jogarUmaCarta(ICartaGenerica carta, Jogador jogador, int mana);
    void checarVencedor(Jogador jogador);

    default boolean tamanhoDoDeck(CartaDeAtaque[] deck, int tamanhoEsperado) {
        return deck.length == tamanhoEsperado;
    }

}
