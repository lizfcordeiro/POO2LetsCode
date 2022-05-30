package DeckGame;

import java.util.ArrayList;
import java.util.List;

public class TabuleiroMulti implements ITabuleiro{

    private List<Jogador> jogadores = new ArrayList<>(5);
    private List<CartaDeAtaque> decks = new ArrayList<>(5);
    private List<CartaDeAtaque> campoAtaque = new ArrayList<>(5);
    private List<CartaDeAtaque> campoEspecial = new ArrayList<>(2);

    public TabuleiroMulti( List<Jogador> jogadores) {
        for (Jogador j: jogadores) {
            decks.add(j.getDeckContra());
        }
    }
    @Override
    public void insiraDeck(int deck) {System.out.println("Deck inserido");
    }

    @Override
    public boolean jogarUmaCarta(ICartaGenerica carta, Jogador jogador, int mana) {

        return mana == jogador.getMana();
    }

    @Override
    public void checarVencedor(Jogador jogador) {
        removerPerdedor();
        if (jogadores.size() == 1) {
            System.out.println("O ganhador é " + jogador.getNome());
        }
    }

    private void adicionarAoCampo(CartaDeAtaque carta) {
        if(carta instanceof EspecialAtaqueCarta){
            if(campoEspecial.size() <= 2){
                campoEspecial.add((EspecialAtaqueCarta) carta);
            } else if (campoAtaque.size() <= 5){
                campoAtaque.add(carta);
            }
        }
    }
    private void removerPerdedor(){
        for (Jogador j: jogadores) {
            if (j.getHp() == 0){
                jogadores.remove(j);
            }
        }
    }
}
