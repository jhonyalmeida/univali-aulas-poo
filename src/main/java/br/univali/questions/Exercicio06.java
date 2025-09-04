package br.univali.questions;

/**

    6) Que conceito é aplicado neste trecho de código entre as classes Conteudo, Video e Audio?

    a) Abstração
    b) Polimorfismo
    c) Encapsulamento
    d) Herança

    [Bônus]
    6.1) O que uma classe abstrata pode possuir, que uma interface não pode?

    a) Métodos públicos
    b) Membros estáticos
    c) Métodos abstratos
    d) Atributos

    [Bônus]
    6.2) Que classes tem acesso direto ao atributo dados?

    a) apenas Conteudo
    b) Conteudo, Video a Audio
    c) todas as classes do mesmo pacote
    d) qualquer classe

 */

public class Exercicio06 {

}

abstract class Conteudo {
    protected byte[] dados;

    abstract void executar();
}

class Video extends Conteudo {
    void executar() {
        System.out.println("Executando vídeo");
    }
}

class Audio extends Conteudo {
    void executar() {
        System.out.println("Executando áudio");
    }
}
