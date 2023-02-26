package com.example.myquiz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Main6Activity extends AppCompatActivity {
    Button button;
    EditText enternumber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main6 );
        button = findViewById( R.id.continuetoreset );
        enternumber = findViewById( R.id.phone );


        button.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String number = enternumber.getText().toString();

                if (enternumber.length() != 10) {
                    Toast.makeText( Main6Activity.this, "Mobile Number is invalid", Toast.LENGTH_LONG ).show();
                    return;
                }

                Intent intent = new Intent( Main6Activity.this, Main8Activity.class );
                startActivity( intent );
            }

        } );
    }
}


