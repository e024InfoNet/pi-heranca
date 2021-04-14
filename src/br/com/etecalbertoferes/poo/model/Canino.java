package br.com.etecalbertoferes.poo.model;

public class Canino extends Animal{

    public Canino(String imageUrl, String alimento, String habitat, Integer fome) {
        super(imageUrl, alimento, habitat, fome);
    }

    public void patrulhar() {
        System.out.println(this.getClass().getSimpleName()+
                " patrulhando!");
    }
}
