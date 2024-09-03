package Exercicios.aula7.Cristine;
import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		// 
		Scanner tec = new Scanner(System.in);
		System.out.print("Digite um numero: ");
		int num = tec.nextInt();
		for (int cont = 0; cont<=25; cont++) {
			 System.out.println(num + "X" + cont + ":" + (num * cont));
			
		}
		tec.close();
	}

}
