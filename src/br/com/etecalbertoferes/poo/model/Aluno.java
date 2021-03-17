package br.com.etecalbertoferes.poo.model;

public class Aluno extends Pessoa{

    private int ra;

    public int getRa() {
        return ra;
    }

    public Aluno setRa(int ra) {
        this.ra = ra;
        return this;
    }

    /**
     * Construtor de classe com reuso do construtor da classe pai (super)
     * @param ra
     * @param nome
     * @param email
     * @param endereco
     */
    public Aluno(int ra, String nome, String email, String endereco) {
        super(nome, email, endereco);
        this.ra = ra;
    }


    /**
     * Implementacao obrigatoria  a partir da classe abstrata Pessoa
     * @param destinatario
     * @param remetente
     */
    @Override
    public void enviarEmail(String destinatario, String remetente) {

    }

    @Override
    public String toString() {
        return "Aluno{" +
                "ra=" + ra +
                ", nome='" + getNome() + '\'' +
                ", email='" + getEmail() + '\'' +
                ", endereco='" + getEndereco() + '\'' +
                '}';
    }

}
