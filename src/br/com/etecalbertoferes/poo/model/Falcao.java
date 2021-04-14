package br.com.etecalbertoferes.poo.model;

public class Falcao extends Aves implements Voavel{

    public Falcao(String imageUrl, String alimento, String habitat, Integer fome) {
        super(imageUrl, alimento, habitat, fome);
    }

    @Override
    public void voar() {
        System.out.println("Falcão voando!");
    }
}
