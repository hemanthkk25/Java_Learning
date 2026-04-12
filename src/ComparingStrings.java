import java.util.Scanner;

public class ComparingStrings {
    public static void main(String[] args) {
        int a= 10;
        System.out.print(a.equals(10)); // error
        System.out.print(a==10); //true

        String str="Hello";
        System.out.print(str=="Hello"); // true but not recommended for the non-primitive types because it checks whether both belong to the same object
        System.out.print(str.equals("Hello")); // true and recommended
    }
}



