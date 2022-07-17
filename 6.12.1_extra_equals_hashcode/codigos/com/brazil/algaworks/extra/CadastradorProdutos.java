package com.brazil.algaworks.extra;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Scanner;

public class CadastradorProdutos {

    public static void main(String[] args) {
//        Collection<Produto> produtos = new ArrayList<>();
        Collection<Produto> produtos = new HashSet<>();

        System.out.println("##### Cadastro de produtos #####\n");

        /**
         ****************************** REGRAS ********************************************
         * Simetria: Para duas referencias, a e b, a.equals(b) se e somente se b.equals(a)
         * Reflexividade: Para todas referencias nao nulas, a.equals(a)
         * Transitividade: Se a.equals(b) e b.equals(c), entao a.equals(c)
         * Consistencia com hashCode(): Dois objetos iguais precisam ter o mesmo hashCode()
         **********************************************************************************
         */


        try (Scanner entrada = new Scanner(System.in)) {
            String continuar = "s";
            while("s".equalsIgnoreCase(continuar)) {
                System.out.print("SKU: ");
                String sku = entrada.nextLine();

                System.out.print("Nome: ");
                String nome = entrada.nextLine();

                /**
                 * so sera igual se for a mesma instancia, por isso,
                 * eh necessario o metodo equals.
                 */

                Produto produto = new Produto(sku, nome);
                if (produtos.contains(produto)) {
                    System.err.println("Esse produto ja foi adicionado. Utilize outro SKU!");
                    System.err.flush();
                } else {
                    produtos.add(produto);
                    System.out.println("Produto adicionado.");
                }

                System.out.print("\nDeseja adicionar mais algum produto? (s/n) ");

                continuar = entrada.nextLine();
            }
        }

        produtos.forEach(System.out::println);

        System.out.println("Fim");
    }
}
