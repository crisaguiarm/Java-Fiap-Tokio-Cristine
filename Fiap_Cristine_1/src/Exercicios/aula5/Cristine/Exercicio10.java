package Exercicios.aula5.Cristine;
import java.util.Scanner;
public class Exercicio10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada1 = new Scanner(System.in);
		System.out.print("Digite o seu nome: ");
		String nome = entrada1.nextLine();
		Scanner entrada2 = new Scanner(System.in);
		System.out.print("Digite sua idade atual em anos: ");
		int Ianos = entrada2.nextInt();
		Scanner entrada3 = new Scanner(System.in);
		System.out.print("Digite sua idade atual em meses: ");
		int Imeses = entrada3.nextInt();
		Scanner entrada4 = new Scanner(System.in);
		System.out.print("Digite sua idade atual em dias: ");
		int Idias = entrada4.nextInt();
		int vida = ((Ianos * 365) + (Imeses * 30) + Idias);
		System.out.printf("Parabens, %s! Voce ja viveu %d dias!", nome, vida);
	}

}
