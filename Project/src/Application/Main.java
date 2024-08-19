package Application;

import java.util.Scanner;
import Framework.ShopFactory;
import Framework.PrimeAcc;
import Framework.NormalAcc;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ShopFactory shopFactory = new GSShopFactory();

        while (true) {
            System.out.println("\nSelect Account Type:");
            System.out.println("1. Prime Account");
            System.out.println("2. Normal Account");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("\nEnter details for Prime Account:");
                    System.out.print("Account Number: ");
                    int primeAccNo = scanner.nextInt();
                    System.out.print("Account Name: ");
                    scanner.nextLine(); 
                    String primeAccNm = scanner.nextLine();
                    System.out.print("Charges: ");
                    float primeCharges = scanner.nextFloat();
                    System.out.print("Is Prime? (true/false): ");
                    boolean isPrime = scanner.nextBoolean();

                
                    PrimeAcc primeAcc = shopFactory.getNewPrimeAcc(primeAccNo, primeAccNm, primeCharges, isPrime);
                    primeAcc.bookProduct(primeAcc.getCharges());

                    System.out.println(primeAcc);
                    break;

                case 2:
                  
                    System.out.println("\nEnter details for Normal Account:");
                    System.out.print("Account Number: ");
                    int normalAccNo = scanner.nextInt();
                    System.out.print("Account Name: ");
                    scanner.nextLine(); 
                    String normalAccNm = scanner.nextLine();
                    System.out.print("Charges: ");
                    float normalCharges = scanner.nextFloat();

                   
                    NormalAcc normalAcc = shopFactory.getNewNormalAcc(normalAccNo, normalAccNm, normalCharges);
                    normalAcc.bookProduct(normalAcc.getCharges());

                
                    System.out.println(normalAcc);
                    break;

                case 3:
                    System.out.println("Exiting the program...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }
    }
}
