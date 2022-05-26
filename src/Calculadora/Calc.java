package Calculadora;

import java.util.Scanner;

public class Calc {
    public static void main(String[] args) {
        Scanner menu = new Scanner (System.in);
        Soma soma = new Soma();

        System.out.println(soma.calcular(1,3));

        while (true) {

            System.out.println("      Digite uma opção:      ");
            System.out.println("-----------------------------");
            System.out.println(" Opção 1 - Soma              ");
            System.out.println(" Opção 2 - Subtração         ");
            System.out.println(" Opção 3 - Multiplicação     ");
            System.out.println(" Opção 4 - Divisão           ");
            System.out.println(" Opção 5 - Sair              ");
            System.out.println("-----------------------------");

            int opcao = menu.nextInt();

            if (opcao == 5) {
                System.out.print("Calculadora fechada!");
                menu.close();

                switch (opcao) {
                case 1 -> System.out.println("Resultado da soma é: " + new Soma().calcular(popArrayNumbers(menu)));
                case 2 -> System.out.println("Resultado da subtração é: " + new Subtracao().calcular(popArrayNumbers(menu)));
                case 3 -> System.out.println("Resultado da multiplicação é: " + new Multiplicacao().calcular(popArrayNumbers(menu)));
                case 4 -> System.out.println("Resultado da divisão é: " + new Divisao().calcular(popArrayNumbers(menu)));
                default -> System.out.print("Opção inválida");
            }
            }
        }
        public static Double[] popArrayDouble(Scanner menu) {
            double[] numeros = new double[numeros.length];
            for (int i = 0; i < numeros.length; i++) {
                numeros[i] = menu.nextDouble();
            }
            return numeros;

        }
    }

}
