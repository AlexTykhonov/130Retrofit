package com.tae.a130retrofit;

import android.app.Application;
import android.arch.persistence.room.Room;

public class App extends Application {
 
    public static App instance;
 
    private AppDatabase database;
 
    @Override
    public void onCreate() {
        super.onCreate();
        instance = this;
        AppDatabase db =  Room.databaseBuilder(getApplicationContext(),
                AppDatabase.class, "database")
                .allowMainThreadQueries()
                .build();
    }
 
    public static App getInstance() {
        return instance;
    }
 
    public AppDatabase getDatabase() {
        return database;
    }
}