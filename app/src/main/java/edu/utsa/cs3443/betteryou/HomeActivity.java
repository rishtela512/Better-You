package edu.utsa.cs3443.betteryou;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;


import androidx.appcompat.app.AppCompatActivity;

public class HomeActivity extends AppCompatActivity{

    ImageButton push;
    ImageButton pull;
    ImageButton legs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        push = findViewById(R.id.imageButton);
        pull = findViewById(R.id.imageButton2);
        legs = findViewById(R.id.imageButton3);

        push.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent push = new Intent(HomeActivity.this, PushActivity.class);
                startActivity(push);
            }
        });
        pull.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pull = new Intent(HomeActivity.this, PullActivity.class);
                startActivity(pull);
            }
        });
        legs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent legs = new Intent(HomeActivity.this, LegsActivity.class);
                startActivity(legs);
            }
        });

    }

}