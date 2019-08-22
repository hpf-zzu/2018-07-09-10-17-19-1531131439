package practice01;

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



/**
 写一个Person类，要有name，age属性，要有一个introduce方法，
 introduce方法返回一个字符串形如：

 >My name is Tom. I am 21 years old.
*/