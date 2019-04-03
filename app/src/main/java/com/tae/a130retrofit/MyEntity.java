package com.tae.a130retrofit;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

@Entity
public class MyEntity {

        @PrimaryKey
        public long id;

        public String name;

        public int phone;
    }
