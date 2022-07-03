public class Carro {
    String fabricante;
    String modelo;
    String cor;
    int anoDeFabricacao; // 0
    boolean biCombustivel; // false
    Proprietario dono; // null

    void ligar() {
        if(modelo != null) {
            System.out.println("Ligando o carro: " + modelo);
        }
    }

}
