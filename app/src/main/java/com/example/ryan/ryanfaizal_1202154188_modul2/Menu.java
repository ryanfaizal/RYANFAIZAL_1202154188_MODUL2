package com.example.ryan.ryanfaizal_1202154188_modul2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class Menu extends AppCompatActivity {
    private RecyclerView rclView;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;
    private ArrayList<String> daftarMenu;
    private ArrayList<String> daftarHarga;
    private ArrayList<Integer> gambar;
    private TextView a, b;

    private ImageView image;
    //Set Daftar Judul
    private String[] Menu = {"Ayam Goreng Sambel Ijo", "Nasi Goreng", "Mie Goreng Spesial", "Mie Rebus", "Sate Kambing", "Nasi Pecel", "Mie Kuah Jawa", "Nasi Goreng Jawa", "Soto Ayam"};
    //Set Daftar Harga
    private String[] Harga = {"Rp.20000","Rp.15000", "Rp.12000", "Rp.12000", "Rp.45000", "Rp.8000", "Rp.15000", "Rp.15000", "Rp.13000"};

    // Set Daftar Gambar
    private int[] Gambar = {R.drawable.ayam, R.drawable.nasgor, R.drawable.miegoreng, R.drawable.miekuah, R.drawable.satemadura, R.drawable.pecel, R.drawable.miejawa, R.drawable.nasgorjawa, R.drawable.soto};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        daftarMenu = new ArrayList<>();
        daftarHarga = new ArrayList<>();
        gambar = new ArrayList<>();
        DaftarItem();

        rclView = (RecyclerView) findViewById(R.id.Rview);
        rclView.setHasFixedSize(true);

        layoutManager = new LinearLayoutManager(this);
        rclView.setLayoutManager(layoutManager);

        adapter = new RecycleverViewAdapter(daftarMenu, daftarHarga, gambar) ;
        rclView.setAdapter(adapter);

    }

    private void DaftarItem() {
        for (int w = 0; w < Menu.length; w++) {
            daftarMenu.add(Menu[w]);
            daftarHarga.add(Harga[w]);
            gambar.add(Gambar[w]);
        }
    }
}
