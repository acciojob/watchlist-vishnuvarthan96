package com.driver;

public class Director {

    //String name, int numberOfMovies, double imdbRating, no-args constructor, all-args constructor and getters-setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberOfMovies() {
        return numberOfMovies;
    }

    public void setNumberOfMovies(int numberOfMovies) {
        this.numberOfMovies = numberOfMovies;
    }

    public double getImdbRating() {
        return ImdbRating;
    }

    public void setImdbRating(double imdbRating) {
        this.ImdbRating = imdbRating;
    }

    private String name;
    private int numberOfMovies;
    private double ImdbRating;
   public Director(String name,int numberOfMovies,double imdbRating){
        this.name=name;
        this.numberOfMovies=numberOfMovies;
        this.ImdbRating =imdbRating;
    }
    public Director(){
        this.name="";
        this.ImdbRating =0;
        this.numberOfMovies=0;
    }
}
