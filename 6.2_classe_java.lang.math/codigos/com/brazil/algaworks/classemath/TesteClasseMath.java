package com.brazil.algaworks.classemath;

import static java.lang.Math.*;

public class TesteClasseMath {


    public static void main(String[] args) {
        // Comprimento de uma circunferencia 2 x r x PI (3.1415)
        int raio = 4;
        double comprimento = 2 * raio * PI;
        System.out.println("===============================");
        System.out.println("Comprimento: " + comprimento);

        // Maximo e minimo
        double[] precosProdutoA = {30.2, 25.49};
        double maiorPreco = max(precosProdutoA[0], precosProdutoA[1]);
        double menorPreco = min(precosProdutoA[0], precosProdutoA[1]);
        System.out.println("===============================");
        System.out.println("Maior preco: " + maiorPreco);
        System.out.println("Menor preco: " + menorPreco);
        System.out.println("===============================");

        // Potencia
        System.out.println("2^3: " + pow(2, 3));
        System.out.println("===============================");

        // Raiz Quadrada
        System.out.println("Raiz de 9: " + sqrt(9));
        System.out.println("===============================");

        // Arredondamento ceil, floor e round
        double n = 5.68;
        System.out.println("Menor inteiro: " + floor(n));
        System.out.println("Maior inteiro: " + ceil(n));
        System.out.println("Arredondando: " + round(n));
        System.out.println("===============================");

        // Trigonometria
        System.out.println("Seno: " + sin(40));
        System.out.println("===============================");

        // Numeros aleatorios
        double numeroAleatorio = random() * 100;
        System.out.println("Numero Aleatorio: " + numeroAleatorio);
        System.out.println("===============================");

    }

}
