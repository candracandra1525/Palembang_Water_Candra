package com.mdp.palembangwatercandra;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class RegisterActivity extends AppCompatActivity {

    ActionBar actionbar;
    private TextView tv_Nama, tv_Negara, tv_Email;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        actionbar = getSupportActionBar();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        tv_Nama = findViewById(R.id.tv_nama);
        tv_Negara = findViewById(R.id.tv_negara);
        tv_Email = findViewById(R.id.tv_email);

        Intent intent = getIntent();
        tv_Nama.setText(intent.getStringExtra("varNama"));
        tv_Negara.setText(intent.getStringExtra("varNegara"));
        tv_Email.setText(intent.getStringExtra("varEmail"));

    }

    @Override
    public boolean onSupportNavigateUp()
    {
        onBackPressed();
        return true;
    }

    @Override
    public void onBackPressed()
    {
        super.onBackPressed();
    }
}