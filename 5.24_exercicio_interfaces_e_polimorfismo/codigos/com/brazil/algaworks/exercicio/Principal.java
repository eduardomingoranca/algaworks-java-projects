package com.brazil.algaworks.exercicio;

import com.brazil.algaworks.exercicio.models.Barco;
import com.brazil.algaworks.exercicio.models.Carro;
import com.brazil.algaworks.exercicio.models.Imovel;
import com.brazil.algaworks.exercicio.models.Notebook;
import com.brazil.algaworks.exercicio.views.CorretoraSeguros;

public class Principal {

    public static void main(String[] args) {
        CorretoraSeguros corretora = new CorretoraSeguros();

        Carro meuCarro = new Carro(45000d, 2012);
        Imovel minhaCasa = new Imovel(920000, 320);
        Barco meuBarco = new Barco(56000d, 2023);
        Notebook meuNotebook = new Notebook(1200d, 2024);

        corretora.fazerPropostaSeguro(meuCarro);
        corretora.fazerPropostaSeguro(minhaCasa);
        corretora.fazerPropostaSeguro(meuBarco);
        corretora.fazerPropostaSeguro(meuNotebook);
    }
}
