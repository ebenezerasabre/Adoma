package com.example.adoma.service.model;

public class Location {
    String _id;
    String cusID;
    String houseNo;
    String gps;
    String city;
    String town;
    String suburb;
    String landmark;

    public Location(String _id, String cusID, String houseNo, String gps, String city, String town, String suburb, String landmark) {
        this._id = _id;
        this.cusID = cusID;
        this.houseNo = houseNo;
        this.gps = gps;
        this.city = city;
        this.town = town;
        this.suburb = suburb;
        this.landmark = landmark;
    }

    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    public String getCusID() {
        return cusID;
    }

    public void setCusID(String cusID) {
        this.cusID = cusID;
    }

    public String getHouseNo() {
        return houseNo;
    }

    public void setHouseNo(String houseNo) {
        this.houseNo = houseNo;
    }

    public String getGps() {
        return gps;
    }

    public void setGps(String gps) {
        this.gps = gps;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        this.town = town;
    }

    public String getSuburb() {
        return suburb;
    }

    public void setSuburb(String suburb) {
        this.suburb = suburb;
    }

    public String getLandmark() {
        return landmark;
    }

    public void setLandmark(String landmark) {
        this.landmark = landmark;
    }
}
