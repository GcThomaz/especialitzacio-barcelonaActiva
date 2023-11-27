package Exercises_Classroom.SurpriseTest;

import java.util.ArrayList;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        ArrayList<Supplier> supplierList = new ArrayList<>();
        Menu(supplierList);
    }
    static void Menu(ArrayList<Supplier> supplierList) {
            int option = -1;

            while (option != 0) {
                System.out.println();
                System.out.println("# # # # # MENU # # # # #");
                System.out.println("1. Create a Supplier");
                System.out.println("2. Add a Product");
                System.out.println("3. View Supplier's Products ");
                System.out.println("4. Sell a Product");
                System.out.println("0. Leave");
                System.out.println("# # # # # # # # # # # # # ");
                System.out.println();

                option = asknumber("Type the option:");


                switch (option) {
                    case 1: // Create Supplier

                        int supplierOption = -1;
                        while(supplierOption != 0) {
                            System.out.println();
                            System.out.println("# # # # # SUPPLIER'S MENU # # # # #");
                            System.out.println("1. Farmer");
                            System.out.println("2. Thief");
                            System.out.println("3. Merchant");
                            System.out.println("0. Leave");
                            System.out.println("# # # # # # # # # # # # # # # # # #");
                            System.out.println();

                            supplierOption = asknumber("Type the option: ");

                            switch (supplierOption) {
                                case 1:
                                    String farmerName = askString("Farmer's name: ");
                                    int farmerAge = asknumber("Farmer's age: ");
                                    String farmerCity = askString("Farmer's city: ");
                                    createFarmer(supplierList, farmerName, farmerAge, farmerCity);
                                    break;
                                case 2:
                                    String thiefName = askString("Thief's name: ");
                                    int thiefAge = asknumber("Thief's age: ");
                                    String thiefCity = askString("Thief's city: ");
                                    createThief(supplierList, thiefName, thiefAge, thiefCity);
                                    break;
                                case 3:
                                    String merchantName = askString("Merchant's name: ");
                                    int merchantAge = asknumber("Merchant's age: ");
                                    String merchantCity = askString("Merchant's city: ");
                                    createMerchant(supplierList, merchantName, merchantAge, merchantCity);
                                    break;
                            }
                        }
                        break;
                    case 2: // Add a Product
                        String clientName = askString("Supplier's name: ");
                        String productName = askString("Product's name: ");
                        String productType = askString("Product's type: ");
                        double productPrice = asknumber("Product's price: ");
                        addProduct(supplierList, clientName, productName, productType, productPrice);
                        break;
                    case 3: // View the Products
                        String showName = askString("Supplier's name: ");
                        showSupplierProducts(supplierList, showName);
                        break;
                    case 4: // Sell a Product
                        String sellName = askString("Supplier's name: ");
                        String sellProductName = askString("Product's name: ");

                        break;
                    case 0:
                        System.out.println("Bye!");
                        break;

                    default:
                        System.out.println("Invalid option! Enter a valid number.");
                        break;
                }
            }
        }

        //Method to Create a Farmer
    static void createFarmer(ArrayList<Supplier> list, String name, int age, String city) {
        Farmer client = new Farmer(name, age, city);
        list.add(client);
        System.out.println("\nFarmer " + name + " created successfully!\n");
    }

    //Method to Create a Thief
    static void createThief(ArrayList<Supplier> list, String name, int age, String city) {
        Thief client = new Thief(name, age, city);
        list.add(client);
        System.out.println("\nThief " + name + " created successfully!\n");
    }

    //Method to Create a Merchant
    static void createMerchant(ArrayList<Supplier> list, String name, int age, String city) {
        Merchant client = new Merchant(name, age, city);
        list.add(client);
        System.out.println("\nMerchant " + name + " created successfully!\n");
    }

    //Method to Add a Product
    static void addProduct(ArrayList<Supplier> list, String clientName,  String name, String type, double price) {
        int index = indexClient(list, clientName);

        Product product = new Product(name, type, price);
        if(list.get(index) instanceof Farmer) {
            ((Farmer) list.get(index)).getFarmerProductList().add(product);
        } else if(list.get(index) instanceof Thief) {
            ((Thief) list.get(index)).getThiefProductList().add(product);
        } else {
            ((Merchant) list.get(index)).getMerchantProductList().add(product);
        }
        System.out.println("\nThe " + name + " product has been successfully added to " + list.get(index).getName() + "!\n");
    }

    //Method to SHow the Products

    static void showSupplierProducts(ArrayList<Supplier> list, String name) {
        int index = indexClient(list, name);

        if (list.get(index) instanceof Farmer) {
            int cells = ((Farmer) list.get(index)).getFarmerProductList().size();
            for(int i = 0; i < cells; i++) {
                System.out.println(i + 1 + ". " + ((Farmer) list.get(index)).getFarmerProductList().get(index).getName());
            }
        } else if(list.get(index) instanceof Thief) {
            int cells = ((Thief) list.get(index)).getThiefProductList().size();
            for(int i = 0; i < cells; i++) {
                System.out.println(i + 1 + ". " + ((Thief) list.get(index)).getThiefProductList().get(index).getName());
            }
        } else {
            int cells = ((Merchant) list.get(index)).getMerchantProductList().size();
            for(int i = 0; i < cells; i++) {
                System.out.println(i + 1 + ". " + ((Merchant) list.get(index)).getMerchantProductList().get(index).getName());
            }
        }
    }

    static void sellProduct(ArrayList<Supplier> list, String name, String productName) {
        int indexProduct = indexProduct(list, name, productName);

    }

    static int indexClient(ArrayList<Supplier> list, String name) {
        int index = -1;
        int counter = 0;
        int cells = list.size();
        boolean found = false;

        while (counter < cells && !found) {
            if (list.get(counter).getName().equalsIgnoreCase(name)) {
                index = counter;
                found = true;
            }
            counter++;
        }
        return index;
    }

    static int indexProduct(ArrayList<Supplier> list, String name, String productName) {
        int indexSupplier = indexClient(list, name);

        int index = -1;
        int counter = 0;
        boolean found = false;

        if (list.get(indexSupplier) instanceof Farmer) {
            int cells = ((Farmer) list.get(indexSupplier)).getFarmerProductList().size();
            while(counter < cells && !found) {
                if (list.get(counter).getName().equalsIgnoreCase(productName)) {
                    index = counter;
                    found = true;
                }
                counter++;
            }
            return index;
        } else if(list.get(indexSupplier) instanceof Thief) {
            int cells = ((Thief) list.get(indexSupplier)).getThiefProductList().size();
            while(counter < cells && !found) {
                if (list.get(counter).getName().equalsIgnoreCase(productName)) {
                    index = counter;
                    found = true;
                }
                counter++;
            }
            return index;
        } else {
            int cells = ((Merchant) list.get(indexSupplier)).getMerchantProductList().size();
            while(counter < cells && !found) {
                if (list.get(counter).getName().equalsIgnoreCase(productName)) {
                    index = counter;
                    found = true;
                }
                counter++;
            }
            return index;
        }
    }

    static String askString(String message) {
        Scanner in = new Scanner(System.in);
        System.out.println(message);
        // in.close();
        return in.nextLine();
    }

    static int asknumber(String message) {
        Scanner in = new Scanner(System.in);
        System.out.println(message);
        // in.close();
        return in.nextInt();
    }
    }
