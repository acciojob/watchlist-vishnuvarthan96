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

    public double getImbdRating() {
        return ImbdRating;
    }

    public void setImbdRating(double imbdRating) {
        this.ImbdRating = imbdRating;
    }

    private String name;
    private int durationInMinutes;
    private double ImbdRating;
     public Movie(String name,int durationInMinutes,double imbdRating){
        this.name=name;
        this.durationInMinutes=durationInMinutes;
        this.ImbdRating =imbdRating;
    }
   public Movie(){
        this.name="";
        this.ImbdRating =0;
        this.durationInMinutes=0;
    }
}
