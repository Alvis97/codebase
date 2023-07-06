package com.example.stays;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        Create an object of button class and link it to the button
        Button objLoginBTN = findViewById(R.id.btnLoginPage_Login);

        TextView objTVSign_up = findViewById(R.id.tvLoginSignup);

//        Create an object of the textview class

        objTVSign_up.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                //            Create an intent object
                Intent objIntent = new Intent(MainActivity.this, SignupActivity.class);
//            Start the Activity
                startActivity(objIntent);
            }
        });


    }
}