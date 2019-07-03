package com.example.latihanintent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class login extends AppCompatActivity {
    TextView tvNama;
    Button btnMasuk;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        tvNama = (TextView) findViewById(R.id.tv_nama);
        btnMasuk = (Button) findViewById(R.id.btn_masuk);

        btnMasuk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nama = tvNama.getText().toString();

                boolean isEmptyFields = false;
                if(TextUtils.isEmpty(nama)){
                    isEmptyFields = true;
                    tvNama.setError("Nama tidak boleh kosong");
                }

                if (!isEmptyFields){
                    Intent i = new Intent(login.this, MainActivity.class);
                    i.putExtra(MainActivity.EXTRA_NAME, nama);
                    startActivity(i);
                }
            }
        });
    }
}
