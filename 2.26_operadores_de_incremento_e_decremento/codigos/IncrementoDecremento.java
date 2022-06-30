public class IncrementoDecremento {
    public static void main(String[] args) {
        int idade = 10;

        int novaIdade = idade++;
        int novaIdade2 = ++idade;
        int novaIdade3 = idade--;
        int novaIdade4 = --idade;

        System.out.println("Idade: " + idade);
        System.out.println("Nova idade Incremento Depois: " + novaIdade);
        System.out.println("Nova idade Incremento Antes: " + novaIdade2);
        System.out.println("Nova idade Decremento Depois: " + novaIdade3);
        System.out.println("Nova idade Decremento Antes: " + novaIdade4);
    }
}
