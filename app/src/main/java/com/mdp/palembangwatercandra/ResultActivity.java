package com.mdp.palembangwatercandra;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ResultActivity extends AppCompatActivity {

    private TextView tv_Nama, tv_negara, tv_email;
    private Button btn_lgout;

    ActionBar ac;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        ac = getSupportActionBar();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        tv_Nama = findViewById(R.id.tv_nama);
        tv_email = findViewById(R.id.tv_email);
        tv_negara = findViewById(R.id.tv_negara);

        Intent r = getIntent();
        tv_Nama.setText(r.getStringExtra("varNama"));
        tv_email.setText(r.getStringExtra("varEmail"));
        tv_negara.setText(r.getStringExtra("varNegara"));

        btn_lgout = findViewById(R.id.btn_logout);
        btn_lgout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent c = new Intent(ResultActivity.this, MainActivity.class);
                startActivity(c);
            }
        });


    }
}