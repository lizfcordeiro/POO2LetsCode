package Calculadora;

import java.util.Scanner;

public class Calc {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        while (true) {
            System.out.println("      Digite uma opção:      ");
            System.out.println("-----------------------------");
            System.out.println(" Opção 1 - Soma              ");
            System.out.println(" Opção 2 - Subtração         ");
            System.out.println(" Opção 3 - Multiplicação     ");
            System.out.println(" Opção 4 - Divisão           ");
            System.out.println(" Opção 5 - Sair              ");
            System.out.println("-----------------------------");

            int opcao = teclado.nextInt();

            switch (opcao) {
                case 1 -> System.out.println("Resultado da soma é: " + new Soma().calcular(popArrayDouble(teclado)));
                case 2 -> System.out.println("Resultado da subtração é: " + new Subtracao().calcular(popArrayDouble(teclado)));
                case 3 -> System.out.println("Resultado da multiplicação é: " + new Multiplicacao().calcular(popArrayDouble(teclado)));
                case 4 -> System.out.println("Resultado da divisão é: " + new Divisao().calcular(popArrayDouble(teclado)));
                default -> System.out.print("Opção inválida");
            }
        }
    }
        public static double[] popArrayDouble(Scanner scanner) {
            Scanner teclado = new Scanner(System.in);
            System.out.println("Quantos números você deseja utilizar?");
            int tamanhoArray = teclado.nextInt();
            double[] arrayDouble = new double[tamanhoArray];
            for (int i = 0; i < tamanhoArray; i++) {
                arrayDouble[i] = teclado.nextDouble();
            }
            return arrayDouble;

        }
    }
