package com.example.crackdetection;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.crackdetection.helpers.ImageHelperActivity;
import com.example.crackdetection.image.CrackClassificationActivity;
import com.example.crackdetection.image.ImageClassificationActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onGotoImageActivity(View view){
         Intent intent = new Intent(this, ImageClassificationActivity.class);
         startActivity(intent);
    }

    public void onGotoCrackClassification(View view){
        Intent intent = new Intent(this, CrackClassificationActivity.class);
        startActivity(intent);
    }


}