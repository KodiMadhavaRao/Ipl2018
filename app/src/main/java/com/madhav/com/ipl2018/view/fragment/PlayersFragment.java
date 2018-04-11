package com.madhav.com.ipl2018.view.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.madhav.com.ipl2018.R;
import com.madhav.com.ipl2018.entity.Squad;
import com.madhav.com.ipl2018.view.adapter.PlayersListAdapter;

/**
 * Created by madhav on 4/10/2018.
 */

public class PlayersFragment extends Fragment {
    Squad.Squads squads;

    public static PlayersFragment newInstance(Squad.Squads squads) {
        PlayersFragment playersFragment = new PlayersFragment();
        Bundle bundle = new Bundle();
        bundle.putSerializable("squads", squads);
        playersFragment.setArguments(bundle);
        return playersFragment;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        squads = (Squad.Squads) getArguments().getSerializable("squads");
        View inflate = inflater.inflate(R.layout.players_list, container, false);
        TextView teamName = (TextView) inflate.findViewById(R.id.team_name_fragment);
        Toolbar toolbar = (Toolbar) inflate.findViewById(R.id.toolbarId);

        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getActivity().onBackPressed();
            }
        });
        teamName.setText(squads.getTeam().getFullName());
        RecyclerView recyclerView = (RecyclerView) inflate.findViewById(R.id.players_list);
        recyclerView.setAdapter(new PlayersListAdapter(getActivity(), squads));
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        return inflate;
    }
}
