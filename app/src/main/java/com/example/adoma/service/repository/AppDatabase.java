package com.example.adoma.service.repository;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.RoomDatabase;

import com.example.adoma.service.dao.AgentDao;
import com.example.adoma.service.dao.CustomerDao;
import com.example.adoma.service.dao.ManagerDao;
import com.example.adoma.service.entity.AgentEntity;
import com.example.adoma.service.entity.CustomerEntity;
import com.example.adoma.service.entity.ManagerEntity;

@Database(entities = {CustomerEntity.class, AgentEntity.class, ManagerEntity.class}, version = 1)
public abstract class AppDatabase extends RoomDatabase {
    public abstract CustomerDao customerDao();
    public abstract AgentDao agentDao();
    public abstract ManagerDao managerDao();
}
