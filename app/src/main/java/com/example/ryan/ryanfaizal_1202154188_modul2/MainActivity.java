package com.example.ryan.ryanfaizal_1202154188_modul2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView pilihmenu;
    RadioButton take, dine;
    Button btnpesanan;
    RadioGroup radiogroup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        pilihmenu = (TextView) findViewById(R.id.pilihmenu);
        take = (RadioButton) findViewById(R.id.radio_take);
        dine = (RadioButton) findViewById(R.id.radio_dine);
        btnpesanan = (Button) findViewById(R.id.button);
        radiogroup = (RadioGroup) findViewById(R.id.radioGroup);

        Toast.makeText(getApplicationContext(), "Selamat Datang RYAN_1202154188",Toast.LENGTH_LONG).show(); //menampilkan toast di MainActivity

        btnpesanan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int selectedId = radiogroup.getCheckedRadioButtonId();
                if (selectedId == take.getId()){
                    Intent intent = new Intent(MainActivity.this, TakeAway.class ); //menghubungkan activity main ke take away
                    startActivity(intent);

                }if (selectedId == dine.getId()){
                    Intent intent = new Intent(MainActivity.this, DineIn.class); //menghubungkan activity main ke DineIn
                    startActivity(intent); //memulai intent
                    Toast.makeText(getApplicationContext(), "DINE IN",Toast.LENGTH_LONG).show(); //menampilakan toast ke DineIn.Java
                }
            }
        });
    }


}
