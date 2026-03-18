import java.util.Scanner;

public class Main2 {
    static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter First number:");
        int a=in.nextInt();
        System.out.print("Enter Second number:");
        int b=in.nextInt();
        System.out.print("Enter Third number:");
        int c=in.nextInt();

        int max=a;
        if (b>max){
            max=b;
        }
        if (c>max) {
            max = c;
        }
        System.out.print("The max element is: ");
        System.out.print(max);

    }
}
