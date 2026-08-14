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


// Problem 2: Temperature Evaluation 

import java.util.Scanner;


public class tempeval {

    
    public static void main (String[] arg) {

System.out.println("Good day!");
System.out.println("What is today's temperature in celsius?: ");

Scanner tempEval = new Scanner(System.in);
double  tempEvalinput = tempEval.nextDouble();



if (tempEvalinput < 0 ) {
    System.out.println("Freezing!");
} else if (tempEvalinput >= 0 && tempEvalinput <= 25 ) {
    System.out.println("Nomral Weather");
} else if (tempEvalinput > 25) {
    System.out.println("Hot Weather");
}

    }
}




// Problem 3: Simple Grade Evaluator

import java.util.Scanner;

public class gradeevaluator {

public static void main (String[] arg) {


System.out.println("Greetings."); 
System.out.println("Enter the grade you want evaluated: "); 

Scanner gradeInput = new Scanner(System.in);
int userGradeInput = gradeInput.nextInt();


if (userGradeInput >= 90 && userGradeInput <= 100) {
    System.out.println("Excellent");
} else if (userGradeInput >= 75 && userGradeInput <= 89) {
    System.out.println("Good");
} else if (userGradeInput < 75) {  
    System.out.println("Needs Improvement");
} else { System.out.println("Input an actual grade. Try again.");
}

}

}



