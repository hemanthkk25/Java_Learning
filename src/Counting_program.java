import java.util.Scanner;

public class Counting_program {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int num=in.nextInt();
        int dig=0;
        int one=0;
        while(num>0){
            dig+=1;
            if (num%10==1){
                one+=1;
            }
            num=num/10;
        }

        System.out.println("Number of digits:" + dig + "\nNumber of one:" + one);
    }
}
