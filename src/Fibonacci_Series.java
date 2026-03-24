import java.util.Scanner;

public class Fibonacci_Series {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        int num=inp.nextInt();
        int a=0;
        int b=1;
        for (int i=0;i<num;i++){
            System.out.println(a);
            int temp=b;
            b=a+b;
            a=temp;
        }
    }
}
