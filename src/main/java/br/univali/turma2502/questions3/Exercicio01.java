package br.univali.turma2502.questions3;

/**
 1) Qual é a saída do programa abaixo?

 a) "P3 P1 P2"
 b) "P1 P3 P2"
 c) "P1 P2 P3"
 d) "P1 P2"

 */

public class Exercicio01 {

    public static void main(String[] args) {
        new Exercicio01();
    }

    public Exercicio01() {
        Menu menu = new MenuProxy(new MenuPrincipal());
        menu.exibir();
    }

    interface Menu {
        void exibir();
    }

    static class MenuPrincipal implements Menu {
        public void exibir() {
            System.out.print("P3 ");
        }
    }

    static class MenuProxy implements Menu {
        private Menu menu;

        public MenuProxy(Menu menu) {
            this.menu = menu;
        }

        public  void exibir() {
            System.out.print("P1 ");
            menu.exibir();
            System.out.print("P2 ");
        }
    }

}
