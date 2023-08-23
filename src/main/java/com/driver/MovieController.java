package com.driver;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/movies")
public class MovieController {

    MovieService serv =new MovieService();
    @PostMapping("/add-movie")
    ResponseEntity<String> addMovie(@RequestBody Movie movie){

        serv.addMovie(movie);
        return new ResponseEntity<>("success", HttpStatus.OK);
    }
    @PostMapping("/add-director")
    ResponseEntity<String> addDirector(@RequestBody Director director){
        serv.addDirector(director);
        return new ResponseEntity<>("success",HttpStatus.OK);
    }
    @PutMapping("/add-movie-director-pair")
    ResponseEntity<String> addMovieDirectorPair(@RequestParam String movieName,String directorName){
     serv.addMovieDirectorPair(directorName,movieName);
        return new ResponseEntity<>("success",HttpStatus.OK);
    }

    @GetMapping("/get-movie-by-name/{name}")
    ResponseEntity<Movie> getMovieByName(@PathVariable String name){
    Movie movieObj=serv.getMovieByName(name);

    return new ResponseEntity<>(movieObj,HttpStatus.OK);
    }

    @GetMapping("/get-director-by-name/{name}")
    ResponseEntity<Director> getDirectorByName(@PathVariable String name){
        Director directorObj=serv.getDirectorByName(name);

        return new ResponseEntity<>(directorObj,HttpStatus.OK);
    }

    @GetMapping("/get-movies-by-director-name/{name}")
    ResponseEntity<List<String>> getMoviesByDirectorName(@PathVariable String name){

        return new ResponseEntity<>(serv.getMoviesByDirectorName(name),HttpStatus.OK);
    }

        @GetMapping("/get-all-movies")
    ResponseEntity<List<String>> findAllMovies(){
        return new ResponseEntity<>(serv.findAllMovies(),HttpStatus.OK);
    }

    @DeleteMapping("/delete-director-by-name")
    ResponseEntity<String> deleteDirectorByName(@RequestParam String directorName){
        serv.deleteDirectorByName(directorName);
        return new ResponseEntity<>("Success",HttpStatus.OK);
    }

    @DeleteMapping("/delete-all-director")
    ResponseEntity<String> deleteAllDirector(){
        serv.deleteAllDirector();
        return new ResponseEntity<>("success",HttpStatus.OK);
    }

}
