package com.example.stays;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class SignupActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
//        Create an object of the Textview class
        TextView objLoginLink = findViewById(R.id.tvLoginLink);


//        Attach the event listener to the textview
        objLoginLink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                Create an object of the intent class
                Intent objIntent = new Intent(SignupActivity.this, MainActivity.class);

//                Start the activity
                startActivity(objIntent);
            }
        });
    }
}