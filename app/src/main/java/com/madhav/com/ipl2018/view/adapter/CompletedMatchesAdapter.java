package com.madhav.com.ipl2018.view.adapter;

import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.madhav.com.ipl2018.R;
import com.madhav.com.ipl2018.entity.CompletedMatchStatus;
import com.madhav.com.ipl2018.entity.Matches;
import com.madhav.com.ipl2018.entity.model.MatchFlags;
import com.madhav.com.ipl2018.view.activity.CompletedMatchActivity;

import java.util.List;

/**
 * Created by madhav on 4/11/2018.
 */

public class CompletedMatchesAdapter extends RecyclerView.Adapter<CompletedMatchesAdapter.CompletedHolder> {
    private final CompletedMatchActivity completedMatchActivity;
    private final List<MatchFlags> matchFlags;
    private List<CompletedMatchStatus> summarys;

    private CompleteMatchClickListener completeMatchClickListener;

    public CompletedMatchesAdapter(CompletedMatchActivity completedMatchActivity, List<MatchFlags> matchFlags, List<CompletedMatchStatus> summarys) {
        this.completedMatchActivity = completedMatchActivity;
        this.matchFlags = matchFlags;
        this.summarys = summarys;
    }

    @Override
    public CompletedHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.comleted_match, parent, false);
        return new CompletedHolder(itemView);
    }

    @Override
    public void onBindViewHolder(CompletedHolder holder, int position) {
        if (matchFlags.get(position).isCurrentDate()) {
            holder.itemView.setBackgroundDrawable(getStrokeDrawable());
        }
        Matches.ScheduleBean scheduleBeans = matchFlags.get(position).getScheduleBeans();
        setTeamImages(scheduleBeans.getTeam1().getTeam().getFullName(), holder.teamOneImage);
        setTeamImages(scheduleBeans.getTeam2().getTeam().getFullName(), holder.teamTwoImage);
        holder.matchNo.setText(scheduleBeans.getDescription());
        holder.teamOne.setText((scheduleBeans.getTeam1().getTeam().getFullName()));
        holder.teamTwo.setText((scheduleBeans.getTeam2().getTeam().getFullName()));
        holder.venue.setText(scheduleBeans.getVenue().getFullName());
        holder.result.setText(summarys.get(position).getStatus());
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
        gradientDrawable.setStroke(2, completedMatchActivity.getResources().getColor(R.color.lt_red));
        return gradientDrawable;
    }

    public void setOnItemClickListener(CompleteMatchClickListener completeMatchClickListener) {

        this.completeMatchClickListener = completeMatchClickListener;
    }

    public interface CompleteMatchClickListener {
        public void completedMatch(View v, int postion, int matchId);
    }

    public class CompletedHolder extends RecyclerView.ViewHolder {

        private final ImageView teamOneImage;
        private final ImageView teamTwoImage;
        private final TextView matchNo;
        private final TextView teamOne;
        private final TextView teamTwo;
        private final TextView venue;
        private final TextView result;

        public CompletedHolder(View itemView) {
            super(itemView);
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    completeMatchClickListener.completedMatch(view, getAdapterPosition(), matchFlags.get(getAdapterPosition()).getScheduleBeans().getMatchId().getId());
                }
            });
            teamOneImage = (ImageView) itemView.findViewById(R.id.com_teamone_image);
            teamTwoImage = (ImageView) itemView.findViewById(R.id.com_teamtwo_image);
            matchNo = (TextView) itemView.findViewById(R.id.com_match_no);
            teamOne = (TextView) itemView.findViewById(R.id.com_team1);
            teamTwo = (TextView) itemView.findViewById(R.id.com_team2);
            venue = (TextView) itemView.findViewById(R.id.com_venue);
            result = (TextView) itemView.findViewById(R.id.com_result);
        }
    }
}
