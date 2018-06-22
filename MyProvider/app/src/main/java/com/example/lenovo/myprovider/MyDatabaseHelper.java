package com.example.lenovo.myprovider;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MyDatabaseHelper extends SQLiteOpenHelper {

   public static final String CREATE_CONTACTS = "create table contacts ("
           +"name text, "
           +"phone text, "
           +"sex text)";
   private Context mContext;
   public MyDatabaseHelper(Context context,String name,SQLiteDatabase.CursorFactory factory,int version){
       super(context,name,factory,version);
       mContext = context;
   }

   public void onCreate(SQLiteDatabase db) {
        db.execSQL(CREATE_CONTACTS);
    }
    public void onUpgrade(SQLiteDatabase db,int oldVersion,int newVersion){

    }
}
