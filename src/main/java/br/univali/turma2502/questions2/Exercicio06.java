package br.univali.turma2502.questions2;

/**

    6) Que classes tem acesso direto ao atributo dados?

    a) apenas Conteudo
    b) apenas Conteudo e suas superclasses
    c) qualquer classe
    d) classes Conteudo, Video a Audio

 */


public class Exercicio06 {

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
            System.out.println("Executando áudio" + dados);
        }
    }

}
