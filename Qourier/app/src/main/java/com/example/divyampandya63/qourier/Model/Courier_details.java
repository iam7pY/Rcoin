package com.example.divyampandya63.qourier.Model;

/**
 * Created by divyampandya63 on 1/4/18.
 */

public class Courier_details {
    private String cityname;
    private String name;
    private String url;
    private String rate;
    private String time;

    public Courier_details() {
    }

    public Courier_details(String cityname, String name, String url, String rate, String time) {
        this.cityname = cityname;
        this.name = name;
        this.url = url;
        this.rate = rate;
        this.time = time;
    }

    public String getCityname() {
        return cityname;
    }

    public void setCityname(String cityname) {
        this.cityname = cityname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getRate() {
        return rate;
    }

    public void setRate(String rate) {
        this.rate = rate;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}
