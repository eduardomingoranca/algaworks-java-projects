package com.brazil.algaworks.exercicio.sobrecarga.models;

public class MaquinaCafe {

    private int acucarDisponivel;

    public int getAcucarDisponivel() {
        return acucarDisponivel;
    }

    public void setAcucarDisponivel(int acucarDisponivel) {
        this.acucarDisponivel = acucarDisponivel;
    }

    public void fazerCafe() {
        fazerCafe(10);
    }

    public void fazerCafe(int quantidadeAcucar) {
        if (getAcucarDisponivel() < quantidadeAcucar) {
            System.out.println("Não há açucar suficiente para fazer seu café.");
        } else {
            acucarDisponivel -= quantidadeAcucar;
            System.out.println("Fazendo cafezinho com " + quantidadeAcucar + " gramas de açucar.");
        }
    }

}
