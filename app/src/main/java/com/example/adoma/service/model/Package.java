package com.example.adoma.service.model;

public class Package {
    String _id;
    String type;
    String price;
    String credit;

    public Package(String _id, String type, String price, String credit) {
        this._id = _id;
        this.type = type;
        this.price = price;
        this.credit = credit;
    }

    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getCredit() {
        return credit;
    }

    public void setCredit(String credit) {
        this.credit = credit;
    }
}
