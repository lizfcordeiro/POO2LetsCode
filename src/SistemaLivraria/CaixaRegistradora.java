package SistemaLivraria;

public class CaixaRegistradora implements iCaixa{
    private double dinheiro;
    public double valorDoCaixa(double valorAtual) {
        dinheiro += valorAtual;
        return dinheiro;
    }
}
