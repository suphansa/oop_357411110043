package oop_lab8;
//person is super class
//Student is sub class

public class Studen extends Person {
    private String studentID;
    private String major;

    public Studen(String personID, String name, String getder, int age, String studentID, String major) {
        //call constructor of super of
        super(personID, name, getder, age);
        this.studentID = studentID;
        this.major = major;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentID='" + studentID + '\'' +
                ", major='" + major + '\'' +
                "} " + super.toString();
    }

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }
}//class
