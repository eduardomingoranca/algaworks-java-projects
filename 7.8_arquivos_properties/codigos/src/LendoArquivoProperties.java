import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class LendoArquivoProperties {

    public static void main(String[] args) throws IOException {
        Properties prop = new Properties();
        prop.load(new FileInputStream("./config/config.properties"));

        // conectar no banco de dados...
        String url = prop.getProperty("database.url");
        String usuario = prop.getProperty("database.user");
        String senha = prop.getProperty("database.password");

        System.out.printf("Conectando no banco de dados de url: %s e usuario: %s\n", url, usuario);

        try {
            // imagina que isso veio de uma configuracao errada do banco de dados.
            int x = 5 / 0;
        } catch (Exception e) {
            // Se acontecer algum erro, voce precisa informar o administrador por email
            String email = prop.getProperty("email.admin");
            System.out.printf("Enviando email para: %s informando o erro: %s\n", email, e.getMessage());
        }

    }
}
