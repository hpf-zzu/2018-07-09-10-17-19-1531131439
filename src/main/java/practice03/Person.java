package practice03;
public class Person {
    private String name ;
    private int age ;

    public Person(String to, int i) {
        this.name = to;
        this.age = i;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public static void main(String[] args){
        Person person = new Person("Tom",21);
        person.introduce();
    }

    public String introduce(){
        return "My name is " + name +"." + " I am " + age + " years old.";

    }

}
