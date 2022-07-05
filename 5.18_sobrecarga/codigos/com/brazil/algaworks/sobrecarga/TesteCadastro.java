package com.brazil.algaworks.sobrecarga;

public class TesteCadastro {

    public static void main(String[] args) {
        CadastroPessoa cadastroPessoa = new CadastroPessoa();

        Pessoa pessoa = new Pessoa("Joseph", 32);
        cadastroPessoa.cadastrar(pessoa);

        // ---------------------------------------------------

        cadastroPessoa.cadastrar("Mary", 25);
    }
}
