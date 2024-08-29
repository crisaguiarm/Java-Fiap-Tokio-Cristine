package Exercicios.aula6.Cristine;

import java.util.Scanner;

public class Exercicio9 {
	//▪ Faça um algoritmo que calcule o valor da conta de luz de uma pessoa, empresa etc.
	 //▪ Sabe-se que o cálculo da conta de luz segue a tabela abaixo:
	//Tipo cliente Valor do KW/h:
	//1 (residência) 0,60
	//2 (comércio) 0,48
	//3 (indústria) 1,29
	public static void main(String[] args) {
		Scanner scanner1 = new Scanner(System.in);
        System.out.print("Ola, escolha de acordo com qual categoria voce se enquadra: \n (R) Residencia \n (C) Comercio \n (I) Industria \n");
        char categoria = scanner1.nextLine().charAt(0);
        Scanner scanner2 = new Scanner(System.in);
        System.out.print("Perfeito, agora me fala o seu gasto deste mes em Kw: ");
        double gasto = scanner2.nextDouble(); //Gasto em Kw
        
        double Vt; 
        
        switch (categoria) {
        case 'R':
        	Vt = (0.60 * gasto);
        	System.out.printf("Voce pagara: R$ %.2f", Vt);
        break;
        case 'C':
        	Vt = (0.48 * gasto);
        	System.out.printf("Voce pagara: R$ %.2f", Vt);
        break;
        case 'I':
        	Vt = (1.29 * gasto);
        	System.out.printf("Voce pagara: R$ %.2f", Vt);
        break;
        default:
        	System.out.println("Categoria Inválida!");
            return;
        }
	}

}
