package Exercicios.aula5.Cristine;

import java.util.Scanner;

public class Desafio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada1 = new Scanner(System.in);
		System.out.print("Digite o seu nome: ");
		String nome = entrada1.nextLine();
		Scanner entrada2 = new Scanner(System.in);
		System.out.print("Digite sua idade atual em dias: ");
		int Idias = entrada2.nextInt();
		int Ianos = (Idias/365);
		Idias %= 365;
		int Imeses = Idias/30;
		Idias %= 30;
		int dias = Idias;
		System.out.printf("Ola, %s! Voce tem %d anos, %d meses e %d dias!", nome, Ianos, Imeses, dias);
	}

}
