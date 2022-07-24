package com.brazil.algaworks.introducaoxml;

import com.brazil.algaworks.introducaoxml.modelo.Produto;
import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.List;

public class LendoCarrinho {

    public static void main(String[] args) throws FileNotFoundException {
        XStream xStream = new XStream(new DomDriver());
        xStream.alias("produto", Produto.class);
        xStream.aliasAttribute(Produto.class, "codigo", "codigo");
        xStream.alias("carrinho", List.class);

        List<Produto> carrinho = (List<Produto>) xStream.fromXML(new FileInputStream("./carrinho.xml"));

        for (Produto p : carrinho) {
            System.out.println(p.getCodigo());
            System.out.println(p.getDescricao());
            System.out.println(p.getValor());
        }
    }
}
