package com.example.adoma.service.model;

public class Customer {
    String _id;
    String firstname;
    String lastname;
    String DPNo;
    String RouterNo;
    String phone;
    String GHCard;
    String accNo;
    String LanLine;
    String date;

    public Customer(String _id, String firstname, String lastname, String DPNo, String routerNo, String phone, String GHCard, String accNo, String lanLine, String date) {
        this._id = _id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.DPNo = DPNo;
        RouterNo = routerNo;
        this.phone = phone;
        this.GHCard = GHCard;
        this.accNo = accNo;
        LanLine = lanLine;
        this.date = date;
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

    public String getDPNo() {
        return DPNo;
    }

    public void setDPNo(String DPNo) {
        this.DPNo = DPNo;
    }

    public String getRouterNo() {
        return RouterNo;
    }

    public void setRouterNo(String routerNo) {
        RouterNo = routerNo;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getGHCard() {
        return GHCard;
    }

    public void setGHCard(String GHCard) {
        this.GHCard = GHCard;
    }

    public String getAccNo() {
        return accNo;
    }

    public void setAccNo(String accNo) {
        this.accNo = accNo;
    }

    public String getLanLine() {
        return LanLine;
    }

    public void setLanLine(String lanLine) {
        LanLine = lanLine;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
