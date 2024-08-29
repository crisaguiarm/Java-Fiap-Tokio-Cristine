package Exercicios.aula6.Cristine;

import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o primeiro numero: ");
        int n1 = scanner.nextInt();
        
        System.out.print("Digite o segundo numero: ");
        int n2 = scanner.nextInt();
        
        scanner.nextLine(); 
        
        System.out.print("Digite o simbolo da operacao (+, -, *, /): ");
        char operacao = scanner.nextLine().charAt(0);
        
        double resultado;
 
        switch (operacao) {
            case '+':
                resultado = n1 + n2;
                break;
            case '-':
                resultado = n1 - n2;
                break;
            case '*':
                resultado = n1 * n2;
                break;
            case '/':
                if (n2 != 0) {
                    resultado = (double) n1 / n2; 
                } else {
                    System.out.println("Erro: Divisao por zero.");
                    return;
                }
                break;
            default:
                System.out.println("Operaçao invalida.");
                return;
        }
        
        System.out.println("O resultado da operacao e: " + resultado);
    }
}
