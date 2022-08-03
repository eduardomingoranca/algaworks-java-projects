package com.brazil.algaworks.chat.cliente;

import com.brazil.algaworks.chat.cliente.gui.JanelaGui;

import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

public class Cliente extends JanelaGui {

    private Socket socket;

    public static void main(String[] args) {
        new Cliente();
    }

    @Override
    protected boolean conectar() {
        System.out.println("Conectando no servidor...");

        try {
            // conexao com o servidor
            this.socket = new Socket("127.0.0.1", 3333);

            // a thread sera iniciada apos a conexao com o servidor
            RecebeMensagemServidor recebeMensagemServidor = new RecebeMensagemServidor(this.socket, this);
            new Thread(recebeMensagemServidor).start();

        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }

        return true;
    }

    @Override
    protected void sendMessage(String mensagem) {
        System.out.println("Envia a mensagem via socket para o servidor - " + mensagem);

        // enviando uma mensagem para o servidor via socket
        try {
            // fluxo de saida
            OutputStream os = this.socket.getOutputStream();
            // enviando dados no fluxo de saida no padrao utf
            DataOutput dos = new DataOutputStream(os);
            dos.writeUTF(mensagem);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
