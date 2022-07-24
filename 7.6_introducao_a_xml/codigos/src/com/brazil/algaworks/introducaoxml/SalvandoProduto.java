package com.brazil.algaworks.introducaoxml;

import com.brazil.algaworks.introducaoxml.modelo.Produto;
import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.math.BigDecimal;

public class SalvandoProduto {

    public static void main(String[] args) throws FileNotFoundException {
        XStream xStream = new XStream(new DomDriver());
        // informando no xml o nome da classe
        xStream.alias("produto", Produto.class);
        xStream.aliasAttribute(Produto.class, "codigo", "codigo");

        Produto sabonete = new Produto(1L, "sabonete", new BigDecimal("2.30"));

        // transformando o objeto em xml
        String xml = xStream.toXML(sabonete);

        System.out.println(xml);

        // enviando xml para um arquivo
        OutputStream os = new FileOutputStream("./produto2.xml");
        xStream.toXML(sabonete, os);

    }

}
