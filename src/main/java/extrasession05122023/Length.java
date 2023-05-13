package extrasession05122023;

import java.util.Scanner;

///Q: Take values of length and width of a rectangle from user and check if it is square or not.
public class Length {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Length");
        int x = s.nextInt();

        System.out.println("Enter Width");
        int y = s.nextInt();

        if(x==y){
            System.out.println("Square");
        }
        else {
            System.out.println("Rectangle");
        }
    }
}
