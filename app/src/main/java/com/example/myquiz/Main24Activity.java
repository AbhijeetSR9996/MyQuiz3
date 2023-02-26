package com.example.myquiz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;

public class Main24Activity extends AppCompatActivity {
    Button button1,reset;
    RadioButton radioButton1,radioButton2,radioButton3,radioButton4;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main24 );
        button1=findViewById( R.id.submitq16 );
        radioButton1=findViewById( R.id.radioButton1 );
        radioButton2=findViewById( R.id.radioButton2 );
        radioButton3=findViewById( R.id.radioButton3 );
        radioButton4=findViewById( R.id.radioButton4 );


        button1.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent( Main24Activity.this,Main25Activity.class );
                startActivity( intent );
            }
        } );
        reset.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                radioButton1.setChecked(false);
                radioButton2.setChecked(false);
                radioButton3.setChecked(false);
                radioButton4.setChecked(false);
            }
        } );
    }
}
