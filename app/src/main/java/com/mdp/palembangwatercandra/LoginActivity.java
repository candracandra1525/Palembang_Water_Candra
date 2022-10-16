package com.mdp.palembangwatercandra;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {


    EditText et_usr, et_pas;
    Button btn_lgn, btn_sgnup;
    ActionBar actionbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        actionbar = getSupportActionBar();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        et_usr = findViewById(R.id.et_fullname2);
        et_pas = findViewById(R.id.et_pass2);

        btn_lgn = findViewById(R.id.btn_login2);
        btn_lgn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String usrname, pass;

                usrname = et_usr.getText().toString();
                pass = et_pas.getText().toString();

                if(usrname.trim().equals(""))
                {
                    et_usr.setError("NPM Tidak Boleh Kosong");
                }
                else if(pass.trim().equals(""))
                {
                    et_pas.setError("Nama Tidak Boleh Kosong");
                }
                else
                {
                    Toast.makeText(LoginActivity.this, "Selamat Anda Berhasil Login", Toast.LENGTH_SHORT).show();
                    onResume();
                }
            }
        });

        btn_sgnup = findViewById(R.id.btn_signup3);
        btn_sgnup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(LoginActivity.this, RegisterActivity.class));
            }
        });
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

    @Override
    protected void onResume() {
        super.onResume();
        et_usr.setText("");
        et_pas.setText("");
    }
}