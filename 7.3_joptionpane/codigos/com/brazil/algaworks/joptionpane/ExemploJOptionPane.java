package com.brazil.algaworks.joptionpane;

import javax.swing.*;

public class ExemploJOptionPane {

    public static void main(String[] args) throws UnsupportedLookAndFeelException, ClassNotFoundException, InstantiationException, IllegalAccessException {
        UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());

        JOptionPane.showMessageDialog(null, "Seu cadastro foi realizado com sucesso!");

    }

}

