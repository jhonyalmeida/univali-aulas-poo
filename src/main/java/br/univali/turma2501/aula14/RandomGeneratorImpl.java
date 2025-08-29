package br.univali.turma2501.aula14;

import java.util.Random;

public class RandomGeneratorImpl implements RandomGenerator {

    public int getRandomInt() {
        Random random = new Random();
        return random.nextInt(10) + 1;
    }

}
