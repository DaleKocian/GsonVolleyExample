package android.example.com.networkingexample.model;

import com.google.gson.annotations.SerializedName;

/**
 * Created by dkocian on 9/10/2014.
 */
public class Coordinates {
    @SerializedName("lon")
    private double longitude;
    @SerializedName("lat")
    private double latitude;

    public Coordinates(double longitude, double latitude) {
        this.longitude = longitude;
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    @Override
    public String toString() {
        return "Coordinates{" +
                "longitude=" + longitude +
                ", latitude=" + latitude +
                '}';
    }
}
