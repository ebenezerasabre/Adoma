package com.example.adoma.service.entity;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

@Entity
public class CustomerEntity {
    private static final long serialVersionUID = 110219951L;

    @PrimaryKey(autoGenerate = true)
    String _id;

    @ColumnInfo(name = "firstName")
    String firstname;

    @ColumnInfo(name = "lastName")
    String lastname;

    @ColumnInfo(name = "DPno")
    String DPNo;

    @ColumnInfo(name = "RouterNo")
    String routerNo;

    @ColumnInfo(name = "phone")
    String phone;

    @ColumnInfo(name = "GHCard")
    String GHCard;

    @ColumnInfo(name = "accNo")
    String accNo;

    @ColumnInfo(name = "LanLine")
    String LanLine;

    @ColumnInfo(name = "date")
    String date;

    public CustomerEntity() {
    }

    public CustomerEntity(String _id, String firstname, String lastname, String DPNo, String routerNo, String phone, String GHCard, String accNo, String lanLine, String date) {
        this._id = _id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.DPNo = DPNo;
        this.routerNo = routerNo;
        this.phone = phone;
        this.GHCard = GHCard;
        this.accNo = accNo;
        this.LanLine = lanLine;
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
        return routerNo;
    }

    public void setRouterNo(String routerNo) {
        this.routerNo = routerNo;
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

    @Override
    public String toString() {
        return "CustomerEntity{" +
                "_id='" + _id + '\'' +
                ", firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", DPNo='" + DPNo + '\'' +
                ", routerNo='" + routerNo + '\'' +
                ", phone='" + phone + '\'' +
                ", GHCard='" + GHCard + '\'' +
                ", accNo='" + accNo + '\'' +
                ", LanLine='" + LanLine + '\'' +
                ", date='" + date + '\'' +
                '}';
    }
}
