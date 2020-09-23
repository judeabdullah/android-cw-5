package com.example.cw5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final EditText a = findViewById(R.id.age);
        final EditText n = findViewById(R.id.name);
        Button next = findViewById(R.id.nextPage);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String jude = n.getText().toString();
                String abdullah = a.getText().toString();
                Intent x = new Intent(MainActivity.this , MainActivity2.class);
                x.putExtra("name", jude);
                x.putExtra("age", abdullah);



                startActivity(x);

            }
        });

    }
}