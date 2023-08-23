package com.driver;

import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;

@Repository
public class MovieRepository {
    HashMap<String ,Movie> movieData=new HashMap<>();
    HashMap<String,Director> directorData=new HashMap<>();
    HashMap<Movie,Director> pairData=new HashMap<>();
   public void addMovie(Movie movie){
        movieData.put(movie.getName(),movie);
    }
    public void addDirector(Director director){
        directorData.put(director.getName(), director);
    }
    public void addMovieDirectorPair(String directorName, String movieName){
       Director temp=directorData.get(directorName);
       Movie temp1=movieData.get(movieName);
       pairData.put(temp1,temp);

    }
    public Movie getMovieByName(String name){
        Movie reqMovie=new Movie();
        try {
             reqMovie= movieData.get(name);
            System.out.println(name);

        }
        catch (Exception e){
            System.out.println("No movie found"+ e);
        }
        return reqMovie;
    }
    public Director getDirectorByName(String name){
        Director reqDirector=new Director();
        try {
            reqDirector= directorData.get(name);
            System.out.println(name);

        }
        catch (Exception e){
            System.out.println("No movie found"+ e);
        }
        return reqDirector;
    }

    public HashMap<Movie,Director> getMoviesByDirectorName(){
        return pairData;
    }

    public HashMap<String,Movie> findAllMovies(){
        return movieData;
    }

    public void deleteDirectorByName(String name){
        for(Movie movie:pairData.keySet()){
            if(pairData.get(movie).getName().equals(name)){
                movieData.remove(movie.getName());
                directorData.remove(pairData.get(movie).getName());
                pairData.remove(movie);
            }
        }
    }

    public void deleteAllDirectors(){
        for(Movie movie:pairData.keySet()){
                movieData.remove(movie.getName());
                directorData.remove(pairData.get(movie).getName());
                pairData.remove(movie);

        }
    }
}
