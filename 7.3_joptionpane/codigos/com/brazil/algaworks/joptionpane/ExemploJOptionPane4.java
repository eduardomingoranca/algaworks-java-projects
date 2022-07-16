package com.brazil.algaworks.joptionpane;

import javax.swing.*;

public class ExemploJOptionPane4 {

    public static void main(String[] args) throws UnsupportedLookAndFeelException, ClassNotFoundException, InstantiationException, IllegalAccessException {
        UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());

        Object[] possibilidades = {"Masculino", "Feminino"};

        String sexo = (String) JOptionPane.showInputDialog(null, "Selecione sexo", "Algaworks",
                JOptionPane.PLAIN_MESSAGE, null, possibilidades, possibilidades[0]);

        System.out.println("Sexo selecionado: " + sexo);

        String nome = (String) JOptionPane.showInputDialog(null, "Informe o nome", "Algaworks",
                JOptionPane.PLAIN_MESSAGE, null, null, null);

        System.out.println("O nome informado eh: " + nome);
    }
}
