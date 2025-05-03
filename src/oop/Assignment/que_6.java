package oop.Assignment;

public class que_6 {
    public static void main(String[] args) {
        Movies[] movies = new Movies[5];
        movies[0] = new Movies("shetan", "aaa", "2 star");
        movies[1] = new Movies("kgf", "aab", "3 star");
        movies[2] = new Movies("kkk", "axv", "4 star");
        movies[3] = new Movies("kgf-2", "asfa");
        movies[4] = new Movies("kkk-2", "aada", "5 star");
        Movies[] fiveStarMovies = Movies.get5StarMovies(movies);
        for (int i = 0; i < fiveStarMovies.length; i++) {
            System.out.println(fiveStarMovies[i].title + " - " + fiveStarMovies[i].rating);
        }
    }
}
class Movies {
    String title;
    String studio;
    String rating;

    Movies(String title, String studio, String rating) {
        this.title = title;
        this.studio = studio;
        this.rating = rating;
    }
    Movies(String title, String studio) {
        this.title = title;
        this.studio = studio;
        this.rating = "5 star";
    }
    public Movies(){}
   public static Movies[] get5StarMovies(Movies[] movies) {
       int c = 0;
       for (int i = 0; i < movies.length; i++) {
           if (movies[i].rating.equals("5 star")) {
               c++;
           }
       }
      Movies[] fiveStarMovies = new Movies[c];
       int j=0;
        for(int i=0; i< movies.length; i++){
            if(movies[i].rating.equals("5 star")){
                fiveStarMovies[j]=movies[i];
                j++;
            }
        }
        return fiveStarMovies;
    }
}


