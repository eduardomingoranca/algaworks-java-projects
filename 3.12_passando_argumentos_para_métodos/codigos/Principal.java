public class Principal {

    public static void main(String[] args) {
        FolhaPagamento folha = new FolhaPagamento();
        double salario = folha.calcularSalario(160, 12, 12.5, 40.2);

        System.out.println("Salario calculado: " + salario);
    }

}
