import java.util.Random;

public class tamagotchi {
    private  int hunger = 100;
    private int boredom = 100;
    private boolean isAlive = true;

    private Random generator = new Random();
    String name;
    public tamagotchi(String incomingName){
        name = incomingName;
        generator.nextInt(10);
    }

    public void getAlive() {
        if(hunger <= 0){
            isAlive = false;
            System.out.println("You neglected to take care of your pet.");
            System.out.println(name + "has died.");
            System.out.println("It has moved on to a place that knows no boredom, where it's belly will always be full and it's coat always clean and shiny.");
            System.out.println("R.I.P.");
        } else if(boredom <=0){
            isAlive = false;
            System.out.println("You neglected to take care of your pet.");
            System.out.println(name + "ran away looking for a better life.");

        }
    }


}
