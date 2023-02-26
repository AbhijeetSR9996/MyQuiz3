package com.example.myquiz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Main4Activity extends AppCompatActivity {
   Button button;
   EditText name,email,password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        name = findViewById(R.id.name);
        email=findViewById( R.id.email );
        password=findViewById( R.id.password );
        button=findViewById( R.id.submit);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String n = name.getText().toString();
                String e = email.getText().toString();
                String p = password.getText().toString();


                if (TextUtils.isEmpty(n)) {
                    Toast.makeText(Main4Activity.this, "Enter your name", Toast.LENGTH_SHORT).show();
                    return;
                }
                if (e.isEmpty()){
                    email.setError("Email is required");
                    return;
                }
                if (p.isEmpty()){
                    password.setError("Password is required");
                    return;
                }
                if (e.length() > 25) {
                    Toast.makeText(Main4Activity.this, "Enter less than 25 characters of Email", Toast.LENGTH_SHORT).show();
                    return;
                }
                if (p.length() < 6) {
                    Toast.makeText(
                            Main4Activity.this, " Enter more than 6 characters of password ", Toast.LENGTH_SHORT).show();
                    return;
                }
                Intent intent = new Intent(Main4Activity.this, Main3Activity.class);
                startActivity(intent);

            }
        });
    }
}
