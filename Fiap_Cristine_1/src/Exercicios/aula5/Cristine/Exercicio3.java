package Exercicios.aula5.Cristine;
import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada1 = new Scanner(System.in);
		System.out.print("Digite seu nome: ");
		String nome = entrada1.nextLine();
		Scanner entrada2 = new Scanner(System.in);
		System.out.print("Escolha seu genero:\n [M] Para masculino \n [F] Para feminino \n [O] Outro \n [N] Nao responder \n ");
		char genero = entrada2.nextLine().charAt(0);
		System.out.printf("Ola, %s! Voce escolheu a seguinte opcao de genero: %c", nome, genero );
	}

}
