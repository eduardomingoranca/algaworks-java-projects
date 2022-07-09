package com.brazil.algaworks.datas;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TesteDatas {

    public static void main(String[] args) {
        Date hoje = new Date();
        System.out.println(hoje);

        DateFormat format = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        System.out.println(format.format(hoje));

        String dataAniversario = "20/01/1995";
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        try {
            Date aniversario = dateFormat.parse(dataAniversario);
            System.out.println(format.format(aniversario));
        } catch (ParseException e) {
            System.out.println("Formato de data invalida");
        }
    }

}
