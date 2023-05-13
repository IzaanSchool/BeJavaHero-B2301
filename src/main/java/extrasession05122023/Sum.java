package extrasession05122023;

import java.util.Scanner;
///Q: Take two integer inputs from user. First calculate the sum of two then product of two. Finally, print the sum and product of both obtained results
public class Sum {
    public static void main(String[] args) {
        int x,y,sum,multiply;

        Scanner sc= new Scanner(System.in);

        System.out.println("please enter 1st number");
        x= sc.nextInt();

        System.out.println("please enter 2nd number");
        y= sc.nextInt();

        sc.close();

        sum = x + y;

        multiply = x * y;

        System.out.println("sum : "+ sum);
        System.out.println("multiply : "+ multiply);
    }
}