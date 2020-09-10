package com.fadillf.android_customlist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText etBilangan1;
    private EditText etBilangan2;
    private EditText etHasil;
    private Button btnHitung;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initUI();
        initEvent();
    }

    private void initUI(){
        etBilangan1 = (EditText) findViewById(R.id.et_bilangan1);
        etBilangan2 = (EditText) findViewById(R.id.et_bilangan2);
        etHasil = (EditText) findViewById(R.id.et_hasil);
        btnHitung = (Button) findViewById(R.id.btn_hitung);
    }

    private void initEvent(){
        btnHitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                hitungJumlah();
            }
        });
    }

    private void hitungJumlah(){
        int bil1 = Integer.parseInt(etBilangan1.getText().toString());
        int bil2 = Integer.parseInt(etBilangan2.getText().toString());
        int total = bil1 + bil2;
        etHasil.setText(total + "");
    }

}