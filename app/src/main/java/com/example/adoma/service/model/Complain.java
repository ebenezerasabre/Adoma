package com.example.adoma.service.model;

public class Complain {
    String _id;
    String cusID;
    String type;
    String content;
    String date;
    String status;

    public Complain(String _id, String cusID, String type, String content, String date, String status) {
        this._id = _id;
        this.cusID = cusID;
        this.type = type;
        this.content = content;
        this.date = date;
        this.status = status;
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

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
