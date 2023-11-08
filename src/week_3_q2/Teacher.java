package week_3_q2;

public class Teacher extends Person{
    private double salary;
    private String subject;
    public Teacher(String name,int age,String subject,double salary,String gender){
        super(name,age,gender);
        this.subject=subject;
        this.salary=salary;

    }
    public double getSalary() {
        return salary;
    }
    public String getSubject(){
        return subject;
    }
    public void setSalary(double salary){
        this.salary=salary;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }
    public String toString(){
        return super.toString()+"subject"+ subject +"salary"+ salary;
    }
    public void setAge(int age){
        super.setMyAge(age);
    }
}


