package javalogica;
import java.util.Scanner;
public class PrimeiroPrograma {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada1 = new Scanner(System.in);
	System.out.print("Digite seu nome: ");
	String nome = entrada1.nextLine();
	Scanner entrada2 = new Scanner(System.in);
	System.out.print("Digite seu salario: ");
	double salario = entrada2.nextDouble();
	System.out.println("Bem vinda, " + nome + ". Seu salario e de $ " + salario + " reais");
}
}