public class MethodScope {

    public static void main(String[] args) {
        int x = 10;  // method scope (only inside main)
        display();   // calling another method
    }

    public static void display() {
        // System.out.println(x); ERROR: x not accessible here
        System.out.println("Inside display method");
    }
}