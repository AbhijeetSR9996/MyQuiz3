package com.example.myquiz;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

//import com.google.firebase.database.DatabaseReference;
//import com.google.firebase.database.FirebaseDatabase;

public class Main3Activity extends AppCompatActivity {
    Button button1,button2,button3;
    EditText email,password;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        button1=findViewById( R.id.login);
        button2=findViewById( R.id.register);
        button3=findViewById( R.id.fp );
        email = findViewById(R.id.email);
        password = findViewById(R.id.password);

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent register_intent = new Intent(getApplicationContext(), Main4Activity.class);
                startActivity(register_intent);

            }
        });

        // Write a message to the database
//        FirebaseDatabase database = FirebaseDatabase.getInstance();
//        DatabaseReference myRef = database.getReference("message");

//        myRef.setValue("Hello, World!");

        button1.setOnClickListener(new View.OnClickListener() {
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
                    Toast.makeText(Main3Activity.this, "Enter less than 25 characters of Email", Toast.LENGTH_SHORT).show();
                    return;
                }
                if (p.length() < 6) {
                    Toast.makeText(
                            Main3Activity.this, " Enter more than 6 characters of password ", Toast.LENGTH_SHORT).show();
                    return;
                }

                Intent login_intent = new Intent(getApplicationContext(),Main5Activity .class);
                startActivity(login_intent);



            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),Main6Activity.class);
                startActivity(intent);
            }
        });


    }

}
