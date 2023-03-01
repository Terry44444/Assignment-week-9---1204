import java.util.Scanner;

public class App {
    public static void main(String args[]) throws Exception {
        Scanner input = new Scanner(System.in);
        
        
            System.out.println("Enter a number : ");
            int num = input.nextInt(), i = 1;

            System.out.println("You entered " + num);

        long factorial = 1;
        while (i <= num) {
            factorial *= i;
            i++;
        }
        
            if(num < 0)
            {
                throw new Exception("NegativeException");
            }
            else 
            {
                System.out.println("Factorial of " + num + " = " + factorial);
            }
       
        
        input.close();

     

    }
}