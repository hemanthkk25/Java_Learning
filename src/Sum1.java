import java.util.Scanner;

public class Sum1 {
    public static void main(StringPrg[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = inp.nextInt();
        System.out.print("Enter second number: ");
        int num2 = inp.nextInt();
        int res=sum(num1,num2);
        System.out.print(res);
    }

    static int sum(int a,int b){
        return a+b;
    }
}
