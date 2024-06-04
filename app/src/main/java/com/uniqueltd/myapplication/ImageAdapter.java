package com.uniqueltd.myapplication;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ImageAdapter extends RecyclerView.Adapter<ImageAdapter.ImageViewHolder> {

    private int[] imageResources;
    private String[] imageTags;
    private Context context;

    public ImageAdapter(Context context, int[] imageResources, String[] imageTags) {
        this.context = context;
        this.imageResources = imageResources;
        this.imageTags = imageTags;
    }

    @NonNull
    @Override
    public ImageViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_image, parent, false);
        return new ImageViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ImageViewHolder holder, int position) {
        holder.imageView.setImageResource(imageResources[position]);
        holder.imageTag.setText(imageTags[position]);

        View.OnClickListener clickListener = v -> {
            Intent intent = new Intent(context, ImageDetailActivity.class);
            intent.putExtra("imageResource", imageResources[position]);
            context.startActivity(intent);
        };

        holder.imageView.setOnClickListener(clickListener);
        holder.imageTag.setOnClickListener(clickListener);
    }

    @Override
    public int getItemCount() {
        return imageResources.length;
    }

    public static class ImageViewHolder extends RecyclerView.ViewHolder {
        ImageView imageView;
        TextView imageTag;

        public ImageViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.imageView);
            imageTag = itemView.findViewById(R.id.imageTag);
        }
    }
}
