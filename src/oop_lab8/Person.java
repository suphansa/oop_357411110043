package oop_lab8;

public class Person {
   private String personID;
   private String name;
   private String gender;
   private int age;

    @Override
    public String toString() {
        return "Person{" +
                "personID='" + personID + '\'' +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                '}';
    }

    public Person() {}
    public Person(String personID, String name, String getder, int age) {
        this.personID = personID;
        this.name = name;
        this.gender = getder;
        this.age = age;
    }
    //

    public String getPersonID() {
        return personID;
    }

    public void setPersonID(String personID) {
        this.personID = personID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGetder() {
        return gender;
    }

    public void setGetder(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

