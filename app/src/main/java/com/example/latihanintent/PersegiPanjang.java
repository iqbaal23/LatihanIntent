package com.example.latihanintent;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class PersegiPanjang extends AppCompatActivity {
    TextView tvHasil;
    EditText etPanjang, etLebar;
    Button btnHitung;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_persegi_panjang);

        etPanjang = (EditText) findViewById(R.id.et_panjang);
        etLebar = (EditText) findViewById(R.id.et_lebar);
        tvHasil = (TextView) findViewById(R.id.tv_hasil);
        btnHitung = (Button) findViewById(R.id.btn_hitung);

        btnHitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String panjang = etPanjang.getText().toString();
                String lebar = etLebar.getText().toString();

                boolean isEmptyFields = false;
                if(TextUtils.isEmpty(panjang)){
                    isEmptyFields = true;
                    etPanjang.setError("Field ini tidak boleh kosong");
                }

                if (TextUtils.isEmpty(lebar)){
                    isEmptyFields = true;
                    etLebar.setError("Field ini tidak boleh kosong");
                }

                if (!isEmptyFields){
                    double p = Double.parseDouble(panjang);
                    double l = Double.parseDouble(lebar);
                    String hasil = String.valueOf(p*l);

                    tvHasil.setText(hasil);
                }
            }
        });
    }
}
