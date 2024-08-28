package Exercicios.aula5.Cristine;

import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada1 = new Scanner(System.in);
		System.out.print("Digite o nome da peca: ");
		String p1 = entrada1.nextLine();
		Scanner entrada2 = new Scanner(System.in);
		System.out.print("Digite a quantidade de pecas: ");
		int qtd1 = entrada2.nextInt();
		Scanner entrada3 = new Scanner(System.in);
		System.out.print("Digite o valor de cada peca: ");
		double v1 = entrada3.nextDouble();
		Scanner entrada4 = new Scanner(System.in);
		System.out.print("Digite o nome da segunda peca: ");
		String p2 = entrada4.nextLine();
		Scanner entrada5 = new Scanner(System.in);
		System.out.print("Digite a quantidade da segunda pecas: ");
		int qtd2 = entrada5.nextInt();
		Scanner entrada6 = new Scanner(System.in);
		System.out.print("Digite o valor de cada segunda peca: ");
		double v2 = entrada6.nextDouble();
		double pagar = ((qtd1 * v1 ) + (qtd2 * v2));
		System.out.printf("Certinho! O valor total a pagar por %d %s e por %d %s e: R$ %.2f", qtd1, p1, qtd2, p2, pagar);
	}

}
