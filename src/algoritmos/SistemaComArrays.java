package algoritmos;

import java.util.Scanner;

/**
        O objetivo deste desafio é resolvê-lo utilizando o seu conhecimento sobre Arrays,
        uma estrutura de dados que armazena uma coleção de dados em um bloco de memória.


        Você está desenvolvendo um sistema para um local de eventos, neste local,
        é necessário que a entrada seja permitida apenas para pessoas acima de 18 anos.
        Faça um programa para ler um número N, a idade de N pessoas. Depois disso,
        coloque a idade mínima permitida para se entrar no local, conforme exemplo.

        Retorne às idades de quem não puder entrar.

 *
 * @author Evandro
 */
public class SistemaComArrays {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] dados = new int[n];
        for (int i = 0; i < n; i++) {
            dados[i] = sc.nextInt();

        }
        for (int j = 0; j < dados.length; j++) {
            if (dados[j] < 18) {
                System.out.println("\nNão poderao entrar as idades "+dados[j]);
            }
        }

    }
}
