package com.example.loginwithupdatehomework;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.widget.Toast;

public class SignUpDatabaseAction extends SQLiteOpenHelper {
SQLiteDatabase sqldatabase;
String mobile_no,email,password,name;
    public SignUpDatabaseAction( Context context) {
        super(context,"homework.db",null,1);
        sqldatabase = getWritableDatabase();
    }

    public
    void
    setInputs( String a_mobile_no,
               String a_email,
               String a_password,
               String a_name )
    {
       mobile_no = a_mobile_no;
       email     = a_email;
       password  = a_password;
       name      = a_name;
        ContentValues context = new ContentValues();
        context.put("mobileno",a_mobile_no );
        context.put("email",a_email );
        context.put("password",a_password );
        context.put("name",a_name);
        sqldatabase.insert("owntable",null,context );

    }

     @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("create table member ( mobileno text,email text, password text, name text )");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
