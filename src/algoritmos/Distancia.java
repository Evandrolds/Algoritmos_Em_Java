package algoritmos;

import java.util.Locale;
import java.util.Scanner;

/**
    Leia os quatro valores correspondentes aos eixos x e y de dois pontos
    quaisquer no plano, p1(x1,y1) e p2(x2,y2) e calcule a distância entre eles,
    mostrando 4 casas decimais após a vírgula, conforme a fórmula: Distancia =
    Raiz de quadrada(x^2 - x1)^ +(y2^ - y1)^ Entrada O arquivo de entrada contém
    duas linhas de dados. A primeira linha contém dois valores de ponto
    flutuante: x1 y1 e a segunda linha contém dois valores de ponto flutuante x2
    y2. Saída Calcule e imprima o valor da distância segundo a fórmula fornecida,
    com 4 casas após o ponto decimal.
 
 *
 * @author Evandro
 */
public class Distancia {

    public static void main(String[] args) {
        double pi = 3.14159;
        Locale.setDefault(Locale.US);
        try ( Scanner sc = new Scanner(System.in)) {
            double raio, area;
            raio = sc.nextDouble();
            area = pi * raio * raio;
            System.out.println("Area = " + String.format("%.4f", area));
        }
    }
}
