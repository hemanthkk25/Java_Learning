public class OOPS {
    public static void main(String[] args) {

        Student S1 = new Student();
        S1.mark=100f;
        S1.name="Hemanth";
        S1.rno=215;

        System.out.println(S1.rno);
    }

}
class Student{
    int rno;
    String name;
    float mark;
}

