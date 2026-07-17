public class OOPS {
    public static void main(String[] args) {

        Student S1 = new Student();
        System.out.println(S1.rno);
    }

}
class Student{
    int rno;
    String name;
    float mark;

    Student(){
        this.mark=100f;
        this.name="Hemanth";
        this.rno=215;
    }

}

