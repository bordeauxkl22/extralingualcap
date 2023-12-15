package com.example.extralingual;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class Progress extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.progress);

        Button home = findViewById(R.id.home2);
        home.setOnClickListener(v -> {
            // Intents are objects of the android.content.Intent type. Your code can send them to the Android system defining
            // the components you are targeting. Intent to start an activity called SecondActivity with the following code.
            Intent intent = new Intent(Progress.this, MainActivity.class);
            // start the activity connect to the specified class
            startActivity(intent);
        });

        Button course = findViewById(R.id.course2);
        course.setOnClickListener(v -> {
            // Intents are objects of the android.content.Intent type. Your code can send them to the Android system defining
            // the components you are targeting. Intent to start an activity called SecondActivity with the following code.
            Intent intent = new Intent(Progress.this, Lessons_page.class);
            // start the activity connect to the specified class
            startActivity(intent);
        });

        Button nextlesson = findViewById(R.id.nextlesson);
        nextlesson.setOnClickListener(v -> {
            // Intents are objects of the android.content.Intent type. Your code can send them to the Android system defining
            // the components you are targeting. Intent to start an activity called SecondActivity with the following code.
            Intent intent = new Intent(Progress.this, Lesson2.class);
            // start the activity connect to the specified class
            startActivity(intent);
        });

        Button nextlesson2 = findViewById(R.id.nextlesson2);
        nextlesson2.setOnClickListener(v -> {
            // Intents are objects of the android.content.Intent type. Your code can send them to the Android system defining
            // the components you are targeting. Intent to start an activity called SecondActivity with the following code.
            Intent intent = new Intent(Progress.this, Lesson3.class);
            // start the activity connect to the specified class
            startActivity(intent);
        });
    }

}
