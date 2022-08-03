package com.brazil.algaworks.chat.cliente;

import com.brazil.algaworks.chat.cliente.gui.JanelaGui;

import java.io.DataInputStream;
import java.io.InputStream;
import java.net.Socket;

public class RecebeMensagemServidor implements Runnable{

    private Socket socket;
    private JanelaGui janela;

    public RecebeMensagemServidor(Socket socket, JanelaGui janela) {
        this.socket = socket;
        this.janela = janela;
    }

    // quando a thread for iniciada o metodo run sera executado
    @Override
    public void run() {
        while (true) {
            // lendo as mensagens recebidas via socket e adicionando na janela de exibicao
            try {
                // recebendo uma mensagem no fluxo de entrada
                InputStream is = this.socket.getInputStream();
                DataInputStream dis = new DataInputStream(is);

                String msgRecebida = dis.readUTF();

                janela.adicionaMensagem(msgRecebida);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
