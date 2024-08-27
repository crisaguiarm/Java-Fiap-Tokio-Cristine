package Exercicios_aula4_Cristine;
import java.util.Scanner;
public class exercicio4 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada1 = new Scanner(System.in);
	System.out.print("Digite seu nome: ");
	String nome = entrada1.nextLine();
	Scanner entrada2 = new Scanner(System.in);
	System.out.print("Digite sua idade: ");
	int idade = entrada2.nextInt();
	System.out.println("Bem vinda, " + nome + ". Voce tem " + (idade) + " anos");
}

}
