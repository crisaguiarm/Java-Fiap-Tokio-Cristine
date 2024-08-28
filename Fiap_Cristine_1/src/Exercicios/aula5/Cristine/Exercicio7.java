package Exercicios.aula5.Cristine;
import java.util.Scanner;
public class Exercicio7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada1 = new Scanner(System.in);
		System.out.print("Digite o nome do produto: ");
		String p1 = entrada1.nextLine();
		Scanner entrada2 = new Scanner(System.in);
		System.out.print("Digite o valor do produto: R$ ");
		double v1 = entrada2.nextDouble();
		Scanner entrada3 = new Scanner(System.in);
		System.out.print("Digite o valor pago: R$ ");
		double v2 = entrada3.nextDouble();
		double troco = v2 - v1; 
		System.out.printf(" Certinho! O valor total a pagar pelo(a) %s e: R$ %.2f \n Voce pagou: %.2f \n Seu troco e de: %.2f", p1, v1, v2, troco);
	}

}
