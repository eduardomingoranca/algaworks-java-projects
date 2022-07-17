package com.brazil.algaworks.extra;

public class Produto {
    // sku -> codigo identificador unico
    private String sku;  // IHPD2360, IEPL1010, CHP021, CHPR21
    private String nome; // Impressora HP Deskjet 2360

    public Produto(String sku, String nome) {
        this.sku = sku;
        this.nome = nome;
    }

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Produto [sku = " + getSku() + ", nome = " + getNome() + "]";
    }

    // comparando se o hash sao iguais
    // hash agrupa dados semelhantes
    @Override
    public int hashCode() {
        // agrupando pela primeira letra do sku
        return this.getSku().charAt(0);
    }

    // comparando duas instancias pelo sku
    @Override
    public boolean equals(Object obj) {
        Produto outro = (Produto) obj;
        return this.getSku().equals(outro.getSku());
    }
}
