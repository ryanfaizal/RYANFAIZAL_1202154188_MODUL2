package com.example.ryan.ryanfaizal_1202154188_modul2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailMenuMasakan extends AppCompatActivity {
    private TextView x,y,z;
    private ImageView r;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_menu_masakan);

        x = (TextView) findViewById(R.id.namamenu);
        y = (TextView) findViewById(R.id.textView_harga);
        z = (TextView) findViewById(R.id.textView_komposisi);
        r = (ImageView) findViewById(R.id.image_img);

        Intent change = getIntent(); //menggunakan intent untuk mendapatkan nilai
        String menu = change.getStringExtra("judul");
        String harga = change.getStringExtra("harga");
        String komposisi= change.getStringExtra("komposisi");
        Integer pict = change.getIntExtra("gambar",0);

        x.setText(menu);
        y.setText(harga);
        z.setText(komposisi);
        r.setImageResource(pict);
    }
}
