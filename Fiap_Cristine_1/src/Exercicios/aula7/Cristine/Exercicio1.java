package Exercicios.aula7.Cristine;

import java.util.Scanner;

public class Exercicio1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int resposta;
        resposta = 1; //Sim

        do {
            // Exibe a mensagem "Olá, Mundo"
            System.out.println("Olá, Mundo!");

            // Pergunta ao usuário se deseja exibir a mensagem novamente
            System.out.print("Deseja exibir a mensagem novamente? (Para sim, digite 1): ");
            resposta = scanner.nextInt();

        } while (resposta == 1);

        // Exibe a mensagem "Fim" ao sair do loop
        System.out.println("Fim");

        scanner.close();
    }
}
