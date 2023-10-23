package S1_javaLanguage.S1_01.Level_3.Exercici_1;

import java.util.ArrayList;

public class News{

    private String title;
    private String text;
    private int score;
    private double price;

    public News(String title, String text) {
        this.title = title;
        this.text = text;
        this.price = 0;
    }

    public String getTitle() {
        return title;
    }
}
