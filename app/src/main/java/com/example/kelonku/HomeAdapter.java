package com.example.kelonku;

import android.media.AudioTrack;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class HomeAdapter extends RecyclerView.Adapter<HomeAdapter.myviewholder>{

    ArrayList<HomeKelonku> listHomeKelonku;

    public HomeAdapter(ArrayList<HomeKelonku> dataholder) {
        this.listHomeKelonku = dataholder;
    }

    @NonNull
    @Override
    public myviewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.home_kelonku,parent,false);
        return new myviewholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull myviewholder holder, int position) {
        holder.bulan.setText(listHomeKelonku.get(position).getBulan());
        holder.pengeluaran.setText(listHomeKelonku.get(position).getPengeluaran());
        holder.pemasukan.setText(listHomeKelonku.get(position).getPemasukan());
    }

    @Override
    public int getItemCount() {
        return listHomeKelonku.size();
    }

    class myviewholder extends RecyclerView.ViewHolder{

        TextView bulan, pengeluaran, pemasukan;
        public myviewholder(@NonNull View view) {
            super(view);
            bulan = view.findViewById(R.id.tview_bulan);
            pengeluaran = view.findViewById(R.id.tview_keluaran);
            pemasukan = view.findViewById(R.id.tview_masukan);
        }
    }
}
