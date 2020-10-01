package com.example.recyclerview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;
import java.util.Map;

public class MovieAdapter extends RecyclerView.Adapter<MovieAdapter.ViewHolder> {

    List<Movie> mArrayMovie;

    public MovieAdapter(List<Movie> mArrayMovie) {
        this.mArrayMovie = mArrayMovie;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.layout_items_movie, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Movie movie = mArrayMovie.get(position);
        holder.imgMovie.setImageResource(movie.getImage());
        holder.tvQualify.setText(movie.getQualify());
        holder.tvDetail.setText(movie.getName());
    }

    @Override
    public int getItemCount() {
        return mArrayMovie == null ? 0 : mArrayMovie.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder{

        ImageView imgMovie;
        TextView tvDetail,tvQualify;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imgMovie = itemView.findViewById(R.id.bigfoot);
            tvDetail = itemView.findViewById(R.id.detail);
            tvQualify = itemView.findViewById(R.id.quality);
        }
    }
}
