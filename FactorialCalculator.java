import java.util.Scanner;

public class FactorialCalculator {
    
    public static int getNonNegativeInteger () {
        Scanner scanner = new Scanner(System.in);
        int number;
        
        System.out.println ("Enter non-negative integer: ");
        number = scanner.nextInt();
        
        if (number < 0) {
            System.out.println("Error: Input must non-negative integer. Using default value 0.");
            
            number = 0;
        }
        return number;
    }
    
    public static long calculateFactorial (int n) {
        if (n == 0) {
            return 1;
        }
        
        long factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *=i;
        }
        return factorial;
    }
    
    public static void main (String[] args) {
        int number = getNonNegativeInteger();
        long factorial = calculateFactorial(number);
        
        System.out.println("The factorial of " + number + " is:" + factorial);
    }
}