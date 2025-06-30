package theRandomClass;

import java.util.Random;

public class Rand {
    public static void main(String[] args) {
        Random Rand = new Random();
        int random = Rand.nextInt(100);
        System.out.println(random);
    }
}
