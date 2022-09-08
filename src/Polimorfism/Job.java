package Polimorfism;

public class Job {
    private String name;

    //constructor
    public Job(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String salary(){
        return ("Internship - no salary");
    }
}
