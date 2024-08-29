package Exercicios.aula6.Cristine;
import java.util.Scanner;
public class Exercicio1 {

	public static void main(String[] args) {
		// Faça um programa que leia um número, e informe se ele é par ou impar.
		
		Scanner entrada1 = new Scanner(System.in);
		System.out.print("Digite um numero: ");
		int num = entrada1.nextInt();
		if (num % 2 <= 0) {
			System.out.println("Par");
	} else {
	System.out.println("Impar");
	}
	}

}
