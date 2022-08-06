import java.util.Scanner;

public class ExemploTryEMultiCast {

    public static void main(String[] args) {
        try(Scanner entrada = new Scanner(System.in)) {

            System.out.print("Informe o nome: ");
            String nome = entrada.nextLine();

            System.out.print("Informe a idade: ");
            String idade = entrada.nextLine();

            try{
                SalvarAluno.salvar(nome, idade);
            } catch (NegocioException | NumberFormatException e) {
                System.err.println("Impossivel completar operacao. Motivo: " + e.getMessage());
            }
        }
    }
}
