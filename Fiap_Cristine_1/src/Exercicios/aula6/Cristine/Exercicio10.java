package Exercicios.aula6.Cristine;

import java.util.Scanner;

public class Exercicio10 {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        // Solicita o salário ao usuário
        System.out.print("Olá, digite seu salário: ");
        double salario = scanner.nextDouble(); // Salário
        double aumento;
        double reajuste;
        int percentual;

        // Determina o percentual de aumento e o valor do aumento
        if (salario <= 280) {
            percentual = 20;
        } else if (salario <= 700) {
            percentual = 15;
        } else if (salario <= 1500) {
            percentual = 10;
        } else {
            percentual = 5;
        }

        aumento = salario * percentual / 100.0;
        reajuste = salario + aumento;

        // Exibe as informações ao usuário
        System.out.printf("Seu salário anterior: R$ %.2f\n", salario);
        System.out.printf("O percentual de aumento aplicado: %d%%\n", percentual);
        System.out.printf("O valor do aumento: R$ %.2f\n", aumento);
        System.out.printf("Seu novo salário: R$ %.2f\n", reajuste);

        // Fecha o scanner
        scanner.close();
    }
}

