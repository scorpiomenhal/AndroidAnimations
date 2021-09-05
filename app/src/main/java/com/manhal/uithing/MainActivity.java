package com.manhal.uithing;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.txt2);
    }
    public void gotothesecondactivity(){
        Intent intent = new Intent(MainActivity.this,SecondActivity.class);
        startActivity(intent);
    }
    public  void animate(View view){
        textView.animate().rotationBy(120).start();
      textView.animate().alpha(0).setDuration(1500).start();
      gotothesecondactivity();

    }
}