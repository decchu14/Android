package com.example.lab_5.data;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import com.example.lab_5.model.login;
import com.example.lab_5.model.register;
import com.example.lab_5.params.params;

public class MyDbHandler extends SQLiteOpenHelper {


    public MyDbHandler(Context context)
    {
        super(context, "loginDB",null,1);

    }
    @Override
    public void onCreate(SQLiteDatabase db) {
        String create = "CREATE TABLE loginTB(user TEXT PRIMARY KEY, pass TEXT)";
        db.execSQL(create);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {

    }

    public boolean addUser(register r)
    {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();

        values.put("user", r.getUsername());
        values.put("pass",r.getPassword());
        Log.v("SomeTag" , r.getPassword());

        long result = db.insert("loginTB", null, values);
        if(result == -1)
            return false;
        return true;
    }

    public void display()
    {

    }
}
