public class BlockScope {
    public static void main(String[] args) {
        if (true) {
            int a = 5;  // block scope
            System.out.println(a);
        }

        // System.out.println(a);  Error
    }
}