package Exercicios.aula5.Cristine;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada1 = new Scanner(System.in);
		System.out.print("Digite seu nome: ");
		String nome = entrada1.nextLine();
		Scanner entrada2 = new Scanner(System.in);
		System.out.print("Digite sua primeira nota: ");
		double nota1 = entrada2.nextDouble();
		Scanner entrada3 = new Scanner(System.in);
		System.out.print("Digite sua segunda nota: ");
		double nota2 = entrada3.nextDouble();
		double mediaPonderada = ((nota1 * 4) + (nota2 * 6))/(4+6);
		System.out.printf("Ola, %s! A media ponderada das suas nota e: %.2f", nome, mediaPonderada );
	}

}
