package com.madhav.com.ipl2018.view.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.madhav.com.ipl2018.R;
import com.madhav.com.ipl2018.entity.VideoThumb;
import com.madhav.com.ipl2018.view.activity.VideoActivity;
import com.squareup.picasso.Picasso;

/**
 * Created by madhav on 4/9/2018.
 */

public class VideoAdapter extends RecyclerView.Adapter<VideoAdapter.VideoHolder> {

    private final VideoActivity videoActivity;
    private final VideoThumb videoThumb;
    private VideoListener onItemClickListener;

    public VideoAdapter(VideoActivity videoActivity, VideoThumb videoThumb) {
        this.videoActivity = videoActivity;
        this.videoThumb = videoThumb;
//        5768519245001
//        5768474695001     5768474695001
    }


    @Override
    public VideoAdapter.VideoHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.video_view, parent, false);
        return new VideoHolder(itemView);
    }

    @Override
    public void onBindViewHolder(VideoAdapter.VideoHolder holder, int position) {
        Picasso.get().load(videoThumb.getContent().get(position).getThumbnail().getVariants().get(10).getUrl()).into(holder.thumb);
        holder.duration.setText(convertSeconds(videoThumb.getContent().get(position).getDuration()));
        holder.title.setText(videoThumb.getContent().get(position).getTitle());
        holder.details.setText("" + videoThumb.getContent().get(position).getDate());
        holder.noOfViews.setText(videoThumb.getContent().get(position).getViews() + " Views");
    }

    @Override
    public int getItemCount() {
        return videoThumb.getContent().size();
    }

    public String convertSeconds(int seconds) {
        int h = seconds / 3600;
        int m = (seconds % 3600) / 60;
        int s = seconds % 60;
        String sh = (h > 0 ? String.valueOf(h) + " " + "h" : "");
        String sm = (m < 10 && m > 0 && h > 0 ? "0" : "") + (m > 0 ? (h > 0 && s == 0 ? String.valueOf(m) : String.valueOf(m) + " " + "min") : "");
        String ss = (s == 0 && (h > 0 || m > 0) ? "" : (s < 10 && (h > 0 || m > 0) ? "0" : "") + String.valueOf(s) + " " + "sec");
        return sh + (h > 0 ? " " : "") + sm + (m > 0 ? " " : "") + ss;
    }

    public void setOnItemClickListener(VideoListener onItemClickListener) {
        this.onItemClickListener = onItemClickListener;
    }

    public interface VideoListener {
        public void onVideoItemClickListener(View view, int iPosition, String iVideoId);
    }

    public class VideoHolder extends RecyclerView.ViewHolder {

        private final ImageView thumb;
        private final TextView duration;
        private final TextView title;
        private final TextView details;
        private final TextView noOfViews;

        public VideoHolder(View itemView) {
            super(itemView);
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    onItemClickListener.onVideoItemClickListener(v, getAdapterPosition(), videoThumb.getContent().get(getAdapterPosition()).getMediaId());
                }
            });
            thumb = (ImageView) itemView.findViewById(R.id.itemThumbnailView);
            duration = (TextView) itemView.findViewById(R.id.itemDurationView);
            title = (TextView) itemView.findViewById(R.id.itemVideoTitleView);
            details = (TextView) itemView.findViewById(R.id.itemUploaderView);
            noOfViews = (TextView) itemView.findViewById(R.id.itemviews);
        }
    }
}
