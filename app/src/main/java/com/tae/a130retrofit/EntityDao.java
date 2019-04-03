package com.tae.a130retrofit;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;
import android.arch.persistence.room.Update;

import java.util.List;

@Dao
    public interface EntityDao {

        @Query("SELECT * FROM myEntity")
        List<MyEntity> getAll();

        @Query("SELECT * FROM myEntity WHERE id = :id")
        MyEntity getById(long id);

        @Insert
        void insert(MyEntity employee);

        @Update
        void update(MyEntity employee);

        @Delete
        void delete(MyEntity employee);

    }
