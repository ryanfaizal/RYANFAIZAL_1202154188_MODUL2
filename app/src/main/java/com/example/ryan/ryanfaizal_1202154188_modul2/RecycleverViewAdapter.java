package com.example.ryan.ryanfaizal_1202154188_modul2;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Ryan on 18/02/2018.
 */

public class RecycleverViewAdapter extends RecyclerView.Adapter<RecycleverViewAdapter.ViewHolder> {

    private ArrayList<String> rclDaftarMenu, rclDaftarHarga;
    private ArrayList<Integer> image;

    public RecycleverViewAdapter(ArrayList<String> daftarMenu, ArrayList<String> daftarHarga, ArrayList<Integer> gambar) {
        //set untuk mendeklarasikan atribut
        rclDaftarMenu = daftarMenu;
        rclDaftarHarga = daftarHarga;
        image = gambar;
    }



    public class ViewHolder extends RecyclerView.ViewHolder {
        public TextView judul;
        public TextView subJudul;
        public ImageView img;
        private RelativeLayout ListMenu;

        private Context context;

        public ViewHolder(View itemView) {
            super(itemView);

            context = itemView.getContext();
            judul = (TextView) itemView.findViewById(R.id.name_menu);
            subJudul = (TextView) itemView.findViewById(R.id.sub_menu);
            img = (ImageView) itemView.findViewById(R.id.pictby);
            ListMenu = itemView.findViewById(R.id.layout_item);

            ListMenu.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent a = new Intent(context,DetailMenuMasakan.class);
                    String bahan = "";
                    switch (getAdapterPosition()){ //menggunakan switch untuk menampilkan list menu

                        case 0 :
                            a.putExtra("judul", rclDaftarMenu.get(getAdapterPosition()));
                            a.putExtra("harga", rclDaftarHarga.get(getAdapterPosition()));
                            a.putExtra("gambar", image.get(getAdapterPosition()));
                            bahan = "Ayam 1 potong, bawang merah, bawang putih, cabai hijau";
                            a.putExtra("komposisi", bahan);
                            context.startActivity(a);
                            break;
                        case 1 :
                            a.putExtra("judul", rclDaftarMenu.get(getAdapterPosition()));
                            a.putExtra("harga", rclDaftarHarga.get(getAdapterPosition()));
                            a.putExtra("gambar", image.get(getAdapterPosition()));
                            bahan = "Nasi, Kecap, cabai, garam, sayur, telur";
                            a.putExtra("komposisi", bahan);
                            context.startActivity(a);
                            break;
                        case 2 :
                            a.putExtra("judul", rclDaftarMenu.get(getAdapterPosition()));
                            a.putExtra("harga", rclDaftarHarga.get(getAdapterPosition()));
                            a.putExtra("gambar", image.get(getAdapterPosition()));
                            bahan = "Mie,Kecap, cabai, garam, sayur, telur, ayam";
                            a.putExtra("komposisi", bahan);
                            context.startActivity(a);
                            break;
                        case 3 :
                            a.putExtra("judul", rclDaftarMenu.get(getAdapterPosition()));
                            a.putExtra("harga", rclDaftarHarga.get(getAdapterPosition()));
                            a.putExtra("gambar", image.get(getAdapterPosition()));
                            bahan = "Mie,Kecap, cabai,kaldu ayam, garam, sayur, telur";
                            a.putExtra("komposisi", bahan);
                            context.startActivity(a);
                            break;
                        case 4 :
                            a.putExtra("judul", rclDaftarMenu.get(getAdapterPosition()));
                            a.putExtra("harga", rclDaftarHarga.get(getAdapterPosition()));
                            a.putExtra("gambar", image.get(getAdapterPosition()));
                            bahan = "Daging kambing, kecap manis, tomat, bawang merah, cabai";
                            a.putExtra("komposisi", bahan);
                            context.startActivity(a);
                            break;
                        case 5 :
                            a.putExtra("judul", rclDaftarMenu.get(getAdapterPosition()));
                            a.putExtra("harga", rclDaftarHarga.get(getAdapterPosition()));
                            a.putExtra("gambar", image.get(getAdapterPosition()));
                            bahan = "Bumbu kacang, sayur kangkung, cabai, taoge";
                            a.putExtra("komposisi", bahan);
                            context.startActivity(a);
                            break;
                        case 6 :
                            a.putExtra("judul", rclDaftarMenu.get(getAdapterPosition()));
                            a.putExtra("harga", rclDaftarHarga.get(getAdapterPosition()));
                            a.putExtra("gambar", image.get(getAdapterPosition()));
                            bahan = "Mie keriting, Kecap manis, bumbu penyedap rasa";
                            a.putExtra("komposisi", bahan);
                            context.startActivity(a);
                            break;
                        case 7 :
                            a.putExtra("judul", rclDaftarMenu.get(getAdapterPosition()));
                            a.putExtra("harga", rclDaftarHarga.get(getAdapterPosition()));
                            a.putExtra("gambar", image.get(getAdapterPosition()));
                            bahan = "Nasi,Kecap Asin, cabai, garam, sayur, telur";
                            a.putExtra("komposisi", bahan);
                            context.startActivity(a);
                            break;
                        case 8 :
                            a.putExtra("judul", rclDaftarMenu.get(getAdapterPosition()));
                            a.putExtra("harga", rclDaftarHarga.get(getAdapterPosition()));
                            a.putExtra("gambar", image.get(getAdapterPosition()));
                            bahan = "Ayam suir,Kecap, cabai, garam, sayur, telur, kaldu ayam";
                            a.putExtra("komposisi", bahan);
                            context.startActivity(a);
                            break;

                    }
                }
            });
        }

    }
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_menu, parent, false);

        // mengatur ukuran view, margin, padding, dan parameter layout lainnya
        ViewHolder vh = new ViewHolder(v);
        return vh;
    }


    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        final String name = rclDaftarMenu.get(position);
        final String harga = rclDaftarHarga.get(position);
        final Integer test = image.get(position);
        holder.judul.setText(name);
        holder.subJudul.setText(harga);
        holder.img.setImageResource(test);
    }

    @Override
    public int getItemCount() {
        return rclDaftarMenu.size();
    }
}
