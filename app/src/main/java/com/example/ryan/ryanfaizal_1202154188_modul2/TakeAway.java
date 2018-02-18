package com.example.ryan.ryanfaizal_1202154188_modul2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class TakeAway extends AppCompatActivity {
    //set untuk mendeklarasikan atribut btnpesanan
    Button btnpesanan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_take_away);

        btnpesanan = (Button) findViewById(R.id.btnpilihpesanan);
        //menampilkan toast di TakeAway.Java
     Toast.makeText(getApplicationContext(), "TAKE AWAY",Toast.LENGTH_LONG).show();

       btnpesanan.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               Intent intent = new Intent(TakeAway.this, com.example.ryan.ryanfaizal_1202154188_modul2.Menu.class);//menghubungkan activity take away ke Menu.jav
               startActivity(intent);

           }
       });

    }
}
