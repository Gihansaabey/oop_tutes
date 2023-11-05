package week_2;

public class Director {
    private String name;
    private String surname;
    private int numDirectedmovie;
    private Date DoB;

    public Director (String name,String surname){
        this.name=name;
        this.surname=surname;
    }

    public String getName(){
        return name;
    }
    public String getSurname(){
        return surname;
    }
    public Date getDoB(){
        return DoB;
    }
    public int getNumberOfMovie(){
        return numDirectedmovie;
    }
    public void setDoB(Date date){
        this.DoB = date;
    }
    public void setNumberOfMovie(int num){
        this.numDirectedmovie = num;
    }
    public String toString(){
        return "Director[name = " + name +
                ", surname = " + surname +
                ", dob = " + DoB +
                ", movies directed = " + numDirectedmovie + "]";
    }

}
