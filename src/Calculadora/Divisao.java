package Calculadora;

public class Divisao implements Calculo{
    @Override
    public double calcular(double... numeros) {
        for (int i = 1; i < numeros.length; i++){
            if(numeros[i] == 0){
                throw new ArithmeticException("Não é possível dividir por zero");
            }
        }
        return 0;
    }
}
