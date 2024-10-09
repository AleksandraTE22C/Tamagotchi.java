import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Tamagotchi!");
        Thread.sleep(1000);
        Scanner key = new Scanner(System.in);
        System.out.println("Name your new virtual pet:");
        Tamagotchi pet = new Tamagotchi(key.nextLine());
        Thread.sleep(1000);
        System.out.println("Your pet's name is " + pet.name+". What a great name!");
        Thread.sleep(1000);

        while (pet.getAlive()){
            pet.tick();
            pet.printStats();
            Thread.sleep(1000);
            System.out.println();
            //System.out.println("What will you do?");
            //System.out.println("Play    Feed    Teach   Speak    Do nothing");
            //System.out.println("What word should " + pet.name + " learn?");
            //pet.teach(key.nextLine());
            //pet.speak();



        }
    }

}