import java.util.Scanner;

public class Case_check {
    static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        char ltr=in.next().trim().charAt(0);
        if (ltr>='a'&&ltr<='z'){
            System.out.print("This is a lower case letter");
        }

        else if (ltr>='A'&&ltr<='Z'){
            System.out.print("This is a lower case letter");
        }

    }
}
