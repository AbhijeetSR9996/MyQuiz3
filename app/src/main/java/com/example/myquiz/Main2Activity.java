package com.example.myquiz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {
    Button button;
    EditText email,password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main2 );
        button=findViewById( R.id.adminlogin );
        email = findViewById(R.id.email);
        password = findViewById(R.id.password);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String e = email.getText().toString();
                String p = password.getText().toString();

                if (e.isEmpty()){
                    email.setError("Email is required");
                    return;
                }
                if (p.isEmpty()){
                    password.setError("Password is required");
                    return;
                }
                if (e.length() > 25) {
                    Toast.makeText(Main2Activity.this, "Enter less than 25 characters of Email", Toast.LENGTH_SHORT).show();
                    return;
                }
                if (p.length() < 6) {
                    Toast.makeText(
                            Main2Activity.this, " Enter more than 6 characters of password ", Toast.LENGTH_SHORT).show();
                    return;
                }

                Intent login_intent = new Intent(getApplicationContext(),Main7Activity.class);
                startActivity(login_intent);


            }
        });

    }
}