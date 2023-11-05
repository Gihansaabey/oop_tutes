package week_2;

public class Movie {
    private String title;
    private String category;
    private int numAward;
    private Director director;

    public Movie(String title, String category, Director director){
        this.title=title;
        this.category=category;
        this.director=director;
    }

    public String getTitle(){

        return title;
    }
    public String getCategory(){

        return category;
    }
    public Director getDirector(){

        return director;
    }
    public int getNumAwards(){

        return numAward;
    }
    public void setNumAwards(int numAward){

        this.numAward=numAward;
    }
    public String toString(){
        return "Movie[title = " + title +
                ", category = " + category +
                ", director name = " + director.getName() +
                ", director surname = " + director.getSurname()+
                ", number of awards = " + numAward + "]";
    }

}
