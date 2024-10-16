import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Tamagotchi {
    Scanner key = new Scanner(System.in);
    private int hunger = 0;
    private int boredom = 0;
    private boolean isAlive;
    String name;
    private Random rand = new Random();
    private ArrayList<String> words = new ArrayList<String>();


    public Tamagotchi(String incomingName) {
        name = incomingName;
        isAlive = true;
        rand.nextInt(10);
        words.add("'Hello!'");
        words.add("'(>⩊<)'");
        words.add("'o(≧▽≦)o'");
    }

    public void tick() throws InterruptedException {
        hunger = hunger + 2;
        boredom = boredom + 3;

        if (hunger >= 10) {
            isAlive = false;
            System.out.println("You neglected to take care of your pet.");
            Thread.sleep(1500);
            System.out.println(name + " has died.");
            Thread.sleep(1000);
            System.out.println("It has moved on to a place that knows no boredom, where it's belly will always be full and it's coat always clean and fluffy.");
            Thread.sleep(2000);
            System.out.println("R.I.P.");
        } else if (boredom >= 10) {
            isAlive = false;
            System.out.println("You neglected to take care of your pet.");
            Thread.sleep(1500);
            System.out.println(name + " ran away. It was eventually found and adopted by a loving family.");
            Thread.sleep(1000);
            System.out.println("Maybe if you spent more time with it...");
        } else {
            isAlive = true;
        }

    }

    public void speak(){
        int wordAmnt = rand.nextInt(words.size());
        System.out.println(words.get(wordAmnt));
        reduceBoredom();
    }

    public void teach(String word) throws InterruptedException {
        words.add(word);
        Thread.sleep(1000);
        System.out.println(name + " learned the word " + word + "!");
        System.out.println();
        reduceBoredom();
    }

    public void printStats(){
        System.out.println("Hunger: " + hunger + " boredom: " + boredom);
    }

    public void feed(){
        System.out.println("You fed "+name);
        hunger = hunger - rand.nextInt(5);
        if(hunger < 0){
            hunger = 0;
        }
        System.out.println("Hunger: " + hunger);
        
    }

    public void play(){
        System.out.println("You played with " + name + "!");
    }


    public void reduceBoredom(){
        boredom = boredom - rand.nextInt(5);
        if(boredom < 0){
            boredom = 0;
        }
    }

    public boolean getAlive() {
        return isAlive;
    }

}
