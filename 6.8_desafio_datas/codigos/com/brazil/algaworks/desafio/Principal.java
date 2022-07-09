package com.brazil.algaworks.desafio;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        new Principal();
    }

    public Principal() {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Data do ultimo período menstrual (dd/mm/aaaa): ");
            String ultimoPeriodoMenstrual = scanner.nextLine();

            Date dataUltimoPeriodoMenstrual = this.converterEmData(ultimoPeriodoMenstrual);
            CalculadoraGravidez calculadora = new CalculadoraGravidez(dataUltimoPeriodoMenstrual);

            Date dataEstimadaConcepcao = calculadora.calcularDataEstimadaConcepcao();
            System.out.println("Data estimada da concepcao: "
                    + this.formatarData(dataEstimadaConcepcao));

            Date dataEstimadaParto = calculadora.calcularDataEstimadaParto();
            System.out.println("Data estimada para parto: "
                    + this.formatarData(dataEstimadaParto));
        } catch (ParseException e) {
            System.out.println("Informe uma data no padrao dd/mm/aaaa.");
        }

        scanner.close();
    }

    private String formatarData(Date data) {
        // Padrão de formatação de data por extenso
        // A classe Locale representa uma região no planeta, sendo neste caso
        // o Brasil (br), onde falamos Português (pt)
        // O Locale é usado aqui para formatar a data em português brasileiro
        DateFormat formatador = new SimpleDateFormat("EEEE, dd 'de' MMMM 'de' yyyy",
                new Locale("pt", "br"));
        return formatador.format(data);
    }

    private Date converterEmData(String texto) throws ParseException {
        // implementar conversão de texto para data no formato dd/MM/yyyy
        DateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        Date date = format.parse(texto);
        return date;
    }

}
