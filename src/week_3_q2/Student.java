package week_3_q2;

public class Student extends Person{
    private int id;
    private double fee;
    private int grade;

    public Student(String name,String gender,int age,int id,int grade){
        super(name,age,gender);
        this.id=id;
        this.grade=grade;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getFee() {
        return fee;
    }

    public void setFee(double fee) {
        this.fee = fee;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }
    public void setAge(int age) {
        super.setMyAge(age);
    }
    public String getGender() {
        return super.getMyGender();
    }
    public void setFee(int fee){
        this.fee=fee;
    }
    public String toString(){
        return super.toString()+"id no "+id+ "grade "+ grade;
    }
}


