package oop_lab7;
//Talking about Student?
//1.Student ID
//2.Major
//3.Faculty
//4.Name


public class Student {
    private String id;
    private String major;
    private String faculty;
    private String name;
    //Constructor
    //Default constructor
    private Student(){}
    //crate constructor by owner
    private Student(String id,String m, String f, String n){
        //assign data to class properties
        this.id =id;
        this.faculty =f;
        this.major =m;
        this.name =n;
    }
    //getter and setter methods
    public String getID(){
        return this.id;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", major='" + major + '\'' +
                ", faculty='" + faculty + '\'' +
                ", name='" + name + '\'' +
                '}';
    }//to string

    public void setId(String id){
        this.id = id;
    }

    public String getMajor() {
        return this.major;
    }
    public void setMajor(){
        this.major=major;
    }
    public String getFaculty() {
        return this.faculty;
    }
    public void setFaculty(){
        this.faculty=faculty;
    }
    public String getName() {
        return this.name;
    }
    public void setName(){
        this.name=name;
    }
}//class
