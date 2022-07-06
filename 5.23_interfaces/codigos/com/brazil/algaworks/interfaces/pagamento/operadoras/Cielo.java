package com.brazil.algaworks.interfaces.pagamento.operadoras;

import com.brazil.algaworks.interfaces.pagamento.Autorizavel;
import com.brazil.algaworks.interfaces.pagamento.Cartao;
import com.brazil.algaworks.interfaces.pagamento.Operadora;

public class Cielo implements Operadora {

    @Override
    public boolean autorizar(Autorizavel autorizavel, Cartao cartao) {
        return cartao.getNumeroCartao().startsWith("123") &&
                autorizavel.getValorTotal() < 100;
    }

}
