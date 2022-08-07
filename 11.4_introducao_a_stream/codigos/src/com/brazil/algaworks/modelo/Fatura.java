package com.brazil.algaworks.modelo;

public class Fatura {

    private String email;
    private double valor;

    public Fatura(String email, double valor) {
        this.email = email;
        this.valor = valor;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public boolean estaEmRisco() {
        return getValor() >= 250.0;
    }

    @Override
    public String toString() {
        return "Email: " + getEmail() + ". Valor R$ " + getValor();
    }

}
