package br.com.etecalbertoferes.poo.model;

public class Desenvolvedor extends Pessoa implements Playable {

    public Desenvolvedor(String nome, String email, String endereco) {
        super(nome, email, endereco);
    }

    @Override
    public void enviarEmail(String destinatario, String remetente) {

    }

    @Override
    public void jogarLoL() {

    }

    @Override
    public void jogarMinecraft() {

    }
}
