public class ExemploSeparadorDigitosLiterais {

    public static void main(String[] args) {
        long populacaoSaoPaulo = 11_000_000L;
        long populacaoGrandeSaoPaulo = 11_000_000 + 9_000_000;

        System.out.printf("Populacao Sao Paulo: %d\n", populacaoSaoPaulo);
        System.out.printf("Populacao da Grande Sao Paulo: %d\n", populacaoGrandeSaoPaulo);

        double precoVeiculo = 200_000.99_1d;
        System.out.printf("Preco veiculo: %.3f\n", precoVeiculo);

        // evite usar
        int x = 1____2____3;
        int y = 1_2_3;

        System.out.printf("Sao iguais: %b\n", (x == y));
    }
}
