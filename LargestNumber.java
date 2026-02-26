import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter three numbers:");
        double n1 = input.nextDouble();
        double n2 = input.nextDouble();
        double n3 = input.nextDouble();

        // Comparison Logic
        if (n1 >= n2 && n1 >= n3) {
            System.out.println(n1 + " is the largest.");
        } else if (n2 >= n1 && n2 >= n3) {
            System.out.println(n2 + " is the largest.");
        } else {
            System.out.println(n3 + " is the largest.");
        }
        
        input.close();
    }
}