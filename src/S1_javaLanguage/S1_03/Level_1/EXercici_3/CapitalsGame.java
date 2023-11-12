package S1_javaLanguage.S1_03.Level_1.EXercici_3;
import java.io.*;
import java.util.*;

public class CapitalsGame {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            HashMap<String, String> countriesMap = new HashMap<>();
            try {
                BufferedReader reader = new BufferedReader(new FileReader("src/S1_javaLanguage/S1_03/Level_1/EXercici_3/countries.txt"));
                String line;
                while ((line = reader.readLine()) != null) {
                    if (!line.trim().isEmpty()) {
                        String[] parts = line.split(" ");
                        if (parts.length >= 2) {
                            countriesMap.put(parts[0].trim(), parts[1].trim());
                        } else {
                            System.err.println("Invalid format in line: " + line);
                        }
                    }
                }
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

            System.out.println("Enter your username: ");
            String userName = scanner.nextLine();

            int score = 0;
            for (int i = 0; i < 10; i++) {
                List<String> countriesList = new ArrayList<>(countriesMap.keySet());
                Random random = new Random();
                String randomCountry = countriesList.get(random.nextInt(countriesList.size()));
                String capital = countriesMap.get(randomCountry);

                System.out.println("What is the capital of " + randomCountry + "?");
                String userGuess = scanner.nextLine();

                if (userGuess.equalsIgnoreCase(capital)) {
                    System.out.println("Correct! You have earned a point.");
                    score++;
                } else {
                    System.out.println("Incorrect. The capital is " + capital + ".");
                }
            }

            try {
                BufferedWriter writer = new BufferedWriter(new FileWriter("src/S1_javaLanguage/S1_03/Level_1/EXercici_3/Classification.txt", true));
                writer.write(userName + ": " + score + " points");
                writer.newLine();
                writer.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

            System.out.println("Jogo concluído. Sua pontuação final é: " + score + " pontos.");
        }
    }
