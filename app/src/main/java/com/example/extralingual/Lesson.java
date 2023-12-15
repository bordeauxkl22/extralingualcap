package com.example.extralingual;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class Lesson extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lesson);

        Button home = findViewById(R.id.home2);
        home.setOnClickListener(v -> {
            // Intents are objects of the android.content.Intent type. Your code can send them to the Android system defining
            // the components you are targeting. Intent to start an activity called SecondActivity with the following code.
            Intent intent = new Intent(Lesson.this, MainActivity.class);
            // start the activity connect to the specified class
            startActivity(intent);
        });

        Button course = findViewById(R.id.course1);
        course.setOnClickListener(v -> {
            // Intents are objects of the android.content.Intent type. Your code can send them to the Android system defining
            // the components you are targeting. Intent to start an activity called SecondActivity with the following code.
            Intent intent = new Intent(Lesson.this, Lessons_page.class);
            // start the activity connect to the specified class
            startActivity(intent);
        });

        Button progress = findViewById(R.id.progress2);
        progress.setOnClickListener(v -> {
            // Intents are objects of the android.content.Intent type. Your code can send them to the Android system defining
            // the components you are targeting. Intent to start an activity called SecondActivity with the following code.
            Intent intent = new Intent(Lesson.this, Progress.class);
            // start the activity connect to the specified class
            startActivity(intent);
        });
    }

}
