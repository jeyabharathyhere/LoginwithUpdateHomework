package com.example.loginwithupdatehomework;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.example.loginwithupdatehomework.SignUpDatabaseAction;

public class SignUpPage extends AppCompatActivity {

    SignUpDatabaseAction signupdatabase;
    EditText ed1,ed2,ed3,ed4,ed5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up_page);
        signupdatabase = new SignUpDatabaseAction( SignUpPage.this );
        ed1 = findViewById( R.id.editText );
        ed2 = findViewById( R.id.editText );
        ed3 = findViewById( R.id.editText );
        ed4 = findViewById( R.id.editText );
        ed5 = findViewById( R.id.editText );
    }


    public void saveInDatabase(View view) {
        if ( ed3.getText().toString() .equals( ed4.getText().toString() ) ) {
            signupdatabase.setInputs(
                    ed1.getText().toString(),
                    ed2.getText().toString(),
                    ed3.getText().toString(),
                    ed5.getText().toString()
            );
            Toast.makeText(this, "Inserted successfully", Toast.LENGTH_SHORT).show();
        }
        else
            Toast.makeText(this, "Confirm password does not match", Toast.LENGTH_SHORT).show();
    }
}
