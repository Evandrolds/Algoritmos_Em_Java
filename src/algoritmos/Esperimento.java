package algoritmos;

import java.util.Scanner;

/**
        Maria acabou de iniciar seu curso de graduação na faculdade de medicina e
        precisa de sua ajuda para organizar os experimentos de um laboratório o qual ela é responsável.
        Ela quer saber no final do ano,
        quantas cobaias foram utilizadas no laboratório e o percentual de cada tipo de cobaia utilizada.
        Este laboratório em especial utiliza três tipos de cobaias: sapos, 
        ratos e coelhos. Para obter estas informações,
        ela sabe exatamente o número de experimentos que foram realizados,
        o tipo de cobaia utilizada e a quantidade de cobaias utilizadas em cada experimento.

        Entrada
        A primeira linha de entrada contém um valor inteiro N que indica os vários casos de teste que vem a seguir.
        Cada caso de teste contém um inteiro Quantia (1 ≤ Quantia ≤ 15)
        que representa a quantidade de cobaias utilizadas e um caractere Tipo ('C', 'R' ou 'S'),
        indicando o tipo de cobaia (R:Rato S:Sapo C:Coelho).

        Saída
        Apresente o total de cobaias utilizadas,
        o total de cada tipo de cobaia utilizada e o percentual de cada uma em relação ao total de cobaias utilizadas,
        sendo que o percentual deve ser apresentado com dois dígitos após o ponto.

 *
 * @author Evandro
 */
public class Esperimento {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int quant = 0;
        int total = 0;

        double S = 0;
        double R = 0;
        double C = 0;

        for (int i = 0; i < n; i++) {
            quant = sc.nextInt();
            String tipo = sc.next();
            total += quant;
            if (tipo.equalsIgnoreCase("c")) {
                C += quant;
            } else if (tipo.equalsIgnoreCase("r")) {
                R += quant;
            } else if (tipo.equalsIgnoreCase("s")) {
                S += quant;
            } else {
                return;
            }

        }
        System.out.println("Total:  " + total + " cobaias");
        System.out.println("Total de coelhos " + (int) C);
        System.out.println("Total de ratos " + (int) R);
        System.out.println("Total de sapos " + (int) S);

        System.out.println("Total de Coelhos " + String.format("%.2f", (C / total) * 100) + "%");
        System.out.println("Total de Ratos " + String.format("%.2f", (R / total) * 100) + "%");
        System.out.println("Total de sapos " + String.format("%.2f", (S / total) * 100) + "%");

        sc.close();

    }
}
