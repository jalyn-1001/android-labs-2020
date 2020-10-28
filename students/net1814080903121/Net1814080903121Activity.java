package edu.hzuapps.androidlabs.net1814080903121;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Net1814080903121Activity extends AppCompatActivity {

    Button btn1,btn3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1=findViewById(R.id.button1);
        btn3=findViewById(R.id.button3);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1=new Intent(Net1814080903121Activity.this,AddActivity.class);
                startActivity(intent1);
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent3=new Intent(Net1814080903121Activity.this,ShownameActivity.class);
                startActivity(intent3);
            }
        });


    }
}

