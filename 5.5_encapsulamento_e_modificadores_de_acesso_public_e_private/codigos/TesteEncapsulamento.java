public class TesteEncapsulamento {

    public static void main(String[] args) {
        ArCondicionado ar = new ArCondicionado(); // 17 - 45

        ar.trocarTemperatura(21);
        System.out.println("Temperatura do ar: " + ar.obterTemperatura());

        ar.trocarTemperatura(10);
        System.out.println("Temperatura do ar: " + ar.obterTemperatura());

    }
}


