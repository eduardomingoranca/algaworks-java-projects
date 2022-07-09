package com.brazil.algaworks.desafio;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Informe a quantidade de jogos: ");
        int quantidadeJogos = input.nextInt();

        System.out.println("-------- MEGA SENA ---------");
        System.out.println("----------------------------");
        for (int i = 1; i <= quantidadeJogos; i++) {
            MegaSena mega = new MegaSena();
            mega.sortear();
            mega.exibirNumeros();
            System.out.println("----------------------------");
        }

        System.out.println("*** Boa sorte! ***");

        input.close();
    }

}
