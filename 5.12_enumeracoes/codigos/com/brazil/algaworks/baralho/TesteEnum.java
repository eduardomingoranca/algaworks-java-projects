package com.brazil.algaworks.baralho;

import com.brazil.algaworks.baralho.models.Carta;

import static com.brazil.algaworks.baralho.enums.Naipe.*;

public class TesteEnum {

    public static void main(String[] args) {
        Carta quatroPaus = new Carta(4, PAUS);
        Carta doisOuro = new Carta(2, OURO);
        Carta quatroEspada = new Carta(4, ESPADA);
        Carta seisCopas = new Carta(6, COPAS);


        quatroPaus.imprimirCarta();
        doisOuro.imprimirCarta();
        quatroEspada.imprimirCarta();
        seisCopas.imprimirCarta();
    }

}
