package com.tae.a130retrofit;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.RoomDatabase;

@Database(entities = {MyEntity.class}, version = 1)
public abstract class AppDatabase extends RoomDatabase {
   public abstract EntityDao entityDao();
}