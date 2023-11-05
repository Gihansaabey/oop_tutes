package week_1;

public class Main {
    public static void main(String[] args) {

        Person women = new Person("Gihansa");
        women.displayName();

        women.setSurname("abeygunawardena");
        women.setAge(21);
        String surName = women.getSurname();
        System.out.println(surName);
        int age = women.getAge();
        System.out.println(age);
        System.out.println();

        Person women_two = new Person("amaya");
        women_two.displayName();

        women_two.setSurname("wijesinghe");
        women_two.setAge(20);
        surName = women_two.getSurname();
        System.out.println(surName);
        age = women_two.getAge();
        System.out.println(age);
        System.out.println();

        Person women_three = new Person("piushana");
        women_three.displayName();

        women_three.setSurname("kumudanjali");
        women_three.setAge(18);
        surName = women_three.getSurname();
        System.out.println(surName);
        age = women_three.getAge();
        System.out.println(age);

    }

}
