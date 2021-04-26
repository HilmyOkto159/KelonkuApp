package com.example.kelonku;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link FragmentKelonku#newInstance} factory method to
 * create an instance of this fragment.
 */
public class FragmentKelonku extends Fragment {

    private TextView textView;

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;
    RecyclerView recyclerView;
    ArrayList<HomeKelonku> listHomeKelonku;

    public FragmentKelonku() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment FragmentKelonku.
     */
    // TODO: Rename and change types and number of parameters
    public static FragmentKelonku newInstance(String param1, String param2) {
        FragmentKelonku fragment = new FragmentKelonku();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_kelonku, container, false);

        //komponen

        recyclerView = view.findViewById(R.id.recycleview);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        listHomeKelonku = new ArrayList<>();

        HomeKelonku bulan1 = new HomeKelonku("Januari", "Pengeluaran: ", "Pemasukan: " );
        listHomeKelonku.add(bulan1);
        HomeKelonku bulan2 = new HomeKelonku("Februari", "Pengeluaran: ", "Pemasukan: " );
        listHomeKelonku.add(bulan2);
        HomeKelonku bulan3 = new HomeKelonku("Maret", "Pengeluaran: ", "Pemasukan: " );
        listHomeKelonku.add(bulan3);
        HomeKelonku bulan4 = new HomeKelonku("April", "Pengeluaran: ", "Pemasukan: " );
        listHomeKelonku.add(bulan4);
        HomeKelonku bulan5 = new HomeKelonku("Mei", "Pengeluaran: ", "Pemasukan: " );
        listHomeKelonku.add(bulan5);
        HomeKelonku bulan6 = new HomeKelonku("Juni", "Pengeluaran: ", "Pemasukan: " );
        listHomeKelonku.add(bulan6);
        HomeKelonku bulan7 = new HomeKelonku("July", "Pengeluaran: ", "Pemasukan: " );
        listHomeKelonku.add(bulan7);
        HomeKelonku bulan8 = new HomeKelonku("Agustus", "Pengeluaran: ", "Pemasukan: " );
        listHomeKelonku.add(bulan8);
        HomeKelonku bulan9 = new HomeKelonku("September", "Pengeluaran: ", "Pemasukan: " );
        listHomeKelonku.add(bulan9);
        HomeKelonku bulan10 = new HomeKelonku("Oktober", "Pengeluaran: ", "Pemasukan: " );
        listHomeKelonku.add(bulan10);
        HomeKelonku bulan11 = new HomeKelonku("November", "Pengeluaran: ", "Pemasukan: " );
        listHomeKelonku.add(bulan11);
        HomeKelonku bulan12 = new HomeKelonku("Desember", "Pengeluaran: ", "Pemasukan: " );
        listHomeKelonku.add(bulan12);

        recyclerView.setAdapter(new HomeAdapter(listHomeKelonku));


        return view;
    }
}