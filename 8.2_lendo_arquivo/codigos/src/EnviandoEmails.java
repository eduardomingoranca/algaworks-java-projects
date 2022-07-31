import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class EnviandoEmails {

    public static void main(String[] args) {

        // lendo o email
        try (BufferedReader reader = new BufferedReader(new FileReader("emails2.txt"))) {
            // enviando o email
            String email = null;
            while ((email = reader.readLine()) != null)
                System.out.println("Enviando email para: " + email);

        } catch (IOException e) {
            System.err.println("Nao conseguiu ler o arquivo. Erro: " + e.getMessage());
        }

    }
}
