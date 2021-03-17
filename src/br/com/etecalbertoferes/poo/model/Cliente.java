package br.com.etecalbertoferes.poo.model;

public class Cliente extends Pessoa{
    private long cpf;

    public long getCpf() {
        return cpf;
    }

    public Cliente setCpf(long cpf) {
        this.cpf = cpf;
        return this;
    }

    public Cliente(long cpf,String nome, String email, String endereco) {
        super(nome, email, endereco);
        this.cpf = cpf;
    }

    public void notificarCliente(String mensagem){
        System.out.println("Notificando cliente: "+getNome());
    }

    @Override
    public void enviarEmail(String destinatario, String remetente) {

    }

    @Override
    public String toString() {
        return "Cliente{" +
                "cpf=" + cpf +
                ", nome='" + getNome() + '\'' +
                ", email='" + getEmail() + '\'' +
                ", endereco='" + getEndereco() + '\'' +
                '}';
    }
}
