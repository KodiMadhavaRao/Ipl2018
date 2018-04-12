package com.madhav.com.ipl2018.view.activity;

import android.media.Image;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.madhav.com.ipl2018.R;
import com.madhav.com.ipl2018.entity.Commentry;

import java.text.DecimalFormat;
import java.util.Collections;
import java.util.List;

/**
 * Created by madhav on 4/11/2018.
 */

class CommentryAdapter extends RecyclerView.Adapter<CommentryAdapter.CommentryHolder> {
    private CommentryActivity commentryActivity;
    private List<Commentry.Commentaries> mcommentaries;

    public CommentryAdapter(CommentryActivity commentryActivity, List<Commentry.Commentaries> commentaries) {
        this.commentryActivity = commentryActivity;
        this.mcommentaries = commentaries;
    }

    @Override
    public CommentryHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.commentry, parent, false);
        return new CommentryHolder(itemView);
    }
    public void setData(List<Commentry.Commentaries> data){
        this.mcommentaries.addAll(data);
    }
    @Override
    public void onBindViewHolder(CommentryHolder holder, int position) {
        Commentry.Commentaries commentaries = mcommentaries.get(position);
        if (commentaries.getSubtype() != null) {
            if (commentaries.getSubtype().equals("BBCode")) {
                holder.time.setText(commentaries.getTime());
                String bbcode = commentaries.getBbcode();
                if (commentaries.getSpeed() > 0.0) {
                    holder.message.setText(bbcode.replace("%SPEED%", "Speed :"+String.valueOf(  new DecimalFormat("#.##").format(commentaries.getSpeed() * 3.6))));
                    if (commentaries.getBowlerId()!=null){
                        holder.pitch.setVisibility(View.VISIBLE);
                        image(holder.bowler, Integer.parseInt(commentaries.getBowlerId()));
                        image(holder.striker, Integer.parseInt(commentaries.getFacingBatsmanId()));
                        image(holder.nonStriker, Integer.parseInt(commentaries.getNonfacingBatsmanId()));
                    }else {
                        holder.pitch.setVisibility(View.GONE);
                    }
                } else {
                    holder.message.setText(bbcode);
                }

            }

        }


    }

    private void image(ImageView imageView, int id) {
        Glide.with(commentryActivity)
                .load("http://static2.iplt20.com/players/284/" + id + ".png")
                .into(imageView);
    }

    @Override
    public int getItemCount() {
        return mcommentaries.size();
    }

    public class CommentryHolder extends RecyclerView.ViewHolder {

        private final TextView time;
        private final TextView message;
        private final ImageView nonStriker;
        private final ImageView striker;
        private final ImageView bowler;
        private final LinearLayout pitch;

        public CommentryHolder(View itemView) {
            super(itemView);
            pitch = (LinearLayout) itemView.findViewById(R.id.current_pitch);
            time = (TextView) itemView.findViewById(R.id.commentry_time);
            message = (TextView) itemView.findViewById(R.id.commentry_message);

            bowler = (ImageView) itemView.findViewById(R.id.bowler);
            striker = (ImageView) itemView.findViewById(R.id.active_batsman);
            nonStriker = (ImageView) itemView.findViewById(R.id.non_striker_batsman);
        }
    }
}
