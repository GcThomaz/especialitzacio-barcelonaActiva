package S1_javaLanguage.S1_01.Level_3.Exercici_1;

import java.util.Scanner;

public class Motorcycling extends News implements Price{
    String team;

    public Motorcycling(String title, String text, String team) {
        super(title, text);
        this.team = team;
    }

    public void calcuteMotorcyclingPoints() {
        int motorcyclingPoints = 4;
        Scanner in = new Scanner(System.in);
        System.out.println("\n##### MOTORCYCLING POINTS MENU #####");
        System.out.println("Is the news about Honda or Yamaha? (S / N)");
        String isHondaYamaha = in.nextLine();

        if(isHondaYamaha.equalsIgnoreCase("S")){
            motorcyclingPoints += 3;
        }
        System.out.println("News Score: " + motorcyclingPoints + ".\n");
    }

    @Override
    public void newsPrice() {
        int motorcyclingPoints = 100;
        Scanner in = new Scanner(System.in);
        System.out.println("\n##### MOTORCYCLING PRICE MENU #####");
        System.out.println("Is the news about Honda or Yamaha? (S / N)");
        String isHondaYamaha = in.nextLine();

        if(isHondaYamaha.equalsIgnoreCase("S")){
            motorcyclingPoints += 50;
        }
        System.out.println("News Price: " + motorcyclingPoints + " euros.\n");
    }
}
