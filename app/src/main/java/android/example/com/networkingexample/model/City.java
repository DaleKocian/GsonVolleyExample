package android.example.com.networkingexample.model;

import com.google.gson.annotations.SerializedName;

/**
 * Created by dkocian on 9/10/2014.
 */
public class City {
    @SerializedName("id")
    private String id;
    @SerializedName("name")
    private String name;
    @SerializedName("coord")
    private Coordinates coordinates;
    @SerializedName("country")
    private String country;
    @SerializedName("population")
    private int population;

    public City(String id, String name, Coordinates coordinates, String country, int population) {
        this.id = id;
        this.name = name;
        this.coordinates = coordinates;
        this.country = country;
        this.population = population;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Coordinates getCoordinates() {
        return coordinates;
    }

    public void setCoordinates(Coordinates coordinates) {
        this.coordinates = coordinates;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    @Override
    public String toString() {
        return "City{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", coordinates=" + coordinates.toString() +
                ", country='" + country + '\'' +
                ", population=" + population +
                '}';
    }
}
