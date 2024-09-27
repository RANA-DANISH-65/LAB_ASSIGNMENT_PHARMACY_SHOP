import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Person owner = new Person("Ahmad Khan", "234763467346");
        Address address = new Address("Nathia Gali", "Lahore", "23424");

        PharmacyShop phar1 = new PharmacyShop(owner, address);

        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            displayMenu();
            System.out.print("Enter Your Choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1 -> phar1.displayMedicines();
                case 2 -> {
                    System.out.print("Enter Id of medicine: ");
                    String userId = sc.nextLine();
                    phar1.getMedicineById(userId);
                }
                case 3 -> {
                    System.out.print("Enter Medicine Name: ");
                    String medName = sc.nextLine();
                    phar1.getMedicineByName(medName);
                }
                case 4 -> {
                    System.out.println("Enter Name of Medicine you want to Update: ");
                    String updMed = sc.nextLine();
                    phar1.updateMedicine(updMed);
                }
                case 5 -> {
                    System.out.println("Enter Name of Medicine You want to Sell:");
                    String name = sc.nextLine();
                    System.out.println("Enter Quantity you want to sell:");
                    int quan = sc.nextInt();
                    sc.nextLine(); // Clear the buffer
                    phar1.sellMedicine(name, quan);
                }
                case 6 -> {
                    System.out.println("Enter name of Medicine You want to remove:");
                    String name = sc.nextLine();
                    phar1.removeMedicine(name);
                }
                case 7->{
                    phar1.addNewMedicine();
                }
                case 8 -> System.out.println("Exiting the program.");
                default -> System.out.println("Invalid choice, please try again.");
            }
        } while (choice != 8);
    }

    public static void displayMenu() {
        System.out.println("----------->>> 1. Display Available Medicines");
        System.out.println("----------->>> 2. Get Medicine Information By Using ID");
        System.out.println("----------->>> 3. Get Medicine Information By Using Name");
        System.out.println("----------->>> 4. Update Medicine Information");
        System.out.println("----------->>> 5. Sell Medicine");
        System.out.println("----------->>> 6. Remove Medicine From Pharmacy");
        System.out.println("----------->>> 7. ADD New Medicine");
        System.out.println("----------->>> 8. Exit");
    }
}
