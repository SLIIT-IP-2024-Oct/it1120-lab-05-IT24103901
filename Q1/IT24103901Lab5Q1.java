import java.util.Scanner;

public class IT24103901Lab5Q1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
       
        System.out.println("Enter the first integer:");
        int firstNum = scanner.nextInt();
        
        System.out.println("Enter the second integer:");
        int secondNum = scanner.nextInt();
        
        System.out.println("Enter the third integer:");
        int thirdNum = scanner.nextInt();
        
        
        int largest = firstNum;
        if (secondNum > largest) {
            largest = secondNum;
        }
        if (thirdNum > largest) {
            largest = thirdNum;
        }
        

        int smallest = firstNum;
        if (secondNum < smallest) {
            smallest = secondNum;
        }
        if (thirdNum < smallest) {
            smallest = thirdNum;
        }

        
        System.out.println("User entered numbers are: " + firstNum + ", " + secondNum + ", " + thirdNum);
        System.out.println("The smallest number is: " + smallest);
        System.out.println("The largest number is: " + largest);
        
        
        scanner.close();
    }
}
