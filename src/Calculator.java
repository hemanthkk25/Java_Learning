import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        char ans='Y';
        while(ans=='Y'||ans=='y'){
            System.out.print("Enter the operator: ");
            char opr=in.next().trim().charAt(0);
            if (opr=='+'||opr=='-'||opr=='*'||opr=='/'||opr=='%'){
                System.out.print("Enter two numbers: ");
                int num1=in.nextInt();
                int num2=in.nextInt();
                if (opr=='+'){
                    System.out.print("Answer: ");
                    System.out.println(num1+num2);
                }
                else if (opr=='-'){
                    System.out.print("Answer: ");
                    System.out.println(num1-num2);
                }
                else if (opr=='/'){
                    if(num2!=0) {
                        System.out.print("Answer: ");
                        System.out.println(num1 / num2);
                    }
                    else{
                        System.out.println("Second number cannot be Zero");
                    }
                }
                else if (opr=='*'){
                    System.out.print("Answer: ");
                    System.out.println(num1*num2);
                }
                else if (opr=='%'){
                    if(num2!=0) {
                        System.out.print("Answer: ");
                        System.out.println(num1 % num2);
                    }
                    else{
                        System.out.println("Second number cannot be Zero");
                    }
                }

            }
            else{
                System.out.println("Invalid Operation!!");
            }
            System.out.print("Next calculation? Y or N: ");
            ans=in.next().trim().charAt(0);
        }

    }


}
