package com.example.cw5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        TextView a = findViewById(R.id.textView3);
        Bundle pharmacy = getIntent().getExtras();
       String z = pharmacy.getString("name");
      String y =  pharmacy.getString("age");
       a.setText(z+ ""+y);

    }
}