import java.io.*;
import java.net.Socket;

public class Client {

    public static void main(String[] args) throws IOException {
        // conectando no server
        Socket socket = new Socket("192.168.0.119", 3333);

        // saida de dados
        OutputStream saida = socket.getOutputStream();
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(saida);

        Pedido pedido = new Pedido();
        pedido.setCodigo(1L);
        pedido.setDescricao("Sabonete");
        pedido.setQuantidade(5);

        objectOutputStream.writeObject(pedido);

        // rebendo do servidor
        InputStream entrada = socket.getInputStream();
        DataInputStream dataInputStream = new DataInputStream(entrada);
        System.out.println("Recebeu do servidor: " + dataInputStream.readUTF());

        socket.close();
    }
}
