package extrasession05122023;

import java.util.Scanner;
///Q: A school has following rules for grading system:
//a. Below 25 - F
//b. 25 to 45 - E
//c. 45 to 50 - D
//d. 50 to 60 - C
//e. 60 to 80 - B
//f. Above 80 - A
//Ask user to enter marks and print the corresponding grade.
public class Grades {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Please Enter The Students Marks");

        int score = s.nextInt();

        if (score >=0 & score < 25) {
            System.out.println("grade = F");
        } else if (score >= 25 & score < 45) {
            System.out.println("grade = E");
        } else if (score >= 45 & score < 50) {
            System.out.println("grade = D");
        } else if (score >= 50 & score < 60) {
            System.out.println("grade = C");
        } else if (score >= 60 & score < 80) {
            System.out.println("grade = B");
        } else if (score >= 80 & score <=100) {
            System.out.println("grade = A");
        }
        else {
            System.out.println("Not Correct Marks");
        }
    }
}
