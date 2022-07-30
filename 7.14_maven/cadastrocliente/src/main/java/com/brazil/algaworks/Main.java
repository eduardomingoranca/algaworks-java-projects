package com.brazil.algaworks;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Informe o nome: ");
            String nome = scanner.nextLine();

            System.out.print("Informe a idade: ");
            int idade = scanner.nextInt();

            Usuario usuario = new Usuario(nome, idade);
            System.out.println("Obrigado, " + usuario.getNome() + " por se cadastrar.");
        }
    }
}
