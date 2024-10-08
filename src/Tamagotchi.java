import java.util.ArrayList;
import java.util.Random;

public class Tamagotchi {
    private int hunger = 0;
    private int boredom = 0;
    private boolean isAlive;
    String name;
    private Random generator = new Random();
    private ArrayList<String> words = new ArrayList<String>();


    public Tamagotchi(String incomingName) {
        name = incomingName;
        isAlive = true;
        generator.nextInt(10);
        words.add("Hello!");
    }

    public void feed(){
        hunger = hunger - generator.nextInt(10);
        
    }

    public void play(){
        boredom = boredom - generator.nextInt(10);
    }

    public boolean getAlive() {
        return isAlive;
    }

    public void setAlive() throws InterruptedException {
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

}
