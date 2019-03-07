package com.example.myapplication;

import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewManager;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder> {
    private List<Objective> mList;
    ViewHolder mViewHolder;

    public Adapter(List<Objective> list) {
        mList = list;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.item, viewGroup, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final ViewHolder viewHolder, int i) {
        mViewHolder = viewHolder;
    }

    @Override
    public int getItemCount() {
        return mList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        TextView title, deadline, date, status, comment, numCmt, actual, source, expect;
        ProgressBar progressBar;
        CardView mCardView, card1, card2, card3;
        View mView;

        public ViewHolder(View itemView) {
            super(itemView);
            mCardView = itemView.findViewById(R.id.card_ob);
            title = itemView.findViewById(R.id.text_title);
            deadline = itemView.findViewById(R.id.text_deadline);
            progressBar = itemView.findViewById(R.id.progress_actual);
            card1 = itemView.findViewById(R.id.card_date);
            card2 = itemView.findViewById(R.id.card_status);
            card3 = itemView.findViewById(R.id.card_cmt);
            actual = itemView.findViewById(R.id.text_percent_actual);
            source = itemView.findViewById(R.id.textView);
            expect = itemView.findViewById(R.id.text_percent_expected);
        }
    }

}
