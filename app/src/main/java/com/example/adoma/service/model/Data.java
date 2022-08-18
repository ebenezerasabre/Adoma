package com.example.adoma.service.model;

public class Data {
    String _id;
    String cusID;
    String type;
    String _package;
    String date;

    public Data(String _id, String cusID, String type, String _package, String date) {
        this._id = _id;
        this.cusID = cusID;
        this.type = type;
        this._package = _package;
        this.date = date;
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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String get_package() {
        return _package;
    }

    public void set_package(String _package) {
        this._package = _package;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
