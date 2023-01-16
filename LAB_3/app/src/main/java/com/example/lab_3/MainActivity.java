package com.example.lab_3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {

    Button button1,button2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button1 = findViewById(R.id.button1);
        button2 = findViewById(R.id.button2);



        loadFrag(new fragment_1(),0);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                loadFrag(new fragment_1(),1);

            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                loadFrag(new fragment_2(),1);
            }
        });



    }

    public void loadFrag(Fragment fragment, int flag)
    {
        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        if(flag==0)
            ft.add(R.id.container,fragment);
        else
            ft.replace(R.id.container,fragment);
        ft.commit();
    }
}