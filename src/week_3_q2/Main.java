package week_3_q2;

public class Main {
    public static void main(String[] args) {

        Person sam = new Person("sam",13,"male");
        System.out.println(sam);

        Student ken = new Student("ken","male",23,12345,12);
        System.out.println(ken);

        Teacher tom = new Teacher("don",12,"maths",1234.5,"female");
        System.out.println(tom);

        Person p = new Teacher ( "sam", 34,"science", 11000, "male");
        System.out.println(p);

        //Teacher t = new Person ("hamilton", 34,"male",);

        Person s = new Student ("makd","male",13,2,1);

    }
}
