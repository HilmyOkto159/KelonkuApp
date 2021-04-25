package com.example.kelonku;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private HomeAdapter homeAdapter;
    private ArrayList<HomeKelonku> homeKelonkuArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getData();

        recyclerView = findViewById(R.id.recycleview);
        homeAdapter = new HomeAdapter(homeKelonkuArrayList);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(MainActivity.this);

        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(homeAdapter);


    }

    public void getData(){
        homeKelonkuArrayList = new ArrayList<>();
        homeKelonkuArrayList.add(new HomeKelonku("Coba", "Dulu", "Deh"));
        homeKelonkuArrayList.add(new HomeKelonku("Cobain", "D", "Dah"));
        homeKelonkuArrayList.add(new HomeKelonku("Coban", "Dlu", "Dih"));
        homeKelonkuArrayList.add(new HomeKelonku("Cobayuk", "ulu", "Doh"));
        homeKelonkuArrayList.add(new HomeKelonku("Cobakuy", "lu", "Dem"));
        homeKelonkuArrayList.add(new HomeKelonku("Cobalah", "Du", "Desd"));
        homeKelonkuArrayList.add(new HomeKelonku("Cobanih", "Dl", "Dehr"));
        homeKelonkuArrayList.add(new HomeKelonku("Cobayuk", "ulu", "Doh"));
        homeKelonkuArrayList.add(new HomeKelonku("Cobakuy", "lu", "Dem"));
        homeKelonkuArrayList.add(new HomeKelonku("Cobalah", "Du", "Desd"));
        homeKelonkuArrayList.add(new HomeKelonku("Cobanih", "Dl", "Dehr"));
        homeKelonkuArrayList.add(new HomeKelonku("Cobayuk", "ulu", "Doh"));
        homeKelonkuArrayList.add(new HomeKelonku("Cobakuy", "lu", "Dem"));
        homeKelonkuArrayList.add(new HomeKelonku("Cobalah", "Du", "Desd"));
        homeKelonkuArrayList.add(new HomeKelonku("Cobanih", "Dl", "Dehr"));
    }
}