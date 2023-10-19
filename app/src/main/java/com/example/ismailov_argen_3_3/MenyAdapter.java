package com.example.ismailov_argen_3_3;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MenyAdapter extends RecyclerView.Adapter<MenyViewHolder> {
    public MenyAdapter(ArrayList<String> menyNameList) {
        MenyNameList = menyNameList;
    }

    private ArrayList<String> MenyNameList;



    @NonNull
    @Override
    public MenyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new MenyViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_contact,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull MenyViewHolder holder, int position) {
holder.onBint(MenyNameList.get(position));
    }

    @Override
    public int getItemCount() {
        return MenyNameList.size();
    }
}
