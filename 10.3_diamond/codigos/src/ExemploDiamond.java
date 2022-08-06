import java.util.*;

public class ExemploDiamond {

    public static void main(String[] args) {
        List<String> nomesClientes = new ArrayList<>();
        nomesClientes.add("John");
        nomesClientes.add("Mary");

        Map<String, Set<String>> carrosPorMontadora = new HashMap<>();
        carrosPorMontadora.put("Chevrolet", new HashSet<String>());
        carrosPorMontadora.get("Chevrolet").add("Cruze");

        Set<String> carrosDaVolks;
        carrosPorMontadora.put("Volks", carrosDaVolks = new HashSet<>());
        carrosPorMontadora.get("Volks").add("Gol");

    }
}
