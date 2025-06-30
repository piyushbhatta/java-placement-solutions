package theRandomClass;

import java.util.Random;

public class rollsTwoDice {
    public static void main(String[] args) {
        process();
    }
    public static void process(){
        Random Rand = new Random();
        int tries=0;
        int die1;
        int die2;
        do{
            die1 = Rand.nextInt(6)+1;
            die2 = Rand.nextInt(6)+1;
            System.out.println(die1+","+die2);
            tries++;
        }while(die1!=die2);
        System.out.println("It took you "+ tries +" tries");
    }
}
