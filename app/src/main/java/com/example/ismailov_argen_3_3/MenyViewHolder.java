package com.example.ismailov_argen_3_3;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MenyViewHolder extends RecyclerView.ViewHolder {


    private TextView tvMeny;
    public MenyViewHolder(@NonNull View itemView) {
        super(itemView);
        tvMeny = itemView.findViewById(R.id.tv_name);}

    public void onBint(String menyName){
            tvMeny.setText(menyName);
        }
    }


