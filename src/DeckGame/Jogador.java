package DeckGame;

public class Jogador {
    private String nome;
    private int hp;
    private int mana;
    private CartaDeAtaque[] deckContra;
    private CartaDeAtaque[] deckMulti;

    public Jogador(String nome, int hp, int mana, CartaDeAtaque[] deckContra, CartaDeAtaque[] deckMultiplayer) {
        this.nome = nome;
        this.hp = hp;
        this.mana = mana;
        this.deckContra = deckContra;
        this.deckMulti = deckMultiplayer;
    }

    public String getNome() {
        return nome;
    }

    public int getHp() {
        return hp;
    }

    public CartaDeAtaque[] getDeckContra() {
        return deckContra;
    }

    public void setDeckContra(CartaDeAtaque[] deckContra) {
        this.deckContra = deckContra;
    }

    public CartaDeAtaque[] getDeckMulti() {
        return deckMulti;
    }

    public void setDeckMulti(CartaDeAtaque[] deckMultiplayer) {
        this.deckMulti = deckMultiplayer;
    }

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }

}
