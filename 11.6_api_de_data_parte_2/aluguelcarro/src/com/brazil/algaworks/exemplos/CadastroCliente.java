package com.brazil.algaworks.exemplos;

import com.brazil.algaworks.model.Cliente;

import java.time.Period;

import static java.time.LocalDate.now;
import static java.time.LocalDate.of;
import static java.time.Month.AUGUST;

public class CadastroCliente {

    public static void main(String[] args) {
        Cliente cliente = new Cliente("John Klipspringer", of(1996, AUGUST, 13));

        int idade = Period.between(cliente.getDataNascimento(), now()).getYears();

        if (idade >= 18) System.out.printf("Ok, pode ser cadastrado. Sua idade eh: %d", idade);
        else System.err.printf("Sua idade eh: %d. Entao nao pode ter carteira.", idade);

    }

}
