package com.madhav.com.ipl2018.view.activity;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.madhav.com.ipl2018.R;
import com.madhav.com.ipl2018.entity.Commentry;

import java.util.List;

/**
 * Created by madhav on 4/11/2018.
 */

class CommentryAdapter extends RecyclerView.Adapter<CommentryAdapter.CommentryHolder> {
    private CommentryActivity commentryActivity;
    private List<Commentry.Commentaries> commentaries;

    public CommentryAdapter(CommentryActivity commentryActivity, List<Commentry.Commentaries> commentaries) {
        this.commentryActivity = commentryActivity;
        this.commentaries = commentaries;
    }

    @Override
    public CommentryHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        TextView textView=new TextView(commentryActivity);
        textView.setId(R.id.commentry);
        textView.setLayoutParams(new ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT));
        return new CommentryHolder(textView);
    }

    @Override
    public void onBindViewHolder(CommentryHolder holder, int position) {
        holder.commentry.setText(commentaries.get(position).getBbcode());
    }

    @Override
    public int getItemCount() {
        return commentaries.size();
    }

    public class CommentryHolder extends RecyclerView.ViewHolder {

        private final TextView commentry;

        public CommentryHolder(View itemView) {
            super(itemView);
            commentry = (TextView) itemView.findViewById(R.id.commentry);
        }
    }
}
