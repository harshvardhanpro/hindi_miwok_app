package com.example.android.miwok;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

import java.util.ArrayList;

public class ColorsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
        ArrayList<Word1> words = new ArrayList<Word1>();
        words.add(new Word1("red", "lal", R.drawable.color_red));
        words.add(new Word1("green", "hara", R.drawable.color_green));
        words.add(new Word1("brown", "bhura", R.drawable.color_brown));
        words.add(new Word1("gray", "gray", R.drawable.color_gray));
        words.add(new Word1("black", "kaala", R.drawable.color_black));
        words.add(new Word1("white", "saphed", R.drawable.color_white));
        words.add(new Word1("dusty yellow", "dhool dhoola peela", R.drawable.color_dusty_yellow));
        words.add(new Word1("mustard yellow", "sarson sa peela", R.drawable.color_mustard_yellow));


        WordAdapter adapter = new WordAdapter(this, words, R.color.category_colors);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);

}

}
