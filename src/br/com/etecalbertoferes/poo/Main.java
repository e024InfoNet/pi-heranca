package br.com.etecalbertoferes.poo;

import br.com.etecalbertoferes.poo.config.Parametros;
import br.com.etecalbertoferes.poo.model.*;

public class Main {

    public static double  a = 10;
    public static void main(String[] args) {
        var leao = new Leao("/images/lion.png",
                "carne","selva", 10);

        var aguia = new Aguia("/images/eagle.png",
                "carne","savana", 7);

        var falcao = new Falcao("/images/falcon.png",
                "carne","savana", 7);

        var ornitorrinco = new Ornitorrinco("/images/perry.png",
                "peixes","alasca", 6);

        var pinguin = new Pinguin("/images/penguin.png",
                "peixes","alasca", 6);


        System.out.println(leao);
        leao.emitirSom();
        leao.patrulhar();
        System.out.println(aguia);
        aguia.emitirSom();
        aguia.voar();
        System.out.println(ornitorrinco);
        System.out.println(pinguin);

    }

    /**
     * Exemplo de acesso de escopo de variáveis locais e estaticas golbais.
     */
    public static void novoMetodoDeMain() {
        System.out.println("Novo metodo de Main exibindo A:" + a);
    }

    /**
     * Exemplo de uso de atributos estaticos em uma classe de configuração
     */
    static void conectarBanco(){
        System.out.printf("Conectando ao host: %s, na porta: %s, com o usuario: %s com a senha: %s no bando: %s",
                Parametros.host, Parametros.porta,
                Parametros.usuario, Parametros.senha, Parametros.banco);
    }
}
