package com.example.cookingapp;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import com.example.cookingapp.login_register.login_fragment;
import com.example.cookingapp.login_register.register;

public class MainActivity extends AppCompatActivity {
    Button btn_login;
    Button btn_register;
    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        btn_login = findViewById(R.id.button_login);
        btn_register = findViewById(R.id.button_register);

        btn_login.setOnClickListener(new View.OnClickListener() {

             @Override
             public void onClick(View view) {
                 btn_login.setVisibility(View.GONE);
             Fragment fragment = new login_fragment();
             FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
              fragmentTransaction.replace(R.id.main,fragment).commit();
             }
        }

        );
        btn_register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btn_register.setVisibility(View.GONE);
                Fragment fragment = new register();
                FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.main,fragment).commit();
            }
        });
    }

}
