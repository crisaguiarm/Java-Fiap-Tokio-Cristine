package Exercicios.aula5.Cristine;

import java.util.Scanner;

public class Exercicio8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada1 = new Scanner(System.in);
		System.out.print("Digite o seu nome: ");
		String nome = entrada1.nextLine();
		Scanner entrada2 = new Scanner(System.in);
		System.out.print("Digite o valor que voce quer converter: R$ ");
		double v1 = entrada2.nextDouble();
		double dolar = v1/5.54; 
		double euro = v1/6.16;
		double argentino = v1/0.0058;
		double libra = v1/7.30;
		double iene = v1/0.038; 
		System.out.printf(" Certinho, %s! Segue conversao abaixo: \n R$: %.2f \n Dolar: %.2f \n Euro: %.2f \n Peso Argentino: %.2f \n Libra: %.2f \n Iene: %.2f", nome, v1, dolar, euro, argentino, libra, iene);
	}

}
