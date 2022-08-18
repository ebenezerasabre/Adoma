package com.example.adoma.service.dao;

//import android.arch.persistence.room.Dao;
//import android.arch.persistence.room.Delete;
//import android.arch.persistence.room.Insert;
//import android.arch.persistence.room.Query;
//import android.arch.persistence.room.Update;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.example.adoma.service.entity.CustomerEntity;

import java.util.List;

@Dao
public interface CustomerDao {

    @Insert
    void insert(CustomerEntity customer);

    @Delete
    void delete(CustomerEntity customer);

    @Update
    void update(CustomerEntity customer);

    @Query("SELECT * FROM customerentity")
    List<CustomerEntity> getAll();
}
