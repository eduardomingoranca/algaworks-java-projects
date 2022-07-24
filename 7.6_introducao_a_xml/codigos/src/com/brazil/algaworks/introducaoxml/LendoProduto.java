package com.brazil.algaworks.introducaoxml;

import com.brazil.algaworks.introducaoxml.modelo.Produto;
import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class LendoProduto {

    public static void main(String[] args) throws FileNotFoundException {
        XStream xStream = new XStream(new DomDriver());
        // informando no xml o nome da classe
        xStream.alias("produto", Produto.class);
        xStream.aliasAttribute(Produto.class, "codigo", "codigo");

        // lendo um xml e transformando xml em object
        Produto p = (Produto) xStream.fromXML(new FileInputStream("./produto2.xml"));
        System.out.println(p.getCodigo());
        System.out.println(p.getDescricao());
        System.out.println(p.getValor());

    }
}
