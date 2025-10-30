package br.univali.turma2502.questions2;

import java.util.Map;
import java.util.TreeMap;

/**

    5) Qual é saída do programa?

    a) "menu de convidado"
    b) "menu de admin"
    c) "null"
    d) Uma RuntimeException é lançada ao executar o programa

 */


public class Exercicio05 {

    public static void main(String[] args) {
        Map<Permissao, Menu> mapaMenu = new TreeMap<>();
        mapaMenu.put(Permissao.CONVIDADO, new MenuConvidado());
        mapaMenu.put(Permissao.ADMIN, new MenuAdmin());

        Menu menu = mapaMenu.get(Permissao.GERENTE);
        menu.exibir();
    }

    enum Permissao {
        CONVIDADO, GERENTE, ADMIN
    }

    interface Menu {
        void exibir();
    }

    static class MenuConvidado implements Menu {
        public void exibir() {
            System.out.println("menu de convidado");
        }
    }

    static class MenuAdmin implements Menu {
        public void exibir() {
            System.out.println("menu de admin");
        }
    }

}
