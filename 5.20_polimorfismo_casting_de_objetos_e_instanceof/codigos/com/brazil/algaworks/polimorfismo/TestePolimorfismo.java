package com.brazil.algaworks.polimorfismo;

public class TestePolimorfismo {

    public static void main(String[] args) {
        Conta conta = new Conta();
        conta.setSaldo(4000);
        TestePolimorfismo.imprimirSaldo(conta);
        System.out.println();
        // ------------------------------------------
        Conta contaCorrente = new ContaCorrente();
        contaCorrente.setSaldo(3500);
        imprimirSaldo(contaCorrente);
        System.out.println();
        // ------------------------------------------
        Conta contaPoupanca = new ContaPoupanca();
        contaPoupanca.setSaldo(2000);
        imprimirSaldo(contaPoupanca);
    }

    // o metodo aceita multiplos objetos relacionados a heranca
    public static void imprimirSaldo(Conta conta) {
        System.out.println("Saldo da conta: R$ " + conta.getSaldo());

        // instanceOf -> eh um operador que informa se uma determinada eh de um tipo de dado
        if (conta instanceof ContaCorrente) {
            ContaCorrente cc = (ContaCorrente) conta;
            System.out.println("O limite da conta corrente eh R$ " + cc.getLimite());
        }

        if (conta instanceof ContaPoupanca) {
            ContaPoupanca cp = (ContaPoupanca) conta;
            System.out.println("O rendimento da conta poupanca eh R$ " + cp.getRendimentos());
        }

    }

}
