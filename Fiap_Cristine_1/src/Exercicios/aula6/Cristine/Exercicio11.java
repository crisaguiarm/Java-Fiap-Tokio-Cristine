package Exercicios.aula6.Cristine;

import java.util.Scanner;

public class Exercicio11 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita as informações sobre a carga
        System.out.print("Ola, digite o codigo do estado de origem da carga (Considere de 1 a 5): ");
        int cEstado = scanner.nextInt(); // Código do Estado de origem
        System.out.print("Agora, digite o codigo da carga (Considere de 10 a 40): ");
        int cCarga = scanner.nextInt(); // Código da carga

        System.out.print("Otimo, por ultimo digite o peso da carga em toneladas: ");
        double pesoT = scanner.nextDouble(); // Peso da carga em toneladas

        // Variáveis para cálculos
        double pesoK = pesoT * 1000; // Conversão de toneladas para quilos
        double precoCarga;
        double imposto = 0; // Inicializar o imposto para evitar problemas
        double precoTotal;

        // Calcula o preço da carga com base no código da carga
        if (cCarga >= 10 && cCarga <= 20) {
            precoCarga = pesoK * 100;
        } else if (cCarga >= 21 && cCarga <= 30) {
            precoCarga = pesoK * 250;
        } else {
            precoCarga = pesoK * 340;
        }

        // Calcula o imposto com base no código do estado
        if (cEstado == 1) {
            imposto = 0.35 * precoCarga;
        } else if (cEstado == 2) {
            imposto = 0.25 * precoCarga;
        } else if (cEstado == 3) {
            imposto = 0.15 * precoCarga;
        } else if (cEstado == 4) {
            imposto = 0.05 * precoCarga;
        } else if (cEstado == 5) {
            imposto = 0; // Isento de imposto para o estado 5
        }

        // Calcula o preço total (carga + impostos)
        precoTotal = precoCarga + imposto;

        // Exibe os resultados
        System.out.printf("O peso da carga em Kg: %.2f kg\n", pesoK);
        System.out.printf("O preco da carga: R$ %.2f\n", precoCarga);
        System.out.printf("O valor do imposto cobrado: R$ %.2f\n", imposto);
        System.out.printf("Valor total a pagar: R$ %.2f\n", precoTotal);
        
        scanner.close();
    }
}

