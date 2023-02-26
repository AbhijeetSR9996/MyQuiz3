package com.example.myquiz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Main8Activity extends AppCompatActivity {
Button button;
    EditText password;
    EditText confirmpassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main8 );
        button=findViewById( R.id.create );
        password = findViewById(R.id.password);
        confirmpassword = findViewById(R.id.cpassword);

        button.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String pass = password.getText().toString();
                String cpass = confirmpassword.getText().toString();


                if (pass.isEmpty()) {
                    password.setError("Password is required to be changed ");
                    return;
                }
                if (cpass.isEmpty()) {
                    confirmpassword.setError("Confirmation of password is also required");
                    return;
                }
                if (pass.length() < 6) {
                    Toast.makeText(

                            Main8Activity.this, " Enter more than 6 characters for setting a new password ", Toast.LENGTH_SHORT).show();
                    return;
                }
                if (cpass.length() < 6) {
                    Toast.makeText(

                            Main8Activity.this, " Enter more than 6 characters of password also for confirmation ", Toast.LENGTH_SHORT).show();
                    return;
                }
                if (!pass.equals(cpass))
                {
                    Toast.makeText(Main8Activity.this, "Password do not match", Toast.LENGTH_SHORT).show();
                    return;
                }

                Intent intent = new Intent( Main8Activity.this,Main3Activity.class );
                startActivity( intent );
            }
        } );
    }
}
