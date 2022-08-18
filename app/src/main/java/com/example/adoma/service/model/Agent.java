package com.example.adoma.service.model;

public class Agent {
    String _id;
    String firstname;
    String lastname;
    String othername;
    String phone;
    String email;
    String type;
    String manID;

    public Agent(String _id, String firstname, String lastname, String othername, String phone, String email, String type, String manID) {
        this._id = _id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.othername = othername;
        this.phone = phone;
        this.email = email;
        this.type = type;
        this.manID = manID;
    }

    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getOthername() {
        return othername;
    }

    public void setOthername(String othername) {
        this.othername = othername;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getManID() {
        return manID;
    }

    public void setManID(String manID) {
        this.manID = manID;
    }
}
