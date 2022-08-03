package com.brazil.algaworks.chat.servidor;

import com.brazil.algaworks.chat.servidor.thread.RecebeMensagemCliente;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

public class Servidor {

    private List<RecebeMensagemCliente> clientes = new ArrayList<>();

    public static void main(String[] args) {
        Servidor servidor = new Servidor();
        servidor.aguardarConexoes();
    }

    public void aguardarConexoes() {
        try (ServerSocket server = new ServerSocket(3333)){
            while (true) {
                System.out.println("Aguardando conexoes...");
                Socket socket = server.accept();

                // thread para receber a mensagem do cliente
                RecebeMensagemCliente recebeMensagemCliente = new RecebeMensagemCliente(socket, this);
                new Thread(recebeMensagemCliente).start();

                // obtendo uma lista de clientes conectados ao servidor
                this.clientes.add(recebeMensagemCliente);
                System.out.println("Novo cliente conectado.");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void enviarMensagensClientes(String mensagem) {
        // enviando uma mensagem para cada cliente
        for (RecebeMensagemCliente cliente: this.clientes)
            cliente.enviarMensagem(mensagem);
    }

}
