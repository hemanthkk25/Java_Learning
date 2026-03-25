import java.util.Scanner;
public class Reverse_program {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int num=in.nextInt();
        System.out.println("Initial number: " + num);
        int ans=0;
        while(num>0){
            int ld=num%10;
            ans=(ans*10)+ld;
            num=num/10;
        }

        System.out.println("Final number after reversing: " + ans);

    }
}
