package com.example.thirdmonthexsercise_3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button screenButton;
    Button contactButton;
    Button profileButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        screenButton = findViewById(R.id.screen_btn);
        contactButton = findViewById(R.id.contact_btn);
        profileButton = findViewById(R.id.profile_btn);

        getSupportFragmentManager().beginTransaction().add(R.id.container, new MainFragment()).commit();

        contactButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getSupportFragmentManager().beginTransaction().replace(R.id.container,new ContactFragment()).commit();

            }
        });

        profileButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getSupportFragmentManager().beginTransaction().replace(R.id.container, new LoveFragment()).commit();
            }
        });

        screenButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getSupportFragmentManager().beginTransaction().replace(R.id.container, new MainFragment()).commit();
            }
        });
    }
}
