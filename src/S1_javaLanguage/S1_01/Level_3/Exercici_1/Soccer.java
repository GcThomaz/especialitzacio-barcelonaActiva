package S1_javaLanguage.S1_01.Level_3.Exercici_1;
import java.util.Scanner;
public class Soccer extends News implements Price{

    String competition;
    String team;
    String player;

    Soccer (String title, String text, String competition, String team, String player) {
        super(title, text);
        this.competition = competition;
        this.team = team;
        this.player = player;
    }

    public void calcuteSoccerPoints() {
        int soccerPoints = 5;
        Scanner in = new Scanner(System.in);
        System.out.println("\n##### SOCCER POINTS MENU #####");
        System.out.println("Is the news about the Champions League? (S / N)");
        String isChampions = in.nextLine();
        System.out.println("Is the news about the League? (S / N)");
        String isLeague = in.nextLine();
        System.out.println("Is the news about Barça or Madrid? (S / N)");
        String isBarcaMadrid = in.nextLine();
        System.out.println("Is the news about Ferran or Benzema? (S / N)");
        String isFerranBenzema = in.nextLine();

        if(isChampions.equalsIgnoreCase("S")){
            soccerPoints += 100;
        }
        if(isLeague.equalsIgnoreCase("S")){
            soccerPoints += 2;
        }
        if(isBarcaMadrid.equalsIgnoreCase("S")){
            soccerPoints += 1;
        }
        if(isFerranBenzema.equalsIgnoreCase("S")){
            soccerPoints += 1;
        }
        System.out.println("News Score: " + soccerPoints + ".\n");
    }


    @Override
    public void newsPrice() {
            int soccerPrice = 300;
            Scanner in = new Scanner(System.in);
            System.out.println("Is the news about the Champions League? (S / N)");
            String isChampions = in.nextLine();
            System.out.println("Is the news about Barça or Madrid? (S / N)");
            String isBarcaMadrid = in.nextLine();
            System.out.println("Is the news about Ferran or Benzema? (S / N)");
            String isFerranBenzema = in.nextLine();

            if(isChampions.equalsIgnoreCase("S")){
                soccerPrice += 100;
            }
            if(isBarcaMadrid.equalsIgnoreCase("S")){
                soccerPrice += 100;
            }
            if(isFerranBenzema.equalsIgnoreCase("S")){
                soccerPrice += 50;
            }
            System.out.println("News Price: " + soccerPrice + " euros.\n");
        }
    }
