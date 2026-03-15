import java.util.Scanner;

public class Integer_Input {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the roll number: ");
        int rollNo = input.nextInt();
        System.out.println("Your Roll Number: "+ rollNo);
    }
}
