package com.brazil.algaworks.datas;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class TesteCalendar {

    public static void main(String[] args) {
        Calendar calendar = new GregorianCalendar();

        calendar.set(Calendar.DAY_OF_MONTH, 31);
        calendar.set(Calendar.MONTH, 0);
        calendar.set(Calendar.YEAR, 2020);
        calendar.set(Calendar.HOUR_OF_DAY, 10);
        calendar.set(Calendar.MINUTE, 30);
        calendar.set(Calendar.SECOND, 0);

        DateFormat format = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        System.out.println(format.format(calendar.getTime()));


        calendar.add(Calendar.DAY_OF_MONTH, 1);
        System.out.println(format.format(calendar.getTime()));


        calendar.add(Calendar.DAY_OF_MONTH, -2);
        System.out.println(format.format(calendar.getTime()));

        calendar.add(Calendar.MONTH, -1);
        System.out.println(format.format(calendar.getTime()));

        calendar.add(Calendar.MONTH, 1);
        System.out.println(format.format(calendar.getTime()));

        calendar.roll(Calendar.DAY_OF_MONTH, 1);
        System.out.println(format.format(calendar.getTime()));

    }

}
