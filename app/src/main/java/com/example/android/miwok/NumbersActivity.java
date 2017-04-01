package com.example.android.miwok;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

import static com.example.android.miwok.R.id.numbers;

public class NumbersActivity extends AppCompatActivity {
    private MediaPlayer mMediaPlayer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
        ArrayList<Word1> words=new ArrayList<Word1>();
        words.add(new Word1("one","ekk",R.drawable.number_one));
        words.add(new Word1("two","do",R.drawable.number_two));
        words.add(new Word1("three","teen",R.drawable.number_three));
        words.add(new Word1("four","chaar",R.drawable.number_four));
        words.add(new Word1("five","paanch",R.drawable.number_five));
        words.add(new Word1("six","chhe",R.drawable.number_six));
        words.add(new Word1("seven","saat",R.drawable.number_seven));
        words.add(new Word1("eight","aath",R.drawable.number_eight));
        words.add(new Word1("nine","nau",R.drawable.number_nine));
        words.add(new Word1("ten","das",R.drawable.number_ten));

        WordAdapter adapter = new WordAdapter(this,words,R.color.category_numbers);

        ListView listView = (ListView)findViewById(R.id.list);

        listView.setAdapter(adapter);

        // Set a click listener on that View
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l)

             {
               mMediaPlayer=MediaPlayer.create(NumbersActivity.this,R.raw.one);
                mMediaPlayer.start();
            }
        });
    }

}
