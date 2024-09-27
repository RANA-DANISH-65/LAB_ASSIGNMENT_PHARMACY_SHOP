public class Medicine {
    private String medicineId;
    private String medicineName;
    private double medicinePrice;
    private int medicineQuantity;
    private String medicineManufacturer;
    private String medicineBatchNo;
    private Date medicineExpiryDate;

    public Medicine(String medicineId, String medicineName, double medicinePrice, int medicineQuantity, String medicineManufacturer, String medicineBatchNo, Date medicineExpiryDate) {
        this.medicineId = medicineId;
        this.medicineName = medicineName;
        this.medicinePrice = medicinePrice;
        this.medicineQuantity = medicineQuantity;
        this.medicineManufacturer = medicineManufacturer;
        this.medicineBatchNo = medicineBatchNo;
        this.medicineExpiryDate = medicineExpiryDate;
    }

    public void setMedicineId(String medicineId) {
        this.medicineId = medicineId;
    }

    public void setMedicineName(String medicineName) {
        this.medicineName = medicineName;
    }

    public void setMedicinePrice(double medicinePrice) {
        this.medicinePrice = medicinePrice;
    }

    public void setMedicineQuantity(int medicineQuantity) {
        this.medicineQuantity = medicineQuantity;
    }

    public void setMedicineManufacturer(String medicineManufacturer) {
        this.medicineManufacturer = medicineManufacturer;
    }

    public void setMedicineBatchNo(String medicineBatchNo) {
        this.medicineBatchNo = medicineBatchNo;
    }

    public void setMedicineExpiryDate(Date medicineExpiryDate) {
        this.medicineExpiryDate = medicineExpiryDate;
    }

    public String getMedicineId() {
        return medicineId;
    }

    public String getMedicineName() {
        return medicineName;
    }

    public double getMedicinePrice() {
        return medicinePrice;
    }

    public int getMedicineQuantity() {
        return medicineQuantity;
    }

    public String getMedicineManufacturer() {
        return medicineManufacturer;
    }

    public String getMedicineBatchNo() {
        return medicineBatchNo;
    }

    public Date getMedicineExpiryDate() {
        return medicineExpiryDate;
    }

    public void displayMedicineInfo(){
        System.out.println("---The Details of the Medicine :");
        System.out.println("-------|The Id of the Medicine: "+medicineId);
        System.out.println("-------|The Name of the Medicine: "+medicineName);
        System.out.println("-------|The Price of the Medicine: "+medicinePrice);
        System.out.println("-------|The Quantity of the Medicine: "+medicineQuantity);
        System.out.println("-------|The Manufacturer of the Medicine: "+medicineManufacturer);
        System.out.println("-------|The Batch Number of the Medicine: "+medicineBatchNo);
        medicineExpiryDate.displayDate();
        System.out.println("");
        System.out.println("");
    }
}
