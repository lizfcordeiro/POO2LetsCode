package Calculadora;

public class Multiplicacao implements Calculo{
    @Override
    public double calcular(double... numeros){
        double resultado = numeros[0];
        for (int i = 0; i < numeros.length; i++) {
            resultado *= numeros[i];
        }
        return resultado;
    }
}
