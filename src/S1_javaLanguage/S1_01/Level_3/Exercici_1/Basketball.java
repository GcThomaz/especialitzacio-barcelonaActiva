package S1_javaLanguage.S1_01.Level_3.Exercici_1;

import java.util.Scanner;

public class Basketball extends News implements Price{

    String competition;
    String team;

    Basketball(String title, String text, String competition, String team) {
        super(title, text);
        this.competition = competition;
        this.team = team;
    }

    public void calcuteBasketballPoints() {
        int basketballPoints = 4;
        Scanner in = new Scanner(System.in);
        System.out.println("\n##### BASKETBALL POINTS MENU #####");
        System.out.println("Is the news about the Euro league? (S / N)");
        String isEuroLeague = in.nextLine();
        System.out.println("Is the news about the ACB? (S / N)");
        String isAcb = in.nextLine();
        System.out.println("Is the news about Barça or Madrid? (S / N)");
        String isBarcaMadrid = in.nextLine();

        if(isEuroLeague.equalsIgnoreCase("S")){
            basketballPoints += 3;
        }
        if(isAcb.equalsIgnoreCase("S")){
            basketballPoints += 2;
        }
        if(isBarcaMadrid.equalsIgnoreCase("S")){
            basketballPoints += 1;
        }
        System.out.println("News Score: " + basketballPoints + ".\n");
    }

    @Override
    public void newsPrice() {
        int basketballPoints = 250;
        Scanner in = new Scanner(System.in);
        System.out.println("\n##### BASKETBALL PRICE MENU #####");
        System.out.println("Is the news about the Euro league? (S / N)");
        String isEuroLeague = in.nextLine();
        System.out.println("Is the news about Barça or Madrid? (S / N)");
        String isBarcaMadrid = in.nextLine();

        if(isEuroLeague.equalsIgnoreCase("S")){
            basketballPoints += 75;
        }
        if(isBarcaMadrid.equalsIgnoreCase("S")){
            basketballPoints += 75;
        }
        System.out.println("News Price: " + basketballPoints + " euros.\n");
    }
}
