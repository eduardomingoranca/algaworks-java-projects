package com.brazil.algaworks.treinador;

import com.brazil.algaworks.animal.Cachorro;

public class TreinadorCachorro {

    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro();
        cachorro.setNome("Bob");

        DonoCachorro donoCachorro = new DonoCachorro();
        donoCachorro.ensinarCachorroSentar(cachorro);

    }
}
