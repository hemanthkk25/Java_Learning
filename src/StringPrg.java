import java.util.Scanner;

public class StringPrg {
    public static void main(String[] args) {
        Scanner imp = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = imp.next();
        System.out.print(greet(name));
    }
    static String greet(String name){
        String greet="Hello "+ name;
        return greet;
    }
}
