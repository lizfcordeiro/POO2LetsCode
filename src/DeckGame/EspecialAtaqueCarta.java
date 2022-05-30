package DeckGame;

public class EspecialAtaqueCarta extends CartaDeAtaque{
    private EfeitoEspecial efeito;

    public EspecialAtaqueCarta(String nome, int custo, TipoDeCarta tipoDeCarta, int cartaDeAtaque, int cartaDeDefesa, EfeitoEspecial efeito) {
        super(nome, custo, tipoDeCarta, cartaDeAtaque, cartaDeDefesa);
        this.efeito = efeito;
    }

    protected EfeitoEspecial getEfeito() {
        return efeito;
    }

    public void setEfeito(EfeitoEspecial efeito) {
        this.efeito = efeito;
    }
}
