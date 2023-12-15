package com.example.extralingual;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageButton;

public class Lessons_page extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lessons_page);

       Button home = findViewById(R.id.home2);
        home.setOnClickListener(v -> {
            // Intents are objects of the android.content.Intent type. Your code can send them to the Android system defining
            // the components you are targeting. Intent to start an activity called SecondActivity with the following code.
            Intent intent = new Intent(Lessons_page.this, MainActivity.class);
            // start the activity connect to the specified class
            startActivity(intent);
        });

        ImageButton login = findViewById(R.id.loginbutton2);
        login.setOnClickListener(v -> {
            // Intents are objects of the android.content.Intent type. Your code can send them to the Android system defining
            // the components you are targeting. Intent to start an activity called SecondActivity with the following code.
            Intent intent = new Intent(Lessons_page.this, login_activity.class);
            // start the activity connect to the specified class
            startActivity(intent);
        });

        Button course = findViewById(R.id.course1);
        course.setOnClickListener(v -> {
            // Intents are objects of the android.content.Intent type. Your code can send them to the Android system defining
            // the components you are targeting. Intent to start an activity called SecondActivity with the following code.
            Intent intent = new Intent(Lessons_page.this, Lessons_page.class);
            // start the activity connect to the specified class
            startActivity(intent);
        });

        Button progress = findViewById(R.id.progress2);
        progress.setOnClickListener(v -> {
            // Intents are objects of the android.content.Intent type. Your code can send them to the Android system defining
            // the components you are targeting. Intent to start an activity called SecondActivity with the following code.
            Intent intent = new Intent(Lessons_page.this, Progress.class);
            // start the activity connect to the specified class
            startActivity(intent);
        });


        Button lesson1 = findViewById(R.id.lesson1);
        lesson1.setOnClickListener(v -> {
            // Intents are objects of the android.content.Intent type. Your code can send them to the Android system defining
            // the components you are targeting. Intent to start an activity called SecondActivity with the following code.
            Intent intent = new Intent(Lessons_page.this, Lesson.class);
            // start the activity connect to the specified class
            startActivity(intent);
        });
        Button lesson2 = findViewById(R.id.lesson2);
        lesson1.setOnClickListener(v -> {
            // Intents are objects of the android.content.Intent type. Your code can send them to the Android system defining
            // the components you are targeting. Intent to start an activity called SecondActivity with the following code.
            Intent intent = new Intent(Lessons_page.this, Lesson2.class);
            // start the activity connect to the specified class
            startActivity(intent);
        });
        Button lesson3 = findViewById(R.id.lesson3);
        lesson1.setOnClickListener(v -> {
            // Intents are objects of the android.content.Intent type. Your code can send them to the Android system defining
            // the components you are targeting. Intent to start an activity called SecondActivity with the following code.
            Intent intent = new Intent(Lessons_page.this, Lesson3.class);
            // start the activity connect to the specified class
            startActivity(intent);
        });

    }
}
