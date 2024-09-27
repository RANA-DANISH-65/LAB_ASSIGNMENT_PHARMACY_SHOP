public class Address {
    private String street;
    private String city;
    private String postalCode;

    public Address(String street, String city, String postalCode) {
        setStreet(street);
        setCity(city);
        setPostalCode(postalCode);
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getStreet() {
        return street;
    }

    public String getCity() {
        return city;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void displayAddress() {
        System.out.println("------The Address is given below:");
        System.out.println("----City: " + city);
        System.out.println("----Street: " + street);
        System.out.println("----Postal Code: " + postalCode);
    }

}
