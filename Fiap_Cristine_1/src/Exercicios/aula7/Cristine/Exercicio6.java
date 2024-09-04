package Exercicios.aula7.Cristine;

import java.util.Scanner;

public class Exercicio6 {

    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);

        // Solicita ao usuário que insira um número
        System.out.print("Digite um número n: ");
        int n = tec.nextInt();

        // Começa a contagem a partir de 2, pois queremos os números pares a partir de 2
        int cont = 2;

        // Laço para exibir os números pares entre 2 e o valor fornecido
        while (cont <= n) {
            // Exibe o número par atual
            System.out.println(cont);

            // Incrementa o contador em 2 para garantir que sempre será par
            cont += 2;
        }

        // Fecha o Scanner para liberar o recurso
        tec.close();
    }
}
