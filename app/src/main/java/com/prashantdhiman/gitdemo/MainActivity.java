package com.prashantdhiman.gitdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView=findViewById(R.id.textview);

        Toast.makeText(getApplicationContext(),"this is toast",Toast.LENGTH_SHORT).show();

        Toast.makeText(getApplicationContext(),"this is toast",Toast.LENGTH_SHORT).show();
        Toast.makeText(getApplicationContext(),"this is toast",Toast.LENGTH_SHORT).show();
        Toast.makeText(getApplicationContext(),"this is toast",Toast.LENGTH_SHORT).show();
    }
}
