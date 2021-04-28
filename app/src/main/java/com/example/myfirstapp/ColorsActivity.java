package com.example.myfirstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

public class ColorsActivity extends AppCompatActivity {
    private MediaPlayer player;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);
     final    ArrayList<word> numbers = new ArrayList<word>();
        numbers.add(new word("weṭeṭṭi", "red",R.drawable.color_red,R.raw.color_red));
        numbers.add(new word("chokokki","green",R.drawable.color_green,R.raw.color_green));
        numbers.add(new word("ṭakaakki","brown",R.drawable.color_brown,R.raw.color_brown));
        numbers.add(new word("ṭopoppi","gray",R.drawable.color_gray,R.raw.color_gray));
        numbers.add(new word("kululli","black",R.drawable.color_black,R.raw.color_black));
        numbers.add(new word("kelelli", "white",R.drawable.color_white,R.raw.color_white));
        numbers.add(new word("ṭopiisә","dusty yellow",R.drawable.color_dusty_yellow,R.raw.color_dusty_yellow));
        numbers.add(new word("chiwiiṭә","mustard yellow",R.drawable.color_mustard_yellow,R.raw.color_mustard_yellow));


        wordAdapter adapter= new wordAdapter(this,numbers,R.color.colorsColor);
        ListView nn=(ListView) findViewById(R.id.list);
        nn.setAdapter(adapter);
nn.setOnItemClickListener(new AdapterView.OnItemClickListener() {
    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        word words=numbers.get(position);
        MediaPlayer mediaPlayer=MediaPlayer.create(ColorsActivity.this,words.getmAudioId());
        mediaPlayer.start();

    }
});


    }
}