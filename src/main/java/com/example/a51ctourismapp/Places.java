package com.example.a51ctourismapp;

public class Places {
    private int id, image;
    private String placeName;
    private String placeDescription;

    public Places(int id, int image, String placeName, String placeDescription) {
        this.id = id;
        this.image = image;
        this.placeName = placeName;
        this.placeDescription = placeDescription;
    }

    public int getId() { return id; }

    public void setId(int id) { this.id = id; }

    public int getImage() { return image; }

    public void setImage(int image) { this.image = image; }

    public String getPlaceName() { return placeName; }

    public void setPlaceName(String placeName) { this.placeName = placeName; }

    public String getPlaceDescription() { return placeDescription; }

    public void setPlaceDescription(String placeDescription) { this.placeDescription = placeDescription; }
}
