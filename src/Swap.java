import java.util.Arrays;
import java.util.Scanner;

public class Swap {
    public static void main(String[] args) {
        int[] arr = {10,20,50,40,30,60};
        System.out.println("Initial:"+ Arrays.toString(arr));
        swap(arr,2,4);
        System.out.println("Final:"+ Arrays.toString(arr));

    }
    static void swap (int[] a,int i1,int i2){
        int temp=a[i1];
        a[i1]=a[i2];
        a[i2]=temp;
    }
}