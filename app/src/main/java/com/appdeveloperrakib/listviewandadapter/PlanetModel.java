package com.appdeveloperrakib.listviewandadapter;



//This class is acting as Model class for our ListView
public class PlanetModel {

    //Attributes
    private String planetName;
    private String moonCount;
    private int planetImage;

    //Constructor


    public PlanetModel(String planetName, String moonCount, int planetImage) {
        this.planetName = planetName;
        this.moonCount = moonCount;
        this.planetImage = planetImage;
    }

    //Getters & Setters


    public String getPlanetName() {
        return planetName;
    }

    public void setPlanetName(String planetName) {
        this.planetName = planetName;
    }

    public String getMoonCount() {
        return moonCount;
    }

    public void setMoonCount(String moonCount) {
        this.moonCount = moonCount;
    }

    public int getPlanetImage() {
        return planetImage;
    }

    public void setPlanetImage(int planetImage) {
        this.planetImage = planetImage;
    }
}
