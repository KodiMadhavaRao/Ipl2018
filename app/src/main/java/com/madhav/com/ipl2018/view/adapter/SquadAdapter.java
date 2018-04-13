package com.madhav.com.ipl2018.view.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.madhav.com.ipl2018.R;
import com.madhav.com.ipl2018.entity.Squad;
import com.madhav.com.ipl2018.view.activity.SquadsActivity;

import java.util.List;

/**
 * Created by madhav on 4/10/2018.
 */

public class SquadAdapter extends RecyclerView.Adapter<SquadAdapter.SquadHolder> {
    private final SquadsActivity squadsActivity;
    private final Squad squad;
    private SquadListener squadListener;

    public SquadAdapter(SquadsActivity squadsActivity, Squad squad) {

        this.squadsActivity = squadsActivity;
        this.squad = squad;
    }

    @Override
    public SquadHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(squadsActivity).inflate(R.layout.squad, parent, false);
        return new SquadHolder(itemView);
    }

    @Override
    public void onBindViewHolder(SquadHolder holder, int position) {
        Squad.Squads.Team team = squad.getSquads().get(position).getTeam();
        setTeamImages(team.getFullName(), holder.teamThumb);
        holder.teamName.setText(team.getFullName());
        holder.shortName.setText(team.getShortName());
        holder.captain.setText("Captain :" + filterCaptain(position));
        holder.wiketKeeper.setText("Wicket Keeper :" + filterWickerKeeper(position));
    }

    private String filterWickerKeeper(int postion) {
        String wicketKeeper = "";
        List<Squad.Squads.Players> players = squad.getSquads().get(postion).getPlayers();
        for (int i = 0; i < players.size(); i++) {
            if (squad.getSquads().get(postion).getWicketKeeperId() == players.get(i).getId()) {
                wicketKeeper = players.get(i).getFullName();
            }
        }
        return wicketKeeper;
    }

    private String filterCaptain(int position) {
        String captain = "";
        List<Squad.Squads.Players> players = squad.getSquads().get(position).getPlayers();
        for (int i = 0; i < players.size(); i++) {
            if (squad.getSquads().get(position).getCaptainId() == players.get(i).getId()) {
                captain = players.get(i).getFullName();
            }
        }
        return captain;
    }

    private void setTeamImages(String team, ImageView teamOneImage) {
        int drawableRes = 0;
        switch (team) {
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
        return squad.getSquads().size();
    }

    public void setOnItemClickListener(SquadListener squadListener) {

        this.squadListener = squadListener;
    }

    public interface SquadListener {
        public void onItemClick(View view, int position, Squad.Squads squads);
    }

    public class SquadHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        private final ImageView teamThumb;
        private final TextView shortName;
        private final TextView teamName;
        private final TextView captain;
        private final TextView wiketKeeper;

        public SquadHolder(View itemView) {
            super(itemView);
            itemView.setOnClickListener(this);
            teamThumb = (ImageView) itemView.findViewById(R.id.team_thumb);
            shortName = (TextView) itemView.findViewById(R.id.short_name);
            teamName = (TextView) itemView.findViewById(R.id.team_name);
            captain = (TextView) itemView.findViewById(R.id.captain);
            wiketKeeper = (TextView) itemView.findViewById(R.id.wicket_keeper);

        }

        @Override
        public void onClick(View v) {
            squadListener.onItemClick(v, getAdapterPosition(), squad.getSquads().get(getAdapterPosition()));
        }
    }
}
