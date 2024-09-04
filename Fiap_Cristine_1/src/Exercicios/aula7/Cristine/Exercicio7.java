package Exercicios.aula7.Cristine;

import java.util.Scanner;

public class Exercicio7 {

	public static void main(String[] args) {
		// 
		Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário que insira a media
        System.out.print("Digite a media da turma: ");
        double media = scanner.nextDouble();

        // Começa a contagem
        int contAcima = 0;
        int contAbaixo = 0;

        for (int i = 1; i <= 20; i++) {
            System.out.print("Digite a nota " + i + ": ");
            int nota = scanner.nextInt();  // Lê o valor digitado pelo usuário

            // Compara o valor da media e da nota
            if (nota >= media) {
                contAcima++; // Conta quantas notas sao acima
                
            }
            if (nota < media) {
            	contAbaixo++; // Conta quantas notas são abaixo        	
            }
        }

        // Exibe a quantidade de notas acima da media e abaixo
        	System.out.println("Tem " + contAcima + " notas acima da media");
        	System.out.println("Tem " + contAbaixo + " notas abaixo da media");

        // Fecha o Scanner para liberar o recurso
        scanner.close();
    }
}

