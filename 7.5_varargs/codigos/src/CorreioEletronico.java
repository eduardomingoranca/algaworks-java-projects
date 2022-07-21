public class CorreioEletronico {

    // String... -> o numero de argumentos passados eh variavel
    public void enviarEmails(String... emails) {

        // Percorrer todos os emails recebidos
        for (String email: emails) {
            // envia email
            System.out.println("Email enviado para " + email);
        }
    }
}
