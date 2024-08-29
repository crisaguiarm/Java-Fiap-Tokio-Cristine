package Exercicios.aula6.Cristine;

import java.util.Scanner;

public class Exercicio6 {
	// ▪ Faça um programa que receba o ano de nascimento da pessoa e retorne:
		//▪ Se o voto é obrigatório este ano;
		//▪ Se o voto é opcional este ano;
		//▪ Se o voto é proibido este ano.
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o ano do seu nascimento: ");
        int anoNasc = scanner.nextInt();
        int anoAtual = 2024;
        double voto = (anoAtual - anoNasc);
        if (voto >=18) {
			System.out.println("Voto obrigatorio esse ano");
			} else {
				if (voto >=16 && voto <18) {
					System.out.println("Voto opcional esse ano");
					}
				else {
					System.out.println("Voto proibido esse ano");
					}
			
			}
		
	}

}
