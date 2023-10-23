package S1_javaLanguage.S1_01.Level_3.Exercici_1;

import java.util.ArrayList;

public class Editor {

    private String name;
    private String id;
    private double salary;
    private final ArrayList<News> newsEditorList;

    Editor(String name, String id) {
        this.name = name;
        this.id = id;
        this.salary = 1500;
        this.newsEditorList = new ArrayList<>();
    }

    public String getName() {
        return name;
    }
    public String getId() { return id; }
    public ArrayList<News> getNewsEditorList() {
        return newsEditorList;
    }
}
