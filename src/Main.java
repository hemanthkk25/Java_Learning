import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner in = new Scanner (System.in);
        int num = in.nextInt();
        if (num>100){
            System.out.println("The number is greater than 100");
        }

        else if (num<100){
            System.out.println("The number is less than 100");
        }

        else{
            System.out.println("None");
        }
    }
}