package practice03;

public class Worker extends  Person{
    public Worker(String to, int i) {
        super(to, i);
    }
    public static void main(String args[]){
        Worker worker = new Worker("Tom",21);
        worker.introduce();
    }
    public String introduce(){
        return "I am a Worker." + " I have a job.";

    }
}

