package com.example.lab_5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.lab_5.data.MyDbHandler;
import com.example.lab_5.model.register;
import com.example.lab_5.model.register;
import com.example.lab_5.params.params;

public class MainActivity extends AppCompatActivity {
    EditText username,password;
    Button register;
    String usertext,passtext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        register = findViewById(R.id.register);
        username = findViewById(R.id.username);
        password = findViewById(R.id.password);

        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                usertext = username.getText().toString();
                passtext = password.getText().toString();


                register reg = new register();
                reg.setUsername(usertext);
                reg.setPassword(passtext);

                MyDbHandler db = new MyDbHandler(MainActivity.this);
                boolean result = db.addUser(reg);

                if(result)
                {
                    Toast.makeText(getApplicationContext(),"Data inserted", Toast.LENGTH_LONG).show();
                    //db.display();
                }
                else
                {
                    Toast.makeText(getApplicationContext(),"Failed to insert", Toast.LENGTH_LONG).show();
                }

            }
        });

    }
}