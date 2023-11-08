package week_3_q2;

public class Person {
    protected String myName ; // name of the person
    protected int myAge; // person’s age
    protected String myGender; // “M” for male, “F” for female
    public Person(String name, int age, String gender) {
        myName = name; myAge = age ; myGender = gender; }

    public String getMyName() {
        return myName;
    }

    public void setMyName(String myName) {
        this.myName = myName;
    }

    public int getMyAge() {
        return myAge;
    }

    public void setMyAge(int myAge) {
        this.myAge = myAge;
    }

    public String getMyGender() {
        return myGender;
    }

    public void setMyGender(String myGender) {
        this.myGender = myGender;
    }

    public String toString() {
        return myName + ", age: " + myAge + ", gender: " +myGender;
    }
}
