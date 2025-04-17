package br.univali.aula07;

import br.univali.aula04.*;

import java.util.*;

public class Aula07Exceptions {

    public static void main(String[] args) {
        Cargo c1 = new Cargo("Admin");
        Usuario u1 = new Usuario(1L, "Fred", "fred@yahoo.com", c1);
        Usuario u2 = new Usuario(2L, "Lara", "lara@croft.com", c1);
        Status s1 = new Status(1, "Pendente");
        Status s2 = new Status(2,"Em andamento");
        Tarefa t1 = new TarefaEscolar("Estudar pra prova", "", u1, "26/03/25", s1, "28/03/25", "Matemática");
        try {
            t1.alterarStatus(u2, s2);
            System.out.println("conseguiu!!!!");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("encerrando...");
        }
    }

    private void listas() {
        Cargo c1 = new Cargo("programador");
        Cargo c2 = new Cargo("programador 2");
        Cargo c3 = new Cargo("programador 3");
        List<Cargo> objetos = new LinkedList<>();
        objetos.add(c1);
        objetos.add(c3);
        objetos.add(c2);
        objetos.add(c2);
        for (Cargo o : objetos) {
            System.out.println(o);
        }
    }

    private static void conjunto() {
        Cargo c1 = new Cargo("programador");
        Cargo c2 = new Cargo("desenvolvedor");
        Cargo c3 = new Cargo("maker de programas");
        Usuario user1 = new Usuario(76L, "User1", "", c1);
        Usuario user2 = new Usuario(34L, "User2", "", c2);
        Set<Cargo> objetos = new TreeSet<>(new CargoComparator());
        objetos.add(c1);
        objetos.add(c2);
        objetos.add(c3);
        Set<Usuario> usuarios = new TreeSet<>();
        usuarios.add(user1);
        usuarios.add(user2);
        for (Usuario o : usuarios) {
            System.out.println(o);
        }
    }

    private void mapas() {
        Cargo c1 = new Cargo("programador");
        Cargo c2 = new Cargo("programador 2");
        Cargo c3 = new Cargo("programador 2");
        Usuario user1 = new Usuario(1L, "User1", "", c1);
        Usuario user2 = new Usuario(2L, "User2", "", c2);
        Map<Cargo, Usuario> usuarios = new HashMap<>();
        usuarios.put(c1, user1);
        usuarios.put(c2, user2);
        System.out.println(usuarios.get(c3));
    }

}
