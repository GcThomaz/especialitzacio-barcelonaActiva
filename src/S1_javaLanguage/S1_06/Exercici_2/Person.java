package S1_javaLanguage.S1_06.Exercici_2;

public class Person {
    private String nom;
    private String cognom;
    private int edat;

    public Person(String nom, String cognom, int edat) {
        this.nom = nom;
        this.cognom = cognom;
        this.edat = edat;
    }

    public String getNom() {
        return nom;
    }

    public String getCognom() {
        return cognom;
    }

    public int getEdat() {
        return edat;
    }
}
