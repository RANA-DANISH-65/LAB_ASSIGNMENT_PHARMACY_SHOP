public class Person {
    private String name;
    private String contactNo;

    public Person(String name, String contactNo) {
         setName(name);
         setContactNo(contactNo);
    }

    public void setContactNo(String contactNo) {
        this.contactNo = contactNo;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getContactNo() {
        return contactNo;
    }

    public void displayPersonInfo() {
        System.out.println("---The " + name + " Information is given below:");
        System.out.println("Name: " + name);
        System.out.println("Contact No: " + contactNo);
    }
}
