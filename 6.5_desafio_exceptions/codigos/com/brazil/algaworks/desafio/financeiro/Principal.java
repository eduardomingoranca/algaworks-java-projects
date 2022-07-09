package com.brazil.algaworks.desafio.financeiro;

public class Principal {

    public static void main(String[] args) {
        // instanciando fornecedores
        Fornecedor imobiliaria = new Fornecedor();
        imobiliaria.setNome("Casa & Cia Negócios Imobiliários");
        Fornecedor mercado = new Fornecedor();
        mercado.setNome("Mercado do João");

        // instanciando clientes
        Cliente atacadista = new Cliente();
        atacadista.setNome("Triângulo Quadrado Atacadista");
        Cliente telecom = new Cliente();
        telecom.setNome("FoneNet Telecomunicações");

        // instanciando contas a pagar
        ContaPagar contaPagar = new ContaPagar();
        contaPagar.setDescricao("Aluguel da matriz");
        contaPagar.setValor(1230d);
        contaPagar.setDataVencimento("10/05/2012");
        contaPagar.setFornecedor(imobiliaria);

        ContaPagar contaPagar2 = new ContaPagar(mercado, "Compras do mês", 390d, "19/05/2012");

        // instanciando contas a receber
        ContaReceber contaReceber = new ContaReceber();
        contaReceber.setDescricao("Desenvolvimento de projeto de logística em Java");
        contaReceber.setValor(89500d);
        contaReceber.setDataVencimento("23/05/2012");
        contaReceber.setCliente(atacadista);

        ContaReceber contaReceber2 = new ContaReceber(telecom, "Manutenção em sistema de conta online",
                53200d, "13/05/2012");

        // pagamento e cancelamento de contas a pagar
        try {
            contaPagar.pagar();
        } catch (OperacaoContaException e) {
            System.out.println(e.getMessage());
        }

        try {
            contaPagar2.cancelar();
        } catch (OperacaoContaException e) {
            System.out.println(e.getMessage());
        }

        // recebimento e cancelamento de contas a receber
        try {
            contaReceber.receber();
        } catch (OperacaoContaException e) {
            System.out.println(e.getMessage());
        }

        try {
            contaReceber2.cancelar();
        } catch (OperacaoContaException e) {
            System.out.println(e.getMessage());
        }
    }

}
