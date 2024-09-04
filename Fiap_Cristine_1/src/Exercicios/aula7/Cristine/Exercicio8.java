package Exercicios.aula7.Cristine;

import java.util.Scanner;

public class Exercicio8 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;

        // Valida a entrada do usuário para aceitar apenas números positivos
        do {
            System.out.print("Digite um número positivo: ");
            n = scanner.nextInt(); // Recebe o valor de n
        } while (n <= 0); // Repete a solicitação enquanto n for menor ou igual a 0

        // Variável para armazenar a soma
        int soma = 0;

        // Calcula a soma de todos os números inteiros de 1 até n
        for (int i = 1; i <= n; i++) {
            soma += i; // Soma o valor de i à variável soma
        }

        // Exibe o resultado final
        System.out.println("A soma de 1 ate " + n + " e: " + soma);

        scanner.close(); // Fecha o Scanner para liberar o recurso
    }
}

