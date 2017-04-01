package com.example.android.miwok;

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

public class PhrasesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
        ArrayList<Word1> words=new ArrayList<Word1>();
        words.add(new Word1("Where are you going?","Tum knha jaa rahe ho?"));
        words.add(new Word1("What is your name?","Tumhara naam kya hai?"));
        words.add(new Word1("My name is...","Mera naam hai..."));
        words.add(new Word1("How are you feeling?","Tumhe kesa mahhsos ho raha hai?"));
        words.add(new Word1("I’m feeling good.","Main accha mahhsos kar raha hoon."));
        words.add(new Word1("Are you coming?","Kya tum aa rahe ho?"));
        words.add(new Word1("Yes, I’m coming.","Haan, main aa raha hoon."));
        words.add(new Word1("I’m coming.","Main aa raha hoon."));
        words.add(new Word1("Let's go.","Chlo chlein."));
        words.add(new Word1("Come here.","Idhar aao."));

        WordAdapter adapter = new WordAdapter(this,words,R.color.category_phrases);

        ListView listView = (ListView)findViewById(R.id.list);

        listView.setAdapter(adapter);

    }
}
