package S1_javaLanguage.S1_02.Level_1.Exercici_1;

public class Test {
    public static void main(String[] args) {

        Sale sale = new Sale();

        // Without products

        try {
            sale.calculateTotal();
        } catch (EmptySaleException e) {
            System.out.println(e.getMessage());
        }

        // Add some products

        Product p = new Product("phone", 100);
        Product p1 = new Product("pc", 500);

        sale.addProduct(p);
        sale.addProduct(p1);

        try {
            sale.calculateTotal();
            System.out.println("Total price of the sale is: " + sale.getTotalSalePrice());
        } catch (EmptySaleException e) {
            System.out.println(e.getMessage());
        }
    }
}
