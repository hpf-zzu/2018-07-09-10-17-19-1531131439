package practice06;

public class Teacher extends  Person{
    private int Klass;
    public Teacher(String to, int i, int lass) {
        super(to, i);
        this.Klass = lass;
    }
    public Teacher(String to, int i) {
        super(to, i);
    }

    public int getKlass(){
        return this.Klass;
    }
    public static void main(String args[]){

        Teacher teacher = new Teacher("Tom",21,2);
        Teacher teacher1 = new Teacher("Tom",21);
        teacher.introduce();
        teacher1.introduce();
    }
    public String introduce(){

        String a = super.introduce();
            return a + " I am a Teacher." + " I teach class " + Klass;
    }
}