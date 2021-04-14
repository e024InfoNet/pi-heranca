package br.com.etecalbertoferes.poo.model;

public abstract class Animal {
    private String imageUrl;
    private String alimento;
    private String habitat;
    private Integer fome;

    public Animal(String imageUrl, String alimento, String habitat, Integer fome) {
        this.imageUrl = imageUrl;
        this.alimento = alimento;
        this.habitat = habitat;
        this.fome = fome;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public Animal setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
        return this;
    }

    public String getAlimento() {
        return alimento;
    }

    public Animal setAlimento(String alimento) {
        this.alimento = alimento;
        return this;
    }

    public String getHabitat() {
        return habitat;
    }

    public Animal setHabitat(String habitat) {
        this.habitat = habitat;
        return this;
    }

    public Integer getFome() {
        return fome;
    }

    public Animal setFome(Integer fome) {
        this.fome = fome;
        return this;
    }

    public void emitirSom() {
        System.out.println(this.getClass().getSimpleName()+
                " emitindo som!");
    }

    public void dormir() {
        System.out.println(this.getClass().getSimpleName()+
                " dormindo!");
    }

    public void comer() {
        System.out.println(this.getClass().getSimpleName()+
                " comendo!");
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName()+"{" +
                "imageUrl='" + imageUrl + '\'' +
                ", alimento='" + alimento + '\'' +
                ", habitat='" + habitat + '\'' +
                ", fome=" + fome +
                '}';
    }
}
