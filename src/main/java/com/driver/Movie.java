package com.driver;

public class Movie {

    //String name, int durationInMinutes, double imdbRating, no-args constructor, all-args constructor and getters-setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDurationInMinutes() {
        return durationInMinutes;
    }

    public void setDurationInMinutes(int durationInMinutes) {
        this.durationInMinutes = durationInMinutes;
    }

    public double getImdbRating() {
        return ImdbRating;
    }

    public void setImdbRating(double imdbRating) {
        this.ImdbRating = imdbRating;
    }

    private String name;
    private int durationInMinutes;
    private double ImdbRating;
     public Movie(String name,int durationInMinutes,double imdbRating){
        this.name=name;
        this.durationInMinutes=durationInMinutes;
        this.ImdbRating = imdbRating;
    }
   public Movie(){
        this.name="";
        this.ImdbRating =0;
        this.durationInMinutes=0;
    }
}
