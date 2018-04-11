package com.madhav.com.ipl2018.view.adapter;

import android.support.v4.app.FragmentActivity;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.List;

import com.madhav.com.ipl2018.R;
import com.madhav.com.ipl2018.entity.Squad;

/**
 * Created by madhav on 4/10/2018.
 */

public class PlayersListAdapter extends RecyclerView.Adapter<PlayersListAdapter.PlayersHolder> {
    private final FragmentActivity activity;
    private final Squad.Squads squads;
    private final List<Squad.Squads.Players> players;

    public PlayersListAdapter(FragmentActivity activity, Squad.Squads squads) {
        this.activity = activity;
        players = squads.getPlayers();
        this.squads = squads;
    }

    @Override
    public PlayersHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.player_details, parent, false);
        return new PlayersHolder(itemView);
    }

    @Override
    public void onBindViewHolder(PlayersHolder holder, int position) {
        Squad.Squads.Players players = this.players.get(position);
        Glide.with(activity)
                .load("http://static2.iplt20.com/players/284/" + players.getId() + ".png")
                .into(holder.playerImage);
        String tag = "";
        if (players.getId() == squads.getCaptainId() && players.getId() == squads.getWicketKeeperId()) {
            tag = "( Captain & Wicket Kepper )";
        } else if (squads.getCaptainId() == players.getId()) {
            tag = "( Captain )";
        } else if (squads.getWicketKeeperId() == players.getId()) {
            tag = "( Wicket Keeper )";
        }
        if (!players.getNationality().equals("Indian")) {
            holder.foreignPlayer.setVisibility(View.VISIBLE);
        }
        holder.playerName.setText(players.getFullName() + " " + tag);
        holder.nationality.setText(players.getNationality());
        holder.playerdob.setText(getDateFromUnix(players.getDateOfBirth()));
    }

    @Override
    public int getItemCount() {
        return squads.getPlayers().size();
    }

    private String getDateFromUnix(long dateOfBirth) {
        return new java.text.SimpleDateFormat("MM/dd/yyyy HH:mm:ss").format(new java.util.Date(dateOfBirth * 1000));
    }


    public class PlayersHolder extends RecyclerView.ViewHolder {

        private final TextView playerdob;
        private final TextView nationality;
        private final TextView playerName;
        private final ImageView playerImage;
        private final ImageView foreignPlayer;

        public PlayersHolder(View itemView) {
            super(itemView);
            playerImage = (ImageView) itemView.findViewById(R.id.player_image);
            foreignPlayer = (ImageView) itemView.findViewById(R.id.foreign_player);
            playerName = (TextView) itemView.findViewById(R.id.player_name);
            nationality = (TextView) itemView.findViewById(R.id.player_nationality_natio);
            playerdob = (TextView) itemView.findViewById(R.id.player_dob);
        }
    }
}
