package DeckGame;

public class CartaDeAtaque implements ICartaGenerica{
    private final String nome;
    private final int custo;
    protected int cartaDeAtaque;
    protected int cartaDeDefesa;
    protected TipoDeCarta tipoDeCarta;

    public CartaDeAtaque(String nome, int custo, TipoDeCarta tipoDeCarta, int cartaDeAtaque, int cartaDeDefesa) {
        this.nome = nome;
        this.custo = custo;
        this.tipoDeCarta = tipoDeCarta;
        this.cartaDeAtaque = cartaDeAtaque;
        this.cartaDeDefesa = cartaDeDefesa;
    }

    public TipoDeCarta getTipoDeCarta() {
        return tipoDeCarta;
    }

    public void setTipoDeCarta(TipoDeCarta tipoDeCarta) {

        this.tipoDeCarta = tipoDeCarta;
    }

    public int getCartaDeAtaque() {

        return cartaDeAtaque;
    }

    public void setCartaDeAtaque(int pontosDeAtaque) {

        cartaDeAtaque = pontosDeAtaque;
    }

    public int getCartaDeDefesa() {

        return cartaDeDefesa;
    }

    public void setCartaDeDefesa(int pontosDeDefesa) {

        cartaDeDefesa= pontosDeDefesa;
    }

    @Override
    public String getNome() {

        return null;
    }

    @Override
    public int getTipo() {

        return 0;
    }

    @Override
    public void getCusto() {

    }

    @Override
    public TipoDeCarta tipoDeCarta() {
        return null;
    }

}
