package Exercicios.aula5.Cristine;
import java.util.Scanner;
public class Exercicio9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada1 = new Scanner(System.in);
		System.out.print("Digite um numero: ");
		int numero = entrada1.nextInt();
		int centena = ((numero / 100) * 100);
		int dezena = ((numero % 1000) / 10);
		int unidade = ((numero % 1000)%10); 
		System.out.printf("Perfeito! Voce digitou o numero: %d \n Centena = %d \n Dezena = %d \n Unidade = %d", numero, centena, dezena, unidade);

	}

}
