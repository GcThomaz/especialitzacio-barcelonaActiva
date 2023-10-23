package S1_javaLanguage.S1_01.Level_3.Exercici_1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Level 3 - Exercise 1
 *
 * @author Gustavo Thomaz
 */

public class Test {
    public static void main(String[] args) {
        Menu();
    }

    static void Menu() {
        ArrayList<Editor> editorsList = new ArrayList<>();

        int option = -1;

        while (option != 0) {
            System.out.println("##### MENU #####");
            System.out.println("1. Create an Editor");
            System.out.println("2. Delete an Editor");
            System.out.println("3. Add News to an Editor");
            System.out.println("4. Delete News");
            System.out.println("5. Show all news from an Editor");
            System.out.println("6. Calculate a news Score");
            System.out.println("7. Calculate the news Price");
            System.out.println("0. Leave");

            option = askNumber("Type the option: ");

            switch (option) {
                case 1:
                    String editorName = askText("Type the name: ");
                    String editorId = askText("Type the ID: ");
                    createEditor(editorName, editorId, editorsList);
                    break;
                case 2:
                    String deleteEditorId = askText("Type the ID: ");
                    int indexDelete = indexEditor(editorsList, deleteEditorId);
                    deleteEditor(indexDelete, editorsList);
                    break;
                case 3:
                    String editor = askText("Type the Editor id: ");
                    int optionNews = -1;
                    while(optionNews != 0) {
                        System.out.println("##### Type of News ######");
                        System.out.println("1. Soccer");
                        System.out.println("2. Basketball");
                        System.out.println("3. Tennis");
                        System.out.println("4. F1");
                        System.out.println("5. Motorcycling");
                        System.out.println("0. Main MENU");

                        optionNews = askNumber("Type the option: ");

                        switch (optionNews) {
                            case 1:
                                String soccerTitle = askText("Type the title: ");
                                String soccerText = askText("Type the text: ");
                                String soccerCompetition = askText("Type the competition: ");
                                String soccerTeam = askText("Type the team: ");
                                String soccerPlayer = askText("Type the player: ");
                                int soccerEditorId = indexEditor(editorsList, editor);
                                addSoccerNews(soccerTitle, soccerText, soccerCompetition, soccerTeam, soccerPlayer,
                                        soccerEditorId, editorsList);
                                break;
                            case 2:
                                String basketballTitle = askText("Type the title: ");
                                String basketballText = askText("Type the text: ");
                                String basketballCompetition = askText("Type the competition: ");
                                String basketballTeam = askText("Type the team: ");
                                int basketballEditorId = indexEditor(editorsList, editor);
                                addBasketballNews(basketballTitle, basketballText, basketballCompetition,
                                        basketballTeam,
                                        basketballEditorId, editorsList);
                                break;
                            case 3:
                                String tennisTitle = askText("Type the title: ");
                                String tennisText = askText("Type the text: ");
                                String tennisCompetition = askText("Type the competition: ");
                                String tennisPlayer = askText("Type the player: ");
                                int tennisEditorId = indexEditor(editorsList, editor);
                                addTennisNews(tennisTitle, tennisText, tennisCompetition, tennisPlayer, tennisEditorId,
                                        editorsList);
                                break;
                            case 4:
                                String f1Title = askText("Type the title: ");
                                String f1Text = askText("Type the text: ");
                                String f1Team = askText("Type the team: ");
                                int f1EditorId = indexEditor(editorsList, editor);
                                addF1News(f1Title, f1Text, f1Team, f1EditorId, editorsList);
                                break;
                            case 5:
                                String motorcyclingTitle = askText("Type the title: ");
                                String motorcyclingText = askText("Type the text: ");
                                String motorcyclingTeam = askText("Type the team: ");
                                int motorcyclingEditorId = indexEditor(editorsList, editor);
                                addMotorcyclingNews(motorcyclingTitle, motorcyclingText, motorcyclingTeam,
                                        motorcyclingEditorId,
                                        editorsList);
                                break;
                            case 0:
                                System.out.println("Main Menu");
                                break;
                            default:
                                System.out.println("Invalid option. Type a valid number!");
                                break;
                        }
                    }
                    break;
                case 4:
                    String idEditorDeleteNews = askText("Type the Editor id: ");
                    String newsDeleteTitle = askText("Type the News title: ");
                    deleteNews(editorsList, idEditorDeleteNews, newsDeleteTitle);
                    break;
                case 5:
                    String showId = askText("Type the editor id: ");
                    showEditorNews(editorsList, showId);
                    break;
                case 6:
                    String idPoints = askText("Type the Editor id: ");
                    int indexEditor = indexEditor(editorsList, idPoints);

                    showEditorNews(editorsList, idPoints);

                    int optionPoints = askNumber("Type the index of the news: ");

                    News news = (editorsList.get(indexEditor).getNewsEditorList().get(optionPoints));
                    if(news instanceof Soccer) {
                        ((Soccer) news).calcuteSoccerPoints();
                    } else if (news instanceof Basketball) {
                        ((Basketball) news).calcuteBasketballPoints();
                    } else if (news instanceof Tennis) {
                        ((Tennis) news).calcuteTennisPoints();
                    } else if (news instanceof F1) {
                        ((F1) news).calcuteF1Points();
                    } else if (news instanceof Motorcycling) {
                        ((Motorcycling) news).calcuteMotorcyclingPoints();
                    } else {
                        System.out.println("Doesn't found!");
                    }
                    break;
                case 7:
                    String idPrice = askText("Type the Editor id: ");
                    int indexPrice = indexEditor(editorsList, idPrice);

                    showEditorNews(editorsList, idPrice);

                    int optionPrice = askNumber("Type the index of the news: ");

                    News newsPrice = (editorsList.get(indexPrice).getNewsEditorList().get(optionPrice));
                    if(newsPrice instanceof Soccer) {
                        ((Soccer) newsPrice).newsPrice();
                    } else if (newsPrice instanceof Basketball) {
                        ((Basketball) newsPrice).newsPrice();
                    } else if (newsPrice instanceof Tennis) {
                        ((Tennis) newsPrice).newsPrice();
                    } else if (newsPrice instanceof F1) {
                        ((F1) newsPrice).newsPrice();
                    } else if (newsPrice instanceof Motorcycling) {
                        ((Motorcycling) newsPrice).newsPrice();
                    } else {
                        System.out.println("Doesn't found!");
                    }
                    break;
                case 0:
                    System.out.println("Bye!");
                    break;
                default:
                    System.out.println("Invalid option! Try again.");
                    break;
            }

        }

    }

    static void createEditor(String name, String id, ArrayList<Editor> editorsList) {
        Editor editor = new Editor(name, id);
        editorsList.add(editor);
        System.out.println("Editor " + name + " created successfully!");
    }

    static void deleteEditor(int index, ArrayList<Editor> editorsList) {
        String nameEditorRemoved = editorsList.get(index).getName();
        editorsList.remove(index);
        System.out.println("Editor " + nameEditorRemoved + " has been deleted!");
    }

    static void addSoccerNews(String title, String text, String competition, String team,
                               String player, int index, ArrayList<Editor> editorsList) {
        String editorName = editorsList.get(index).getName();
        Soccer soccerNews = new Soccer(title, text, competition, team, player);
        editorsList.get(index).getNewsEditorList().add(soccerNews);
        System.out.println("Soccer news was successfully added to editor " + editorName + ".");
    }

    static void addBasketballNews(String title, String text, String competition, String team, int index, ArrayList<Editor> editorsList) {
        String editorName = editorsList.get(index).getName();
        Basketball basketballNews = new Basketball(title, text, competition, team);
        editorsList.get(index).getNewsEditorList().add(basketballNews);
        System.out.println("Basketball news was successfully added to editor " + editorName + ".");
    }

    static void addTennisNews(String title, String text, String competition, String team, int index,
                         ArrayList<Editor> editorsList) {
        String editorName = editorsList.get(index).getName();
        Tennis tennisNews = new Tennis(title, text, competition, team);
        editorsList.get(index).getNewsEditorList().add(tennisNews);
        System.out.println("Tennis news was successfully added to editor " + editorName + ".");
    }

    static void addF1News(String title, String text, String team, int index,
                         ArrayList<Editor> editorsList) {
        String editorName = editorsList.get(index).getName();
        F1 f1News = new F1(title, text, team);
        editorsList.get(index).getNewsEditorList().add(f1News);
        System.out.println("F1 news was successfully added to editor " + editorName + ".");
    }

    static void addMotorcyclingNews(String title, String text, String team, int index,
                         ArrayList<Editor> editorsList) {
        String editorName = editorsList.get(index).getName();
        Motorcycling motorcyclingNews = new Motorcycling(title, text, team);
        editorsList.get(index).getNewsEditorList().add(motorcyclingNews);
        System.out.println("Motorcycling news was successfully added to editor " + editorName + ".");
    }

    static void deleteNews(ArrayList<Editor> editorsList, String id, String title) {
        int indexEditorDelete = indexEditor(editorsList, id);
        int indexNewsDelete = indexNews(editorsList, id, title);
        String editorName = editorsList.get(indexEditorDelete).getName();

        editorsList.get(indexEditorDelete).getNewsEditorList().remove(indexNewsDelete);

        System.out.println("The news '" + title + "' was deleted from the user " + editorName + ".");
    }

    static int indexNews(ArrayList<Editor> editorsList, String id, String title) {
        int indexEditor = indexEditor(editorsList, id);

        int index = -1;
        int counter = 0;
        int cells = editorsList.get(indexEditor).getNewsEditorList().size();
        boolean found = false;

        while(counter < cells && !found) {
            if (editorsList.get(counter).getNewsEditorList().get(indexEditor).getTitle().equalsIgnoreCase(title)) {
                index = counter;
                found = true;
            }
            counter++;
        }
        return index;
    }

    static int indexEditor(ArrayList<Editor> editorsList, String id) {
        int index = -1;
        int counter = 0;
        int cells = editorsList.size();
        boolean found = false;

        while(counter < cells && !found) {
            if (editorsList.get(counter).getId().equalsIgnoreCase(id)) {
                index = counter;
                found = true;
            }
            counter++;
        }
        return index;
    }

    static void showEditorNews(ArrayList<Editor> editorsList, String id) {
        int indexEditor = indexEditor(editorsList, id);
        int cells = editorsList.get(indexEditor).getNewsEditorList().size();

        for(int i = 0; i < cells; i++) {
            System.out.println(i + ". " + editorsList.get(indexEditor).getNewsEditorList().get(i).getTitle());
        }
    }

    static String askText(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return in.nextLine();
    }

    static int askNumber(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return in.nextInt();
    }
}
