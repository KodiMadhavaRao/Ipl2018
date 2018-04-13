package com.madhav.com.ipl2018.view.dialog;

import android.app.Activity;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.madhav.com.ipl2018.R;
import com.madhav.com.ipl2018.view.activity.CommentryActivity;
import com.madhav.com.ipl2018.view.activity.ImagesActivity;

/**
 * Created by madhav on 4/13/2018.
 */

public class ImageCommentrySelectionDialog extends DialogFragment implements View.OnClickListener {
    private String matchId;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        matchId = getArguments().getString("matchId");
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        Activity activity = getActivity();
        LinearLayout linearLayout=new LinearLayout(activity);
        linearLayout.setLayoutParams(new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT));
        linearLayout.setOrientation(LinearLayout.VERTICAL);
        linearLayout.addView(getTxtView(R.id.commentry_selection,"Commentry"));
        linearLayout.addView(getTxtView(R.id.images_selection,"Images"));
        return linearLayout;
    }

    @Override
    public void onStart() {
        super.onStart();

        Dialog dialog = getDialog();
        if (dialog != null) {
            dialog.getWindow().setLayout(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        }
    }

    public TextView getTxtView(int id, String commentry) {
        TextView textView=new TextView(getActivity());
        textView.setPadding(10,10,10,10);
        textView.setLayoutParams(new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT));
        textView.setText(commentry);
        textView.setId(id);
        textView.setOnClickListener(this);
        return textView;
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.commentry_selection:
                openActivity(CommentryActivity.class);
                break;
            case R.id.images_selection:
                openActivity(ImagesActivity.class);
                break;
        }
        dismiss();
    }

    private void openActivity(Class aClass) {
        Intent intent = new Intent(getActivity(), aClass);
        intent.putExtra("matchId", "" + matchId);
        startActivity(intent);
    }

    public static ImageCommentrySelectionDialog newInstance(int matchId) {
        ImageCommentrySelectionDialog imageCommentrySelectionDialog=new ImageCommentrySelectionDialog();
        Bundle bundle=new Bundle();
        bundle.putString("matchId",""+matchId);
        imageCommentrySelectionDialog.setArguments(bundle);
        return imageCommentrySelectionDialog;
    }
}
