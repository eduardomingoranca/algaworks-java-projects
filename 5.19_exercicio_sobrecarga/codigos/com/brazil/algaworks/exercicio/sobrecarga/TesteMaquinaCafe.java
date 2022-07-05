package com.brazil.algaworks.exercicio.sobrecarga;

import com.brazil.algaworks.exercicio.sobrecarga.models.MaquinaCafe;

public class TesteMaquinaCafe {

    public static void main(String[] args) {
        MaquinaCafe maquinaCafe = new MaquinaCafe();
        maquinaCafe.setAcucarDisponivel(30);

        maquinaCafe.fazerCafe(10);
        maquinaCafe.fazerCafe(15);

        // faz cafe com a quantidade de açúcar padrão
        // não será possível fazer esse cafezinho, pois a máquina
        // só tinha 30gr de açúcar disponível
        maquinaCafe.fazerCafe();
    }

}
