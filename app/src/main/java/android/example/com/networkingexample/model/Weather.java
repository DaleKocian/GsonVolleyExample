package android.example.com.networkingexample.model;

import com.google.gson.annotations.SerializedName;

/**
 * Created by dkocian on 9/10/2014.
 */
public class Weather {
    @SerializedName("cod")
    private String cod;
    @SerializedName("message")
    private double message;
    @SerializedName("city")
    private City city;
    @SerializedName("cnt")
    private int count;

    public Weather(String cod, double message, City city, int count) {
        this.cod = cod;
        this.message = message;
        this.city = city;
        this.count = count;
    }

    public String getCod() {
        return cod;
    }

    public void setCod(String cod) {
        this.cod = cod;
    }

    public double getMessage() {
        return message;
    }

    public void setMessage(double message) {
        this.message = message;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public String toString() {
        return "Weather{" +
                "cod='" + cod + '\'' +
                ", message=" + message +
                ", city=" + city.toString() +
                ", count=" + count +
                '}';
    }
}
