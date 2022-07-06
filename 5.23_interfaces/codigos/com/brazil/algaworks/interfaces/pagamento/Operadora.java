package com.brazil.algaworks.interfaces.pagamento;

public interface Operadora {
    boolean autorizar(Autorizavel autorizavel, Cartao cartao);
}
