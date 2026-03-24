import java.util.Scanner;

public class while_loop {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        System.out.print("Enter a number:");
        int num=inp.nextInt();
        while(num<=10){
            System.out.println(num);
            System.out.print("Enter the next number:");
            num=inp.nextInt();
        }
        System.out.println("You have entered the number greater than 10\nProgram ended !!");
    }
}
