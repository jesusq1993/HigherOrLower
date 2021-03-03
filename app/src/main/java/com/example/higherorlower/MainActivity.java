package com.example.higherorlower;

import androidx.appcompat.app.AppCompatActivity;
import java.math.*;
import java.util.Random;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    int randomNumber = (int)(1+(Math.random()*20));

    public void guess(View view){
        EditText numberEditText = findViewById(R.id.numberEditText);

        if(randomNumber == Integer.parseInt(numberEditText.getText().toString())){
            Toast.makeText(this, "You got it! Try Again!", Toast.LENGTH_LONG).show();
            randomNumber = (int)(1+(Math.random()*20));
        }else if(randomNumber > Integer.parseInt(numberEditText.getText().toString())){
            Toast.makeText(this, "Higher!", Toast.LENGTH_SHORT).show();
        }else{
            Toast.makeText(this, "Lower!", Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}