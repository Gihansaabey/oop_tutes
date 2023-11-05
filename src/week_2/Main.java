package week_2;

public class Main {
    public static void main(String[] args) {
        Director director = new Director("James", "Cameron");
        Date dob = new Date(19, 10, 1990);
        director.setDoB(dob);
        director.setNumberOfMovie(33);
        System.out.println(director);
        System.out.println("Name is " + director.getName());
        System.out.println("Surname is " + director.getSurname());
        System.out.println("Date of birth is " + director.getDoB());
        System.out.println("The no. of movies directed are " + director.getNumberOfMovie());

        Movie movie = new Movie("Avatar", "Fantasy", director);
        System.out.println(movie);
        movie.setNumAwards(5);
        System.out.println(movie);
        System.out.println("Movie name is " + movie.getTitle());
        System.out.println("Movie category is " + movie.getCategory());
        System.out.println("Name of the director is " + movie.getDirector().getName());
        System.out.println("Surname of the director is " + movie.getDirector().getSurname());
        System.out.println("Number of awards are " + movie.getNumAwards());
    }

}
