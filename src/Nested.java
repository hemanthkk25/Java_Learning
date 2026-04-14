import java.util.Scanner;

public class Nested{
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Enter Employee ID: ");
        int empID = in.nextInt();

        System.out.print("Enter Department: ");
        String department = in.next();

        switch (empID) {
            case 1:
                System.out.println("Hemanth");
                break;

            case 2:
                System.out.println("Rohit");
                break;

            case 3:
                System.out.print("Emp 3 name");
                switch (department) {
                    case "IT":
                        System.out.println("IT Department");
                        break;

                    case "Management":
                        System.out.println("Management Department");
                        break;

                    default:
                        System.out.println("No department entered");
                }
                break;

            default:
                System.out.println("Enter valid Employee ID");
        }

        in.close();
    }
}