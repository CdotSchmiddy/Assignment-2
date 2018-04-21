package assignment2.pkg2018;

/**
 *
 * @author Calum
 */
public class GameLibrary {
    
    //instance variables
    private String name, genre, ageRating;
    private int starRating;

    //constructor
    public GameLibrary(String name, String genre, String ageRating, int starRating) {
        setName(name);
        setGenre(genre);
        setAgeRating(ageRating);
        setStarRating(starRating);
    }
    
    //get & set methods
    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (!name.isEmpty())
            this.name = name;
        else
            throw new IllegalArgumentException("Name cannot be empty");
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        if (!genre.isEmpty())
            this.genre = genre;
        else
            throw new IllegalArgumentException("Genre cannot be empty");
    }

    public String getAgeRating() {
        return ageRating;
    }

    public void setAgeRating(String ageRating) {
        if (!ageRating.isEmpty())
            this.ageRating = ageRating;
        else
            throw new IllegalArgumentException("Age rating cannot be empty");
    }

    public int getStarRating() {
        return starRating;
    }

    public void setStarRating(int starRating) {
        if (starRating >= 1 && starRating <= 10)
            this.starRating = starRating;
        else
            throw new IllegalArgumentException("Star rating must be between 1 and 10.");
    }
    
    //return the complete output
    @Override
    public String toString() {
        return name + " is of the " + genre + " genre and is rated " + ageRating + 
        " with a star rating of " + starRating + " out of 10. ";
}
    
}
