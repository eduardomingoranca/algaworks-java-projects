public class Principal {
    public static void main(String[] args) {
        Proprietario dono = new Proprietario();
        dono.nome = "John Winsbrook";

        Carro meuCarro = new Carro();
        meuCarro.modelo = "Palio";

        Carro seuCarro = new Carro();
        seuCarro.modelo = "Civic";

        meuCarro.dono = dono;
        seuCarro.dono = dono;

        System.out.println("Antes da mudanca");
        System.out.println(meuCarro.dono.nome);
        System.out.println(seuCarro.dono.nome);
        System.out.println(dono.nome);

        System.out.println();

        meuCarro.dono.nome = "Sebastian Brookston";

        System.out.println("Depois da mudanca");
        System.out.println(meuCarro.dono.nome);
        System.out.println(seuCarro.dono.nome);
        System.out.println(dono.nome);

    }
}
