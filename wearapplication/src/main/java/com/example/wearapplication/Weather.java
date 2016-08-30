package com.example.wearapplication;

/**
 * Created by akshitgupta on 29/08/16.
 */

public class Weather {

    int weatherId;
    double high;
    double low;
    String cityName;
    double cityLatitude ;
    double cityLongitude;
    String description;

    public int getWeatherId() {
        return weatherId;
    }

    public void setWeatherId(int weatherId) {
        this.weatherId = weatherId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getCityLatitude() {
        return cityLatitude;
    }

    public void setCityLatitude(double cityLatitude) {
        this.cityLatitude = cityLatitude;
    }

    public double getCityLongitude() {
        return cityLongitude;
    }

    public void setCityLongitude(double cityLongitude) {
        this.cityLongitude = cityLongitude;
    }

    public double getHigh() {
        return high;
    }

    public void setHigh(double high) {
        this.high = high;
    }

    public double getLow() {
        return low;
    }

    public void setLow(double low) {
        this.low = low;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    @Override
    public String toString() {
        return "Weather{" +
                "high=" + high +
                ", low=" + low +
                ", cityName='" + cityName + '\'' +
                ", cityLatitude=" + cityLatitude +
                ", cityLongitude=" + cityLongitude +
                ", description='" + description + '\'' +
                '}';
    }
}
