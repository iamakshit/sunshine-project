package com.example.wearapplication;

/**
 * Created by akshitgupta on 29/08/16.
 */

public class Weather {

    double high;
    double low;
    String cityName;
    double cityLatitude ;
    double cityLongitude;
    String description;

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
}
