public class ReplaceString {

    public static void main(String[] args) {
        // expressao regular eh uma maneira de procurar substrings dentro de uma string
        String texto = "O valor do produto eh R$ @x@.";

        String novoTexto = texto.replaceAll("@x+@", "2.50");
        System.out.println(novoTexto);
    }
}
