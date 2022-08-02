import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        // na maquina que estiver executando abrindo na porta informada
        ServerSocket server = new ServerSocket(3333);

        System.out.println("Aguardando conexao...");
        // aguardando a conexao do cliente
        Socket socket = server.accept();
        System.out.println("Conectando a: " + socket.getRemoteSocketAddress());

        // recebendo a conexao
        InputStream entrada = socket.getInputStream();
        // rebendo um objeto
        ObjectInputStream objectInputStream = new ObjectInputStream(entrada);

        // lendo o objeto
        Pedido pedido = (Pedido) objectInputStream.readObject();
        System.out.println("Codigo: " + pedido.getCodigo());
        System.out.println("Descricao: " + pedido.getDescricao());
        System.out.println("Quantidade: " + pedido.getQuantidade());

        OutputStream saida = socket.getOutputStream();
        DataOutput dataOutput = new DataOutputStream(saida);
        dataOutput.writeUTF("Recebido com sucesso!");

        server.close();
    }
}
