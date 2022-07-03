public class Televisor {

    Integer canal;
    Integer volume;

    void mudarVolume(Integer novoVolume) {
        if (novoVolume == volume) {
            System.out.println("Novo volume é também o volume atual.");
        } else {
            volume = Integer.valueOf(novoVolume.byteValue());
            System.out.println("Volume alterado para " + volume);
        }
    }

    void mudarCanal(Integer novoCanal) {
        if (canal == novoCanal) {
            System.out.println("Novo canal é também o canal atual.");
        } else {
            canal = novoCanal;
            System.out.println("Canal alterado para " + canal);
        }
    }

}
