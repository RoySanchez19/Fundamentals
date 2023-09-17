package Project_Fundamentals;

public class ControlStructures {
    public static void main(String[] args) {
        // If-else statement
        int number = 10;
        if(number > 0){
            System.out.println("The number is positive");
        } else {
            System.out.println("The number is negative or zero");
        }

        //While loop
        int count = 1;
        while(count <= 5){
            System.out.println("Count: " + count);
            count++;
        }

        // For loop
        for (int i = 1; i <= 5; i++){
            System.out.println("Iteration: " + i);
        }

        // Know Control Structures is decision-making by evaluating a condition.
    }
}
