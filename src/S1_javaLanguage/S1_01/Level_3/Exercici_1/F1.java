package S1_javaLanguage.S1_01.Level_3.Exercici_1;

import java.util.Scanner;

public class F1 extends News implements Price{
    String team;

    public F1(String title, String text, String team) {
        super(title, text);
        this.team = team;
    }

    public void calcuteF1Points() {
        int f1Points = 4;
        Scanner in = new Scanner(System.in);
        System.out.println("\n##### F1 POINTS MENU #####");
        System.out.println("Is the news about Ferrari or Mercedes? (S / N)");
        String isFerrariMercedes = in.nextLine();

        if(isFerrariMercedes.equalsIgnoreCase("S")){
            f1Points += 2;
        }
        System.out.println("News Score: " + f1Points + ".\n");
    }

    @Override
    public void newsPrice() {
        int f1Points = 100;
        Scanner in = new Scanner(System.in);
        System.out.println("\n##### F1 PRICE MENU #####");
        System.out.println("Is the news about Ferrari or Mercedes? (S / N)");
        String isFerrariMercedes = in.nextLine();

        if(isFerrariMercedes.equalsIgnoreCase("S")){
            f1Points += 50;
        }
        System.out.println("News Price: " + f1Points + " euros.\n");
    }
}
