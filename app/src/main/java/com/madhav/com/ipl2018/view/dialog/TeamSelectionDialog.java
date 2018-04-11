package com.madhav.com.ipl2018.view.dialog;

import android.app.Dialog;
import android.app.DialogFragment;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.ScrollView;
import android.widget.TextView;

import com.madhav.com.ipl2018.R;

/**
 * Created by madhav on 4/6/2018.
 */

public class TeamSelectionDialog extends DialogFragment implements View.OnClickListener {
    private OnItemSelection onItemSelection;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        String[] values;
        int[] images = new int[]{R.drawable.badge_csk, R.drawable.badge_dd, R.drawable.badge_kxip, R.drawable.badge_kkr,
                R.drawable.badge_mi, R.drawable.badge_rr, R.drawable.badge_rcb, R.drawable.badge_srh};
        if (getTag().equals("Team")) {
            values = new String[]{"All Teams", "Chennai Super Kings", "Delhi Daredevils", "Kings XI Punjab", "Kolkata Knight Riders", "Mumbai Indians", "Rajasthan Royals", "Royal Challengers Bangalore", "Sunrisers Hyderabad"};
        } else {
            values = new String[]{"All Venues", "Bengaluru", "Chennai", "Delhi", "Hyderabad", "Indore", "Jaipur", "Kolkata", "Mohali", "Mumbai", "Pune"};
        }
        Context context = getActivity();
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setPadding(10, 0, 0, 0);
        linearLayout.setLayoutParams(new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT));
        linearLayout.setOrientation(LinearLayout.VERTICAL);
        for (int i = 0; i < values.length; i++) {
            if (i == 0) {
                TextView headTextView = new TextView(context);
                headTextView.setPadding(15, 15, 15, 15);
                headTextView.setText(getTag().equals("Team") ? "Filter By Teams" : "Filter By Venue");
                headTextView.setGravity(Gravity.CENTER);
                headTextView.setTextSize(TypedValue.COMPLEX_UNIT_SP, 16);
                headTextView.setLayoutParams(new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT));
                linearLayout.addView(headTextView);
            }
            LinearLayout linearLayout1 = new LinearLayout(context);
            linearLayout1.setPadding(0, 6, 0, 6);
            linearLayout.addView(linearLayout1);
            linearLayout1.setGravity(Gravity.CENTER_VERTICAL);
            linearLayout1.setOrientation(LinearLayout.HORIZONTAL);
            linearLayout1.setLayoutParams(new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT));

            ImageView imageView = new ImageView(context);
            if (getTag().equals("Team")) {
                if (i > 0)
                    imageView.setImageResource(images[i - 1]);
                linearLayout1.addView(imageView);
            }
            imageView.setLayoutParams(new LinearLayout.LayoutParams(80, 80));

            TextView textView = new TextView(context);
            textView.setGravity(Gravity.CENTER_VERTICAL);
            textView.setId(i);
            textView.setOnClickListener(this);
            linearLayout1.addView(textView);
            textView.setPadding(15, 15, 15, 15);
            textView.setLayoutParams(new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT));
            textView.setText(values[i]);
        }
        ScrollView scrollView = new ScrollView(getActivity());
        scrollView.setLayoutParams(new FrameLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT));
        scrollView.addView(linearLayout);
        scrollView.setFillViewport(true);
        return scrollView;
    }

    public void onFilterItemClick(OnItemSelection onItemSelection) {

        this.onItemSelection = onItemSelection;
    }

    @Override
    public void onStart() {
        super.onStart();

        Dialog dialog = getDialog();
        if (dialog != null) {
            dialog.getWindow().setLayout(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        }
    }

    @Override
    public void onClick(View v) {
        dismiss();
        ProgressBar progress = (ProgressBar) getActivity().findViewById(R.id.loading_progress);
        progress.setVisibility(View.VISIBLE);
        onItemSelection.onItemClick(v, v.getId(), ((TextView) v).getText().toString().trim(), getTag().equals("Team"));
    }

    public interface OnItemSelection {
        public void onItemClick(View view, int selctionId, String selection, boolean isClicked);
    }
}
