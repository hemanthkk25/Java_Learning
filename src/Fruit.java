import java.util.Scanner;

public class Fruit {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        String str = inp.next();
        switch (str) {
            case "Mango":
                System.out.print("King of Fruits");
                break;

            case "Apple":
                System.out.print("A sweet red fruit");
                break;

            case "Orange":
                System.out.println("Round fruit");
                break;

            case "Grapes":
                System.out.println("Small fruit");
                break;

            default:
                System.out.println("Invalid Fruit");
        }
    }
}
