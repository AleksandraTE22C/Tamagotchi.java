import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Tamagotchi!");
        Scanner tb = new Scanner(System.in);
        System.out.println("Name your new virtual pet:");
        tamagotchi pet = new tamagotchi(tb.next());
        while (pet.getAlive()){

        }
    }
}