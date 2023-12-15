package com.example.extralingual;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {
        @Override
        protected void onCreate(Bundle savedInstanceState) {
                super.onCreate(savedInstanceState);
                setContentView(R.layout.main_menu);

                Button home = findViewById(R.id.home2);
                home.setOnClickListener(v -> {
                        // Intents are objects of the android.content.Intent type. Your code can send them to the Android system defining
                        // the components you are targeting. Intent to start an activity called SecondActivity with the following code.
                        Intent intent = new Intent(MainActivity.this, MainActivity.class);
                        // start the activity connect to the specified class
                        startActivity(intent);
                });

                ImageButton login = findViewById(R.id.loginbutton2);
                login.setOnClickListener(v -> {
                        // Intents are objects of the android.content.Intent type. Your code can send them to the Android system defining
                        // the components you are targeting. Intent to start an activity called SecondActivity with the following code.
                        Intent intent = new Intent(MainActivity.this, login_activity.class);
                        // start the activity connect to the specified class
                        startActivity(intent);
                });

                Button course = findViewById(R.id.course2);
                course.setOnClickListener(v -> {
                        // Intents are objects of the android.content.Intent type. Your code can send them to the Android system defining
                        // the components you are targeting. Intent to start an activity called SecondActivity with the following code.
                        Intent intent = new Intent(MainActivity.this, Lessons_page.class);
                        // start the activity connect to the specified class
                        startActivity(intent);
                });

                Button progress = findViewById(R.id.progress2);
                progress.setOnClickListener(v -> {
                        // Intents are objects of the android.content.Intent type. Your code can send them to the Android system defining
                        // the components you are targeting. Intent to start an activity called SecondActivity with the following code.
                        Intent intent = new Intent(MainActivity.this, Progress.class);
                        // start the activity connect to the specified class
                        startActivity(intent);
                });

        }
}

