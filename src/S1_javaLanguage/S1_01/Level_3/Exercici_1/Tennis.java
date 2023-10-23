package S1_javaLanguage.S1_01.Level_3.Exercici_1;

import java.util.Scanner;

public class Tennis extends News implements Price{

    String competition;
    String players;


    public Tennis(String title, String text, String competition, String players) {
        super(title, text);
        this.competition = competition;
        this.players = players;
    }

    public void calcuteTennisPoints() {
        int tennisPoints = 4;
        Scanner in = new Scanner(System.in);
        System.out.println("\n##### TENNIS POINTS MENU #####");
        System.out.println("Is the news about Federer, Nadal or Djokovic? (S / N)");
        String isFedererNadalDjokovic = in.nextLine();

        if(isFedererNadalDjokovic.equalsIgnoreCase("S")){
            tennisPoints += 3;
        }
        System.out.println("News Score: " + tennisPoints + ".\n");
    }

    @Override
    public void newsPrice() {
        int tennisPoints = 150;
        Scanner in = new Scanner(System.in);
        System.out.println("\n##### TENNIS PRICE MENU #####");
        System.out.println("Is the news about Federer, Nadal or Djokovic? (S / N)");
        String isFedererNadalDjokovic = in.nextLine();

        if(isFedererNadalDjokovic.equalsIgnoreCase("S")){
            tennisPoints += 100;
        }
        System.out.println("News Price: " + tennisPoints + " euros.\n");
    }
}
