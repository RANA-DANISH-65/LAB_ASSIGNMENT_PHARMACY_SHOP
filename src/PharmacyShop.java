import java.util.Scanner;
public class PharmacyShop {
    private Person owner;
    private Address address;
    private Medicine[] medicines = new Medicine[100];
    private int medicineCount = 0;

    Scanner sc=new Scanner(System.in);


    {

        medicines[medicineCount++] = new Medicine("M001", "Paracetamol", 100, 50, "PharmaCorp", "B123", new Date(15, 8, 2025));
        medicines[medicineCount++] = new Medicine("M002", "IbuProfin", 200, 30, "HealthMed", "B124", new Date(10, 12, 2024));
        medicines[medicineCount++] = new Medicine("M003", "Panadol", 150, 100, "BioPharma", "B123", new Date(15, 12, 2025));
    }

    public PharmacyShop(Person owner, Address address) {
        this.owner = owner;
        this.address = address;


    }public void addNewMedicine(){
        System.out.print("Enter New Medicine Name:");
        String name = sc.nextLine();
        System.out.print("Enter Id For this Medicine:");
        String id = sc.nextLine();
        System.out.print("Set Price:");
        double price = sc.nextDouble();
        System.out.print("Set Quantity:");
        int quantity = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Manufacturer Name:");
        String manu = sc.nextLine();
        System.out.print("Enter Batch Number:");
        String batch = sc.nextLine();
        System.out.print("Set Day of expiry:");
        int day = sc.nextInt();
        System.out.print("Set Month of expiry:");
        int month = sc.nextInt();
        System.out.print("Set Year of expiry:");
        int year = sc.nextInt();
        Date d = new Date(day, month, year);
        medicines[medicineCount++] = new Medicine(id, name, price, quantity, manu, batch, d);
        System.out.println("");
        System.out.println("Medicine added successfully");
        displayMedicines();
    }

    public void sellMedicine(String name, int quantity){
        boolean isFound=false;
        for (int i = 0; i < medicineCount; i++) {
            if(medicines[i].getMedicineName().equals(name)){
                if (medicines[i].getMedicineQuantity()>quantity){
                   double totalPrice= medicines[i].getMedicinePrice()*quantity;
                   medicines[i].setMedicineQuantity(medicines[i].getMedicineQuantity()-quantity);
                    System.out.println("The total Bill is "+totalPrice);
                    isFound=true;
                }else{
                    System.out.println("This medicine is currently not available");
                    isFound=true;
                }
            }
        }
        if(!isFound){
            System.out.println("No medicine of this name is found");
        }
    }

    public void removeMedicine(String name){
        boolean isFound=false;
        for (int i = 0; i < medicineCount; i++) {
            if(medicines[i].getMedicineName().equals(name)){
                isFound=true;
                for (int j=i+1;j<medicineCount;j++){
                    medicines[i]=medicines[j];
                }
            }

        }
       if(isFound){
           medicineCount--;
           System.out.println("Medicine Removed Successfully");
       }else{
           System.out.println("No medicine of this name is found");
       }
        displayMedicines();
    }


    public void getMedicineById(String Id){
        boolean isFound=false;
        for (int i = 0; i < medicineCount; i++) {
            if(medicines[i].getMedicineId().equals(Id)){
                System.out.println("======>Medicine found successfully.");
                medicines[i].displayMedicineInfo();
                isFound=true;
                break;
            }
        }
        if(!isFound){
            System.out.println("Medicine Not Found");
        }
    } public void getMedicineByName(String name){
        boolean isFound=false;
        for (int i = 0; i < medicineCount; i++) {
            if(medicines[i].getMedicineName().equals(name)){
                System.out.println("======>Medicine found successfully.");
                medicines[i].displayMedicineInfo();
                isFound=true;
                break;
            }
        }
        if(!isFound){
            System.out.println("Medicine Not Found");
        }
    }
    public void updateMedicine(String name){
        boolean isFound=false;
        for (int i = 0; i < medicineCount; i++) {
            if(medicines[i].getMedicineName().equals(name)){

                System.out.print("Enter new Name:");
                String newName=sc.nextLine();


                medicines[i].setMedicineName(newName);

                medicines[i].setMedicineExpiryDate(new Date(22,10,2025));
                System.out.print("Enter New Id for this Medicine");

                String newId=sc.nextLine();
                medicines[i].setMedicineId(newId);
                System.out.print("Enter New Price :");
                double newPrice=sc.nextInt();
                medicines[i].setMedicinePrice(newPrice);
                System.out.print("Enter New Qantity:");
                int newQuantity=sc.nextInt();
                medicines[i].setMedicineQuantity(newQuantity);
                medicines[i].displayMedicineInfo();
                System.out.println("Medicine Updated Successfully");
                isFound=true;
                break;
            }
        }
        if(!isFound){
            System.out.println("No medicine of this name is present in pharmacy");
        }
    }

    public void displayMedicines() {
        System.out.println("=====(Total Number of Medicines in Pharmacy :"+medicineCount+")=========");
        for (int i = 0; i <medicineCount; i++) {
            medicines[i].displayMedicineInfo();

        }
    }
}
