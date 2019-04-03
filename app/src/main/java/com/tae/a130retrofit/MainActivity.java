package com.tae.a130retrofit;

import android.arch.persistence.room.Room;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    AppDatabase db = App.getInstance().getDatabase();
    EntityDao entityDao = db.entityDao();
    MyEntity myEntity = new MyEntity();
    
    public void fillEmployee() {
        myEntity.id = 1;
        myEntity.name = "First Man";
        myEntity.phone = 2325517;
        entityDao.insert(myEntity);
    }
}
