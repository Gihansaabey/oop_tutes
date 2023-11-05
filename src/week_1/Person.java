package week_1;

public class Person {
    private String name;
    private String surname;
    private int age;

    public Person(String nam){
        name=nam;
    }
    public void displayName(){
        System.out.println(name);
    }

    public void  setSurname(String sName){
        surname=sName;
    }
    public void setAge(int mAge){
        age=mAge;
    }

    public String getSurname(){
        return surname;
    }
    public int getAge(){
        return age;
    }
}



