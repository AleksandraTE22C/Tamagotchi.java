import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Tamagotchi!");
        Thread.sleep(1000);
        Scanner tb = new Scanner(System.in);
        System.out.println("Name your new virtual pet:");
        Tamagotchi pet = new Tamagotchi(tb.nextLine());
        Thread.sleep(1000);
        while (pet.getAlive()){
            System.out.println("Your pet's name is " + pet.name);
            Thread.sleep(1000);

            pet.setAlive();
        }
    }

}