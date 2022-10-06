package com.mdp.palembangwatercandra;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button Btn_SignUp, Btn_Login, Btn_Palembang;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Btn_SignUp = findViewById(R.id.btn_signup);
        Btn_SignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, RegisterActivity.class);
                startActivity(intent);
            }
        });


        Btn_Login = findViewById(R.id.btn_login);
        Btn_Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, LoginActivity.class);
                startActivity(intent);
            }
        });

        Btn_Palembang = findViewById(R.id.btn_palembangid);
        Btn_Palembang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent bukaWebsite = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.palembang.go.id/"));

                try {
                    startActivity(bukaWebsite);
                }
                catch (Exception e) {
                    Toast.makeText(MainActivity.this, "Ada Kesalahan Teks Dalam Membuka Website", Toast.LENGTH_SHORT).show();

                }
            }
        });



    }
}