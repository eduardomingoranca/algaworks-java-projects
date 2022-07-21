public class TesteCorreioEletronico {

    public static void main(String[] args) {
        CorreioEletronico correioEletronico = new CorreioEletronico();

//        EXEMPLO 01
//        String[] emails = new String[2];
//        emails[0] = "johnklipspringer@mail.com";
//        emails[1] = "marycalhoun@mail.com";
//        correioEletronico.enviarEmails(emails);

//        EXEMPLO 02
//        correioEletronico.enviarEmails(new String[]{ "kevinhirsch@mail.com", "louisetipton@mail.com"});

//        EXEMPLO 03 - VAR ARGS
    correioEletronico.enviarEmails("lewissmith@mail.com", "juliagrey@mail.com", "peterwashington@mail.com");

    }
}
