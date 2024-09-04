package Exercicios.aula7.Cristine;

import java.util.Scanner;

public class Exercicio9 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário que digite um número positivo
        System.out.print("Digite um número inteiro positivo: ");
        int n = scanner.nextInt(); // Recebe o valor de n

        // Verifica se o número é positivo
        if (n > 0) {
            System.out.println("Os divisores de " + n + " são:");

            // Laço for para encontrar os divisores
            for (int i = 1; i <= n; i++) {
                // Verifica se i é divisor de n
                if (n % i == 0) {
                    System.out.println(i); // Imprime o divisor
                }
            }
        } else {
            System.out.println("Por favor, insira um número inteiro positivo.");
        }

        scanner.close(); // Fecha o Scanner para liberar o recurso
    }
}
