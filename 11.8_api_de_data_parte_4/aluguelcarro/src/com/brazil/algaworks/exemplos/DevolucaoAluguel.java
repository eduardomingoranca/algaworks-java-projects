package com.brazil.algaworks.exemplos;

import com.brazil.algaworks.model.Aluguel;
import com.brazil.algaworks.model.Carro;
import com.brazil.algaworks.model.Cliente;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Year;

import static java.time.LocalDate.now;
import static java.time.LocalDate.of;
import static java.time.Month.AUGUST;

public class DevolucaoAluguel {

    public static void main(String[] args) {
        Aluguel aluguel = recuperarAluguel();

        // Para cada hora de atraso, ele paga 10% do valor do carro em multa
        LocalDateTime dataEHoraRealDaDevolucao = LocalDateTime.of(LocalDate.now().plusDays(1),
                LocalTime.now());
        aluguel.setDataEHoraRealDaDevolucao(dataEHoraRealDaDevolucao);
        aluguel.imprimeFatura();
    }

    private static Aluguel recuperarAluguel() {
        Cliente cliente = new Cliente("John Klipspringer", of(1996, AUGUST, 13));
        Carro carro = new Carro("Gol", 90.0, Year.of(2012));

        LocalDateTime dataEHoraDaRetirada = LocalDateTime.of(now(),
                LocalTime.of(LocalTime.now().getHour(), 0));

        LocalDateTime dataEHoraPrevistaParaDevolucao = LocalDateTime.now().plusDays(3).plusHours(2);

        return new Aluguel(cliente, carro, dataEHoraDaRetirada, dataEHoraPrevistaParaDevolucao);
    }

}
