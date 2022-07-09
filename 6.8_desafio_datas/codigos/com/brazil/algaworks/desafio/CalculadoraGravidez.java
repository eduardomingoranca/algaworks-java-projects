package com.brazil.algaworks.desafio;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import static java.util.Calendar.WEEK_OF_MONTH;

public class CalculadoraGravidez {
    private Date dataUltimoPeriodoMenstrual;

    public CalculadoraGravidez(Date dataUltimoPeriodoMenstrual) {
        this.dataUltimoPeriodoMenstrual = dataUltimoPeriodoMenstrual;
    }

    private Calendar converterDateParaCalendar(Date data) {
        Calendar calendar = new GregorianCalendar();
        calendar.setTime(data);
        return calendar;
    }

    public Date calcularDataEstimadaConcepcao() {
        // implementar cálculo de data estimada da concepção
        // 2 semanas após a data do último período menstrual
        Calendar calendar = converterDateParaCalendar(this.dataUltimoPeriodoMenstrual);
        calendar.add(WEEK_OF_MONTH, 2);
        return calendar.getTime();
    }

    public Date calcularDataEstimadaParto() {
        // implementar cálculo de data estimada para parto
        // 40 semanas após a data do último período menstrual
        Calendar calendar = converterDateParaCalendar(this.dataUltimoPeriodoMenstrual);
        calendar.add(WEEK_OF_MONTH, 40);
        return calendar.getTime();
    }
}
