package Exercicios.aula6.Cristine;
import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		// Faça um programa para a leitura de quatro notas parciais de um aluno. O programa deve calcular a média alcançada pelo aluno e apresentar:
			//▪ A mensagem "Aprovado", se a média alcançada for maior ou igual a sete;
			//▪ A mensagem "Em recuperação", se a média for entre cinco, incluindo o cinco, e sete;
			//▪ A mensagem "Reprovado", se a média for menor que cinco.
		Scanner entrada1 = new Scanner(System.in);
		System.out.print("Digite a primeira nota: ");
		double n1 = entrada1.nextDouble();
		Scanner entrada2 = new Scanner(System.in);
		System.out.print("Digite a segunda nota: ");
		double n2 = entrada2.nextDouble();
		Scanner entrada3 = new Scanner(System.in);
		System.out.print("Digite a terceira nota: ");
		double n3 = entrada3.nextDouble();
		Scanner entrada4 = new Scanner(System.in);
		System.out.print("Digite a quarta nota: ");
		double n4 = entrada4.nextDouble();
		double media = ((n1+n2+n3+n4)/4);
		if (media >= 7) {
			System.out.println("Parabens! Esta aprovado :) ");
			} else {
			if (media > 5 && media<= 7) {
			System.out.println("Humm, esta de recuperação :| ");
			}
			else {
			System.out.println("Poxa, esta reprovado :( ");
			}
			}
			
		}
	
}


