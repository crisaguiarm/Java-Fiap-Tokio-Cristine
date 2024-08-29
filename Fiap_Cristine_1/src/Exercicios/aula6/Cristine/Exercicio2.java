package Exercicios.aula6.Cristine;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		// Faça um programa que peça dois números e imprima o maior deles, e informe caso eles sejam iguais.
		Scanner entrada1 = new Scanner(System.in);
		System.out.print("Digite um numero: ");
		int num1 = entrada1.nextInt();
		Scanner entrada2 = new Scanner(System.in);
		System.out.print("Digite um outro numero: ");
		int num2 = entrada2.nextInt();
		if (num1>num2) {
			System.out.println("O primeiro e maior que o segundo");
	} else {
		if (num1==num2) {
			System.out.println("Eles sao iguais");
		}
		else {
		System.out.println("O primeiro e menor que o segundo");
	}
	}

}
}