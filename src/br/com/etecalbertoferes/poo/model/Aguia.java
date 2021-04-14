package br.com.etecalbertoferes.poo.model;

public class Aguia extends Aves implements Voavel{
    public Aguia(String imageUrl, String alimento, String habitat, Integer fome) {
        super(imageUrl, alimento, habitat, fome);
    }

    @Override
    public void voar() {
        System.out.println("Aguia voando!");
    }
}
