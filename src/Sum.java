import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        sum();
    }
    static void sum(){          //void is used because no value is returned by the function
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int a= inp.nextInt();
        System.out.print("Enter the second number: ");
        int b= inp.nextInt();
        System.out.print(a+b);
    }
}
