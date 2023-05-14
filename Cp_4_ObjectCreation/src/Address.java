
// Address - A class representing an address with street, city, and zip code properties. Print street, city, and zip codes.

// Declare Address Class
public class Address {
    // Declare Class properties:
    private String streetAddress;
    private String city;
    private String state;
    private String country;
    private String postalCode;

    // Declare Main Method
    public static void main(String[] args) {
        // Print Address
        System.out.println("Hello From Address Class!");


        // Create an object instance of the class
        Address obj = new Address();
       // Set the object's properties
        obj.city = "NY";

        System.out.println("City Name: " + obj.city);
       
    }
}