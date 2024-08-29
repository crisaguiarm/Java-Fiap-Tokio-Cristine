package Exercicios.aula6.Cristine;

import java.util.Scanner;

public class Exercicio8 {
	// Escrever um algoritmo para determinar o consumo médio de um automóvel sendo fornecida a distância total percorrida pelo automóvel e o total de combustível gasto.
	//▪ Dê sua resposta em km por litro de combustível (km/Litro)
	//▪ Caso a autonomia do veículo esteja abaixo de 8 km/L, exiba a mensagem:
	//▪ “Esse carro bebe hein!”
	//▪ Senão, exiba a mensagem:
	//▪ “Autonomia legal”

	public static void main(String[] args) {
		Scanner scanner1 = new Scanner(System.in);
        System.out.print("Digite a distancia percorrida em Km: ");
        double d = scanner1.nextDouble(); //Distancia
        Scanner scanner2 = new Scanner(System.in);
        System.out.print("Total de combustivel gasto em L: ");
        double Tc = scanner2.nextDouble(); //Total de combustivel
        double Cm = d/Tc; //Consumo medio
        if (Cm < 8) {
        	System.out.printf(" A autonomia desse carro e de: %.2f Km/L.\n Esse carro bebe hein!", Cm);
        	} else {
        	System.out.printf(" A autonomia desse carro e de: %.2f Km/L.\n Autonomia legal", Cm);
        	}
        
	}

}

