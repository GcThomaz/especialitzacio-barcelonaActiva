package S1_javaLanguage.S1_01.Level_2.Exercici_1;

public class Smartphone extends Phone implements Camera, Clock{
    Smartphone(String brand, String model) {
        super(brand, model);
    }

    @Override
    public void photography() {
        System.out.println("A photo is being taken!");
    }

    @Override
    public void alarm() {
        System.out.println("The alarm is sounding!");
    }
}
