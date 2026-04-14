import java.util.Scanner;

public class Fruit {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        String str = inp.next();
        switch (str) {   //alt+enter on switch
            case "Mango" -> System.out.print("King of Fruits");
            case "Apple" -> System.out.print("A sweet red fruit");
            case "Orange" -> System.out.println("Round fruit");
            case "Grapes" -> System.out.println("Small fruit");
            default -> System.out.println("Invalid Fruit");
        }
    }
}
