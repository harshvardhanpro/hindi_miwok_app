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

public class FamilyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
        ArrayList<Word1> words=new ArrayList<Word1>();
        words.add(new Word1("father","papa",R.drawable.family_father));
        words.add(new Word1("mother","mummy",R.drawable.family_mother));
        words.add(new Word1("son","beta",R.drawable.family_son));
        words.add(new Word1("daughter","beti",R.drawable.family_daughter));
        words.add(new Word1("younger brother","chota bhai",R.drawable.family_younger_brother));
        words.add(new Word1("older brother","bada bhai",R.drawable.family_older_brother));
        words.add(new Word1("younger sister","choti behen",R.drawable.family_younger_sister));
        words.add(new Word1("older sister","badi behen",R.drawable.family_older_sister));
        words.add(new Word1("grandmother","dadi",R.drawable.family_grandmother));
        words.add(new Word1("grandfather","dada",R.drawable.family_grandfather));

        WordAdapter adapter = new WordAdapter(this,words,R.color.category_family);

        ListView listView = (ListView)findViewById(R.id.list);

        listView.setAdapter(adapter);

    }
}
