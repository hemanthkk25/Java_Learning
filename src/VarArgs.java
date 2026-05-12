import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
        fun(1,2,64,63,63);
    }
    static void fun(int ...a){
        System.out.println(Arrays.toString(a));
    }
}
