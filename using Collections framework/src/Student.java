package src;

import java.util.Random;

public class Student {

    static Random rand = new Random();
    String name;
    String id;
    Branch branch;
    Class cls;

    public Student(String name,int branch,int cls){
        this.name = name;
        this.branch = Branch.valueOf(Branch.setBranch(branch));
        this.cls = Class.valueOf(Class.setClass(cls));
        this.id = this.branch + Integer.toString(rand.nextInt(180));
    }

    public String getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Name : " + this.name + "\nBranch : " + this.branch + "\nClass : " + this.cls + "\nID : " + this.id;
    }
}