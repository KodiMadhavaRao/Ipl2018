package com.madhav.com.ipl2018.view.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.madhav.com.ipl2018.R;
import com.madhav.com.ipl2018.entity.ImagesOfMatch;
import com.madhav.com.ipl2018.view.activity.ImagesActivity;

/**
 * Created by madhav on 4/13/2018.
 */

public class ImagesAdapter extends RecyclerView.Adapter<ImagesAdapter.ImagesHolder> {
    private final ImagesActivity imagesActivity;
    private final ImagesOfMatch body;

    public ImagesAdapter(ImagesActivity imagesActivity, ImagesOfMatch body) {
        this.imagesActivity = imagesActivity;
        this.body = body;
    }

    @Override
    public ImagesHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View layoutView = LayoutInflater.from(parent.getContext()).inflate(R.layout.images_item, null);
        return new ImagesHolder(layoutView);
    }

    @Override
    public void onBindViewHolder(ImagesHolder holder, int position) {
        Glide.with(imagesActivity)
                .load(body.getContent().get(position).getImageUrl())
                .into(holder.images);
    }

    @Override
    public int getItemCount() {
        return body.getContent().size();
    }

    public class ImagesHolder extends RecyclerView.ViewHolder {

        private final ImageView images;

        public ImagesHolder(View itemView) {
            super(itemView);
            images = (ImageView) itemView.findViewById(R.id.match_photo);
        }
    }
}
