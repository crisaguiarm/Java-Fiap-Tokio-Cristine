package Exercicios.aula7.Cristine;
import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        int soma = 0;  // Variável para armazenar a soma dos valores

	        // Loop para receber os 10 valores
	        for (int i = 1; i <= 10; i++) {
	            System.out.print("Digite o valor " + i + ": ");
	            int valor = scanner.nextInt();  // Lê o valor digitado pelo usuário
	            soma += valor;  // Soma o valor ao total
	        }

	        // Exibe a soma total dos valores digitados
	        System.out.println("A soma dos 10 valores é: " + soma);

	        scanner.close();  // Fecha o Scanner
	}

}
