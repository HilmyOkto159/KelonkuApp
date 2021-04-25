package com.example.kelonku;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class HomeAdapter extends RecyclerView.Adapter<HomeAdapter.HomeViewHolder> {

    private ArrayList<HomeKelonku> listHomeKelonku;

    public HomeAdapter(ArrayList<HomeKelonku> listHomeKelonku) {
        this.listHomeKelonku = listHomeKelonku;
    }

    @NonNull
    @Override
    public HomeAdapter.HomeViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.home_kelonku, parent, false);
        return new HomeViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull HomeAdapter.HomeViewHolder holder, int position) {
        holder.tviewJudul.setText(listHomeKelonku.get(position).getJudul());
        holder.tviewJan.setText(listHomeKelonku.get(position).getJan());
        holder.tviewFeb.setText(listHomeKelonku.get(position).getFeb());
    }

    @Override
    public int getItemCount() {
        return (listHomeKelonku != null) ? listHomeKelonku.size(): 0;
    }

    public class HomeViewHolder extends RecyclerView.ViewHolder{

        private TextView tviewJudul, tviewJan, tviewFeb;
        public HomeViewHolder(View view){
            super(view);

            tviewJudul = view.findViewById(R.id.tview_judul);
            tviewJan = view.findViewById(R.id.tview_jan);
            tviewFeb = view.findViewById(R.id.tview_feb);

        }
    }
}
