package com.example.word;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.lang.reflect.Array;
import java.util.ArrayList;

import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {

    int[] imgId={R.drawable.c1, R.drawable.c2, R.drawable.c3, R.drawable.c4, R.drawable.c5,
            R.drawable.c6, R.drawable.c7, R.drawable.c8,R.drawable.c9, R.drawable.c10};

    ImageView  imageView;
    EditText editText;






    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        imageView = findViewById(R.id.imageView);
        EditText a =  findViewById(R.id.ed0);


        a.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                sh();

            }
        });



    }

    public void sh(){

        try {
            EditText a =  findViewById(R.id.ed0);
            int num = Integer.parseInt(a.getText().toString());
            imageView.setImageResource(imgId[num-1]);
        }
        catch (Exception e){
            Toast.makeText(this, "請輸入1~10其中一個數字", Toast.LENGTH_LONG).show();
        }

    }




}



