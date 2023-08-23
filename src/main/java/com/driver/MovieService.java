package com.driver;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Service
public class MovieService {
    MovieRepository repo=new MovieRepository();
    public void addMovie(Movie movie){
      repo.addMovie(movie);
    }
    public void addDirector(Director director){
        repo.addDirector(director);
    }
  public  void addMovieDirectorPair(String directorName,String movieName){
        repo.addMovieDirectorPair(directorName,movieName);
   }
   public Movie getMovieByName(String name){
        return repo.getMovieByName(name);
   }

    public Director getDirectorByName(String name){
        return repo.getDirectorByName(name);
    }

    public List<String> getMoviesByDirectorName(String name){
        HashMap<Movie,Director> pairData=repo.getMoviesByDirectorName();
       List<String> movieName=new ArrayList<>();
        for(Movie movie:pairData.keySet()){
            if(pairData.get(movie).getName().equals(name)){
                 movieName.add(movie.getName());
            }
        }
        return movieName;
    }

    public List<String> findAllMovies(){
        HashMap<String,Movie> movieData=repo.findAllMovies();
        List<String> movieName=new ArrayList<>();
        for(Movie movie: movieData.values()){
            movieName.add(movie.getName());
        }
        return movieName;
    }
   public void deleteDirectorByName(String name){
        repo.deleteDirectorByName(name);
    }
    public void deleteAllDirectors(){
        repo.deleteAllDirectors();
    }

}
