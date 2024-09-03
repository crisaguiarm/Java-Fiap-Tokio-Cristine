package Exercicios.aula6.Cristine;

import java.util.Scanner;

public class Exercicio12 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita as informações sobre os lados do triângulo
        System.out.print("Ola, digite o tamanho do primeiro lado do triangulo (A): ");
        double lA = scanner.nextDouble(); // Lado A do triângulo
        System.out.print("Agora, digite o tamanho do segundo lado do triangulo (B): ");
        double lB = scanner.nextDouble(); // Lado B do triângulo
        System.out.print("Agora, digite o tamanho do terceiro lado do triangulo (C): ");
        double lC = scanner.nextDouble(); // Lado C do triângulo

        // Ordena os lados em ordem decrescente para garantir que lA seja o maior
        if (lB > lA) {
            double temp = lA;
            lA = lB;
            lB = temp;
        }
        if (lC > lA) {
            double temp = lA;
            lA = lC;
            lC = temp;
        }
        if (lC > lB) {
            double temp = lB;
            lB = lC;
            lC = temp;
        }

        // Verifica se os valores formam um triângulo
        if (lA >= lB + lC) {
            System.out.println("NAO FORMA TRIANGULO");
        } else {
            // Verifica o tipo de triângulo
            double lA2 = Math.pow(lA, 2);
            double lB2 = Math.pow(lB, 2);
            double lC2 = Math.pow(lC, 2);

            if (lA2 == lB2 + lC2) {
                System.out.println("TRIANGULO RETANGULO");
            } else if (lA2 > lB2 + lC2) {
                System.out.println("TRIANGULO OBTUSANGULO");
            } else {
                System.out.println("TRIANGULO ACUTANGULO");
            }

            // Verifica se é um triângulo equilátero ou isósceles
            if (lA == lB && lB == lC) {
                System.out.println("TRIANGULO EQUILATERO");
            } else if (lA == lB || lB == lC || lA == lC) {
                System.out.println("TRIANGULO ISOSCELES");
            }
        }
        
        scanner.close();
    }
}
