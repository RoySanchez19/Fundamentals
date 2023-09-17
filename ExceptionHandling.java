package Project_Fundamentals;

public class ExceptionHandling {
    public static void main(String[] args) {
        try{
            int result = 10 / 0;
        }catch (ArithmeticException e){
            System.out.println("Error: " + e.getMessage());
        }

        // Know Exception Handling captures and shows the problem so that it can fix it.
    }
}
