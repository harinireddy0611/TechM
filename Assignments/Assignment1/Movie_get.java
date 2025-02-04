package day2;

import java.util.Scanner;

public class Movie_get {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		Movie[] movies=new Movie[n];

        for (int i = 0; i < n; i++) {
        	System.out.println("enter movies info ");
        	int budget = sc.nextInt(); 
            String moviename = sc.next();
            String company = sc.next();
            String genre = sc.next();
            movies[i] = new Movie();
            
            movies[i].setter(moviename, company, genre, budget);
        }
        System.out.println("enter string");
        String searchGenre = sc.next();
        Movie[] result = Solutionmo.getMovieByGenre(movies, searchGenre);
        if (result[0]==null) {
			System.out.println("none matched");
		}
		else {
        for (Movie movie : result) {
            if (movie.getterb() > 80000000) {
                System.out.println("High Budget Movie");
            } else {
                System.out.println("Low Budget Movie");
            }
        }
		}
    }
}

class Movie {
    String moviename;
    String company;
    String genre;
    int budget;
    
    public void setter(String moviename, String company, String genre, int budget) {
    	this.moviename = moviename;
        this.company = company;
        this.genre = genre;
        this.budget = budget;
    }
    public int getterb() {
    	return budget;
    }
    public String getGenre() {
        return genre;
    }
}
class Solutionmo{
	public static Movie[] getMovieByGenre(Movie[] movies, String searchGenre) {
		Movie[] fmovies=new Movie[movies.length];
		int j=0;
		for (int i=0;i<movies.length;i++) {
            if (movies[i].genre==searchGenre) {
                fmovies[j++]=movies[i];
            }
        }
        
		return fmovies;
}
}