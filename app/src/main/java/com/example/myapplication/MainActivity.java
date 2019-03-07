package com.example.myapplication;

import android.app.ActivityOptions;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.util.Pair;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView Recycler;
    List<Objective> list;
    Button mButton;
    int i = 0 ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("Thanh", "onCreate: item ");

    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("Thanh", "onStart: ");
        initData();
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("Thanh", "onResume: ");

    }

    private void initData() {
        Recycler = findViewById(R.id.recycler);
        list = new ArrayList<Objective>();
        list.add(new Objective("thanh "));
        list.add(new Objective("thanh 1"));
        list.add(new Objective("thanh 2"));
        list.add(new Objective("thanh 3"));
        Adapter adapter = new Adapter(list);
        Recycler.setLayoutManager(new
                LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));
        Recycler.setAdapter(adapter);
        Recycler.addOnItemTouchListener(new RecyclerTouchListener(this, Recycler, new ClickListener() {
            @Override
            public void onClick(View view, int position) {
                Pair[] pair = new Pair[9];
                pair[0] = new Pair(view.findViewById(R.id.text_title), "title_share");
                pair[1] = new Pair(view.findViewById(R.id.text_deadline), "deadline_share");
                pair[2] = new Pair(view.findViewById(R.id.card_date), "card_share_1");
                pair[3] = new Pair(view.findViewById(R.id.card_status), "card_share_2");
                pair[4] = new Pair(view.findViewById(R.id.card_cmt), "card_share_3");
                pair[5] = new Pair(view.findViewById(R.id.progress_actual), "progress_share");
                pair[6] = new Pair(view.findViewById(R.id.text_percent_actual), "actual_share");
                pair[7] = new Pair(view.findViewById(R.id.textView), "source_share");
                pair[8] = new Pair(view.findViewById(R.id.text_percent_expected), "expect_share");
                ActivityOptions options = ActivityOptions.makeSceneTransitionAnimation(
                        MainActivity.this, pair);
                Intent i = new Intent(MainActivity.this, Activity2.class);
                startActivity(i, options.toBundle());
            }

            @Override
            public void onLongClick(View view, int position) {

            }
        }));
    }


    //    public void sharedElementTransition(View view) {
//
//        Pair[] pair = new Pair[9];
//        pair[0] = new Pair<View, String>(title, "title_share");
//        pair[1] = new Pair<View, String>(deadline, "deadline_share");
//        pair[2] = new Pair<View, String>(card1, "card_share_1");
//        pair[3] = new Pair<View, String>(card2, "card_share_2");
//        pair[4] = new Pair<View, String>(card3, "card_share_3");
//        pair[5] = new Pair<View, String>(progressBar, "progress_share");
//        pair[6] = new Pair<View, String>(actual, "actual_share");
//        pair[7] = new Pair<View, String>(source, "source_share");
//        pair[8] = new Pair<View, String>(expect, "expect_share");
//
//        ActivityOptions options = ActivityOptions.makeSceneTransitionAnimation(this, pair);
//        Intent i = new Intent(MainActivity.this, Activity2.class);
//        startActivity(i, options.toBundle());
//    }

}
