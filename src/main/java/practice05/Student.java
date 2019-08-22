package practice05;
public class Student extends Person {
    private int Klass;
    public Student(String to, int i, int lass) {
        super(to, i);
        this.Klass = lass;
    }
    public int getKlass(){
        return this.Klass;
    }
    public static void main(String args[]){
        Student student = new Student("Tom",21,2);

    }
    public String introduce(){
        String a = super.introduce();
        return a + " I am a Student." + " I am at Class " + Klass +".";

    }

}