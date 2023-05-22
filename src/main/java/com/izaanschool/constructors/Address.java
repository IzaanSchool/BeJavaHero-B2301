
// Address - A class representing an address with street, city, and zip code properties. Print street, city, and zip codes.

// Declare Address Class
public class Address {
    // Declare Class properties:
    private String streetAddress;
    private String city;
    private String state;
    private String country;
    private String postalCode;

    // Constructor
    public Address(String streetAddress, String city, String state, String country, String postalCode) {
        this.streetAddress = streetAddress;
        this.city = city;
        this.state = state;
        this.country = country;
        this.postalCode = postalCode;
    }


    

    // Declare Main Method
    public static void main(String[] args) {
        // Print Address
        System.out.println("Hello From Address Class!");

        // Create an object instance of the class with Constructor

        Address obj = new Address("6600 Chase Oaks Boulevard,Suite 150", "Plano", "Texas", "United States of America", "75023");

        // Access the object's properties

        System.out.println("Address Details: ");

        System.out.println("Country:"+ obj.country+", State: "+obj.state +", City: "+obj.city +", Street Address: "+obj.streetAddress+", PostalCode: "+ obj.postalCode);

       }
}