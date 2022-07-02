public class Principal {
    public static void main(String[] args) {

        Carro meuCarro = new Carro();
        meuCarro.anoDeFabricacao = 2011;
        meuCarro.cor = "Prata";
        meuCarro.fabricante = "Fiat";
        meuCarro.modelo = "Palio";
        meuCarro.dono = new Proprietario();
        meuCarro.dono.nome = "John Silverstone";
        meuCarro.dono.cpf = "000.000.000-00";
        meuCarro.dono.idade = 25;
        meuCarro.dono.logradouro = "Rua John Templeton, 10";
        meuCarro.dono.bairro = "Centre";
        meuCarro.dono.cidade = "Chicago";
    }
}
