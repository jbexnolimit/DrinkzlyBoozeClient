package com.example.androiddrinkzlyboozeclient.Database;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

@Database(version = 1, entities = CartItem.class, exportSchema = false)
public abstract class CartDatabase extends RoomDatabase {
    public abstract CartDAO cartDao();
    private static CartDatabase instance;

    public static CartDatabase getInstance(Context context){
        if(instance == null)
           instance =  Room.databaseBuilder(context, CartDatabase.class, "DrinkzlyBoozeDB3").build();
                    return instance;

    }

}
