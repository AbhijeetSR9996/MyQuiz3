package com.example.myquiz;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class Main5Activity extends AppCompatActivity {
Button button;
CheckBox checkBox;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);
        button=findViewById( R.id.taketoquiz );
        checkBox=findViewById( R.id.checkBox );

        button.setOnClickListener( new View.OnClickListener() {
            @SuppressLint("SuspiciousIndentation")
            @Override
            public void onClick(View v) {
                if (checkBox.isChecked()) {

                    Intent intent = new Intent( Main5Activity.this, Main9Activity.class );
                    startActivity( intent );
                }
                else
                Toast.makeText( Main5Activity.this, "Please agree to instructions ", Toast.LENGTH_SHORT ).show();
                return;
            }
        } );
        }
    }

