package com.brazil.algaworks.javadoc.modelo;

/**
 * Representa um funcionario da empresa...
 *
 *
 * @author Eduardo Walderrama
 */
public class Funcionario {
    private String nome;
    private double salario;

    /**
     * Nao utilize mais, pois o salario eh obrigatorio para outros metodos.
     *
     * @deprecated
     * @param nome
     */
    public Funcionario(String nome) {
        this.nome = nome;
    }

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    /**
     * Calcula o adiantamento em dinheiro que devera ser pago ao funcionario.
     *
     * <p>O valor da diaria eh calculado dividindo-se o <b>salario base por 30 (dias do mes)</b>.</p>
     *
     * Caso o destino for uma capital, eh adicionado 20% no valor do adiantamento.
     *
     * @param   dias
     *          Quantidade de dias da viagem.
     *
     * @param   capital
     *          Indica se eh ou nao uma capital brasileira.
     *
     * @return O valor em reais do adiantamento.
     *
     * @throws IllegalArgumentException
     *         Caso {@code dias} for menor ou igual a zero.
     * 
     * @since  1.1.0
     *
     * @see Viagem
     */
    public double adiantamentoViagem(int dias, boolean capital) {
        if (dias <= 0)
            throw new IllegalArgumentException("Dias deve ser maior que zero.");

        double valorDiaria = salario / 30;
        double valorAdiantamento = valorDiaria * dias;

        if (capital)
            valorAdiantamento *= 1.20;

        return valorAdiantamento;
    }

}
