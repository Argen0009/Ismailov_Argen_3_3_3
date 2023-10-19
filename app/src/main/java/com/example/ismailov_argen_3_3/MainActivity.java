package com.example.ismailov_argen_3_3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ArrayList<String> menyNameList = new ArrayList<>();
    private RecyclerView rvMeny;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        loadData();
    }

    private void loadData() {
        menyNameList.add("SUPREME");
        menyNameList.add("SUPER SUPREME");
        menyNameList.add("CHEESE LOVER'R");
        menyNameList.add("VEGGIE LOVER'R");
        menyNameList.add("MEAT LOVER'R");
        menyNameList.add("PEPPERONI LOVER'R");
        menyNameList.add("HAWAIIAN");
        menyNameList.add("BBQ CHICKEN");
        menyNameList.add("CHICKEN SUPREME");
        menyNameList.add("P-ZONE");
        menyNameList.add("TOPPINGS");


        menyNameList.add("SUPREME");
        menyNameList.add("SUPER SUPREME");
        menyNameList.add("CHEESE LOVER'R");
        menyNameList.add("VEGGIE LOVER'R");
        menyNameList.add("MEAT LOVER'R");
        menyNameList.add("PEPPERONI LOVER'R");
        menyNameList.add("HAWAIIAN");
        menyNameList.add("BBQ CHICKEN");
        menyNameList.add("CHICKEN SUPREME");
        menyNameList.add("P-ZONE");
        menyNameList.add("TOPPINGS");
        initAdapter();
    }

    private void initAdapter() {
        MenyAdapter adapter = new MenyAdapter(menyNameList);
        rvMeny.setAdapter(adapter);
    }


    private void initView() {
        rvMeny = findViewById(R.id.tv_meny);

    }
}