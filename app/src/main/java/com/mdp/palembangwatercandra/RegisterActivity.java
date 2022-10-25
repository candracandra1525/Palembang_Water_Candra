package com.mdp.palembangwatercandra;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class RegisterActivity extends AppCompatActivity {

    ActionBar actionbar;
    private EditText et_Nama, et_Email, et_Pass, et_KonfirmPass;
    private Spinner sp_Negara;
    private Button btn_Sign;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        actionbar = getSupportActionBar();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        et_Nama = findViewById(R.id.et_fullname);
        sp_Negara = findViewById(R.id.sp_country);
        et_Email = findViewById(R.id.et_email);
        et_Pass = findViewById(R.id.et_pass);
        et_KonfirmPass = findViewById(R.id.et_confirmpass);

        btn_Sign = findViewById(R.id.btn_signup2);
        btn_Sign.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nama, negara, email, pass, konfirmpass;
                nama = et_Nama.getText().toString();
                negara = sp_Negara.getSelectedItem().toString();
                email = et_Email.getText().toString();
                pass = et_Pass.getText().toString();
                konfirmpass = et_KonfirmPass.getText().toString();

                if(nama.isEmpty())
                {
                    et_Nama.setError("Full Name Belum Di isi !");
                    et_Nama.requestFocus();
                }
                else if(email.isEmpty())
                {
                    et_Email.setError("Email Masih Kosong !");
                    et_Email.requestFocus();
                }
                else if(pass.isEmpty())
                {
                    et_Pass.setError("Password Masih Kosong !");
                    et_Pass.requestFocus();
                }
                else if(konfirmpass.isEmpty())
                {
                    et_KonfirmPass.setError("Konfirmasi Password Masih Kosong !");
                    et_KonfirmPass.requestFocus();
                }
                else
                {
                    if(konfirmpass.trim().equals(pass.trim()))
                    {
                        Intent o = new Intent(RegisterActivity.this, ResultActivity.class);
                        o.putExtra("varNama", nama);
                        o.putExtra("varNegara", negara);
                        o.putExtra("varEmail", email);
                        startActivity(o);
                        onResume();
                    }
                    else
                    {
                        et_Pass.setError("Password tidak sama !");
                        et_KonfirmPass.setError("Konfirmasi Password tidak sama !");
                    }
                }
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
        et_Nama.setText("");
        et_Email.setText("");
        et_Pass.setText("");
        et_KonfirmPass.setText("");
    }
}