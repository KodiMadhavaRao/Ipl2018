package com.madhav.com.ipl2018.view.adapter;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import com.madhav.com.ipl2018.R;
import com.madhav.com.ipl2018.entity.Matches;
import com.madhav.com.ipl2018.entity.model.MatchFlags;

/**
 * Created by madhav on 4/6/2018.
 */

public class MatchesAdapter extends RecyclerView.Adapter<MatchesAdapter.MatchHolder> {
    private final Context mainActivity;
    private List<MatchFlags> matchFlags;
    private ItemClickListener onRecyclerItemClickListener;

    public MatchesAdapter(Context mainActivity, List<MatchFlags> matches) {
        this.mainActivity = mainActivity;
        this.matchFlags = matches;
    }

    public void setOnRecyclerItemClickListener(ItemClickListener onRecyclerItemClickListener) {

        this.onRecyclerItemClickListener = onRecyclerItemClickListener;
    }

    @Override
    public MatchHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.individual_match, parent, false);
        return new MatchHolder(itemView);
    }

    @Override
    public void onBindViewHolder(MatchHolder holder, int position) {
        Matches.ScheduleBean scheduleBeans = matchFlags.get(position).getScheduleBeans();
        if (matchFlags.get(position).isCurrentDate()) {
            holder.itemView.setBackgroundDrawable(getStrokeDrawable());
        }
        holder.matchNo.setText(scheduleBeans.getDescription());
        String teamOne = scheduleBeans.getTeam1().getTeam().getFullName();
        String teamTwo = scheduleBeans.getTeam2().getTeam().getFullName();
        setTeamImages(teamOne, holder.teamOneImage);
        setTeamImages(teamTwo, holder.teamTwoImage);
        holder.teamOne.setText(teamOne);
        holder.teamTwo.setText(teamTwo);
        holder.venue.setText(scheduleBeans.getVenue().getFullName());
        holder.matchTime.setText(scheduleBeans.getMatchDate());
    }

    private void setTeamImages(String teamOne, ImageView teamOneImage) {
        int drawableRes = 0;
        switch (teamOne) {
            case "Chennai Super Kings":
                drawableRes = R.drawable.badge_csk;
                break;
            case "Delhi Daredevils":
                drawableRes = R.drawable.badge_dd;
                break;
            case "Kings XI Punjab":
                drawableRes = R.drawable.badge_kxip;
                break;
            case "Kolkata Knight Riders":
                drawableRes = R.drawable.badge_kkr;
                break;
            case "Mumbai Indians":
                drawableRes = R.drawable.badge_mi;
                break;
            case "Rajasthan Royals":
                drawableRes = R.drawable.badge_rr;
                break;
            case "Royal Challengers Bangalore":
                drawableRes = R.drawable.badge_rcb;
                break;
            case "Sunrisers Hyderabad":
                drawableRes = R.drawable.badge_srh;
                break;
        }
        teamOneImage.setImageResource(drawableRes);
    }


    @Override
    public int getItemCount() {
        return matchFlags.size();
    }


    public GradientDrawable getStrokeDrawable() {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(Color.WHITE);
        gradientDrawable.setCornerRadius(8);
        gradientDrawable.setStroke(2, mainActivity.getResources().getColor(R.color.lt_red));
        return gradientDrawable;
    }

    public interface ItemClickListener {
        void onItemClick(View view, int position);
    }

    public class MatchHolder extends RecyclerView.ViewHolder {

        private final TextView matchNo;
        private final TextView teamOne;
        private final TextView teamTwo;
        private final TextView venue;
        private final TextView matchTime;
        private final ImageView teamOneImage;
        private final ImageView teamTwoImage;
        View itemView;

        public MatchHolder(View itemView) {
            super(itemView);
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    onRecyclerItemClickListener.onItemClick(v, getAdapterPosition());
                }
            });
            this.itemView = itemView;
            matchNo = (TextView) itemView.findViewById(R.id.match_no);
            teamOne = (TextView) itemView.findViewById(R.id.team1);
            teamOneImage = (ImageView) itemView.findViewById(R.id.teamone_image);
            teamTwo = (TextView) itemView.findViewById(R.id.team2);
            teamTwoImage = (ImageView) itemView.findViewById(R.id.teamtwo_image);
            venue = (TextView) itemView.findViewById(R.id.venue);
            matchTime = (TextView) itemView.findViewById(R.id.match_time);
        }
    }
}
