package com.brazil.algaworks.interfaces;

import com.brazil.algaworks.interfaces.caixa.Checkout;
import com.brazil.algaworks.interfaces.caixa.Compra;
import com.brazil.algaworks.interfaces.impressao.Impressora;
import com.brazil.algaworks.interfaces.impressao.impressoras.ImpressoraEpson;
import com.brazil.algaworks.interfaces.impressao.impressoras.ImpressoraHP;
import com.brazil.algaworks.interfaces.pagamento.Cartao;
import com.brazil.algaworks.interfaces.pagamento.Operadora;
import com.brazil.algaworks.interfaces.pagamento.operadoras.Cielo;
import com.brazil.algaworks.interfaces.pagamento.operadoras.RedeCard;

public class TesteCheckout {

    public static void main(String[] args) {
        Operadora operadora = new RedeCard();
        Impressora impressora = new ImpressoraHP();

        Cartao cartao = new Cartao();
        cartao.setNomeTitular("John M Cotton");
        cartao.setNumeroCartao("456");

        Compra compra = new Compra();
        compra.setNomeCliente("John Milton Cotton");
        compra.setProduto("Sabonete");
        compra.setValorTotal(120);

        Checkout checkout = new Checkout(operadora, impressora);
        checkout.fecharCompra(compra, cartao);

    }

}
