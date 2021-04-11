package com.example.football;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class FootballAdapter extends RecyclerView.Adapter<FootballAdapter.ViewHolder> {
    public FootballAdapter(Context context) {
        this.context = context;
    }

    @NonNull
    @Override
    public FootballAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View itemrow = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_football,viewGroup,false);
        return new ViewHolder(itemrow);
    }

    @Override
    public void onBindViewHolder(@NonNull FootballAdapter.ViewHolder viewHolder, int i) {
        Glide.with(context).load(getFootballModels().get(i).getLambangTim()).into(viewHolder.ivLambangTeam);
        viewHolder.tvNamaTeam.setText(getFootballModels().get(i).getNamaTim());

    }

    @Override
    public int getItemCount() {
        return getFootballModels().size();
    }

    public ArrayList<FootballModel> getFootballModels() {
        return footballModels;
    }

    public void setFootballModels(ArrayList<FootballModel> footballModels) {
        this.footballModels = footballModels;
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        private ImageView ivLambangTeam;
        private TextView tvNamaTeam;
        public ViewHolder( View itemView){
            super(itemView);
            ivLambangTeam = itemView.findViewById(R.id.iv_lambang_team);
            tvNamaTeam = itemView.findViewById(R.id.tv_nama_team);
        }
    }
    private Context context;
    private ArrayList<FootballModel> footballModels;

}
