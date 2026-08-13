// Compiled Problems 

// PROBLEM 1: AGE CATEGORY
import java.util.Scanner;

public class main {

public static void main(String[] arg) {

System.out.println("What is your age?:");

Scanner inputAge = new Scanner(System.in);
Integer userAgeInput = inputAge.nextInt();

if (userAgeInput < 13) {
    System.out.print("You are a child.");
} else if (userAgeInput >= 13 && userAgeInput <= 19) {
    System.out.print("You are a teenager.");
} else if (userAgeInput >= 20 && userAgeInput <= 122) { 
    System.out.print("You are an adult.");
} else {
    System.out.println("Please input an actual age.");
}

}

}
