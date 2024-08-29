package Exercicios.aula6.Cristine;

import java.util.Scanner;

public class Exercicio4 {
	// ▪ Faça um programa que leia 2 valores inteiros (A e B).
	//▪ A seguir, o programa deve mostrar uma mensagem "São Múltiplos" ou "Não são Múltiplos", indicando se os valores lidos são múltiplos entre si.

	public static void main(String[] args) {
		Scanner entrada1 = new Scanner(System.in);
		System.out.print("Digite a primeiro numero: ");
		int A = entrada1.nextInt();
		Scanner entrada2 = new Scanner(System.in);
		System.out.print("Digite o segundo numero: ");
		int B = entrada2.nextInt();
		if (A % B <= 0) {
			System.out.println("Sao multiplos!");
			} else {
			System.out.println("Nao sao multiplos!");
			}
		
	}

}
