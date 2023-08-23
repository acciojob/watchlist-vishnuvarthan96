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

    public double getImbdRating() {
        return ImbdRating;
    }

    public void setImbdRating(double imbdRating) {
        this.ImbdRating = imbdRating;
    }

    private String name;
    private int numberOfMovies;
    private double ImbdRating;
   public Director(String name,int numberOfMovies,double imbdRating){
        this.name=name;
        this.numberOfMovies=numberOfMovies;
        this.ImbdRating =imbdRating;
    }
    public Director(){
        this.name="";
        this.ImbdRating =0;
        this.numberOfMovies=0;
    }
}
