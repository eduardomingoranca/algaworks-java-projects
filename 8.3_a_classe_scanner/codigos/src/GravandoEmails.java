import java.io.IOException;
import java.io.PrintStream;

public class GravandoEmails {

    public static void main(String[] args) {
        String[] emails = {"john@mail.com", "mary@mail.com", "richard@mail.com"};

        // armazenando no buffer e gravando os emails no arquivo
//        try (BufferedWriter writer = new BufferedWriter(new FileWriter("emails.txt", true))) {
        try (PrintStream writer = new PrintStream("emails2.txt")) {
            // percorrendo a lista de emails e escrevendo/adicionando no arquivo
            for (String email : emails) {
//                writer.write(email);
//                writer.newLine();
                writer.println(email);
            }

        } catch (IOException e) {
            System.out.println("Nao conseguiu gravar o arquivo." + e.getMessage());
        }

    }
}
