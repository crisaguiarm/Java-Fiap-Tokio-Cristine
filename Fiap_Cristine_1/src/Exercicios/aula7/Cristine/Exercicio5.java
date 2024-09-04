package Exercicios.aula7.Cristine;

import java.util.Scanner;

public class Exercicio5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Inicializa a variável que irá armazenar o maior valor. 
        // Começa com o menor valor possível para garantir que qualquer valor digitado será maior.
        int maior = Integer.MIN_VALUE;  

        // Loop para receber os 12 valores
        for (int i = 1; i <= 12; i++) {
            System.out.print("Digite o valor " + i + ": ");
            int valor = scanner.nextInt();  // Lê o valor digitado pelo usuário

            // Compara o valor atual com o maior valor encontrado até agora
            if (valor > maior) {
                maior = valor;  // Se o valor atual for maior, ele se torna o novo maior valor
            }
        }

        // Exibe o maior valor digitado
        System.out.println("O maior valor digitado e: " + maior);

        // Fecha o Scanner para liberar o recurso
        scanner.close();
    }
}
