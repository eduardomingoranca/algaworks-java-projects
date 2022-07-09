package com.brazil.algaworks.desafio;

import static java.lang.Math.random;
import static java.lang.Math.round;

public class MegaSena {
    private int[] numerosSorteados;

    public void sortear() {
        this.numerosSorteados = new int[6];

        for (int i = 1; i <= 6; i++) {
            // gera número aleatório, arredonda e converte para inteiro
            int numeroSorteado = (int) round(random() * 60);

            // verifica se número ainda não foi sorteado e não é 0
            if (!this.jaFoiSorteado(numeroSorteado) && numeroSorteado != 0) {
                // adiciona o número sorteado no array de números sorteados
                this.numerosSorteados[i-1] = numeroSorteado;
            } else {
                // decrementa i para refazer o sorteio da mesma posição
                i--;
            }
        }
    }

    public void exibirNumeros() {
        for (int numeroSorteado : numerosSorteados) {
            System.out.print(numeroSorteado + " ");
        }
        // quebra de linha
        System.out.println();
    }

    private boolean jaFoiSorteado(int numeroSorteado) {
        boolean resultado = false;
        for (int i = 0; i < this.numerosSorteados.length; i++) {
            if (this.numerosSorteados[i] == numeroSorteado) {
                resultado = true;
                break;
            }
        }
        return resultado;
    }

}
