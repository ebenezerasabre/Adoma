package com.example.adoma.service.entity;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

@Entity
public class ManagerEntity {
    private static final long serialVersionUID = 110219951L;

    @PrimaryKey(autoGenerate = true)
    String _id;

    @ColumnInfo(name = "firstname")
    String firstname;

    @ColumnInfo(name = "lastname")
    String lastname;

    @ColumnInfo(name = "othername")
    String othername;

    @ColumnInfo(name = "phone")
    String phone;

    @ColumnInfo(name = "email")
    String email;

    @ColumnInfo(name = "type")
    String type;

    public ManagerEntity() {
    }

    public ManagerEntity(String _id, String firstname, String lastname, String othername, String phone, String email, String type) {
        this._id = _id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.othername = othername;
        this.phone = phone;
        this.email = email;
        this.type = type;
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

    @Override
    public String toString() {
        return "ManagerEntity{" +
                "_id='" + _id + '\'' +
                ", firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", othername='" + othername + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
