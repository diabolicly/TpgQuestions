package com.tpg.question2;

public class Student {
    private int id;
    private String name;
    private double gpa;
    
    public Student(int aid, String aname, double agpa) {
        id = aid;
        name = aname;
        gpa = agpa;
    }
    
    public void setID(int aid){
        id = aid;
    }
    
    public void setName(String aname){
        name = aname;
    }
    
    public void setGPA(double agpa){
        gpa = agpa;
    }
    
    public int getID(){
        return id;
    }
    
    public String getName(){
        return name;
    }

    public double getGPA(){
        return gpa;
    }
}
