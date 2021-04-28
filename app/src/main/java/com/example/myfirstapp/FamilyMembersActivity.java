package com.example.myfirstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class FamilyMembersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);
     final    ArrayList<word> numbers = new ArrayList<word>();
        numbers.add(new word("әpә", "father",R.drawable.family_father,R.raw.family_father));
        numbers.add(new word("әṭa","mother",R.drawable.family_mother,R.raw.family_mother));
        numbers.add(new word("angsi","son",R.drawable.family_son,R.raw.family_son));
        numbers.add(new word("tune","daughter",R.drawable.family_daughter,R.raw.family_daughter));
        numbers.add(new word("taachi","older brother",R.drawable.family_older_brother,R.raw.family_older_brother));
        numbers.add(new word("chalitti","younger brother",R.drawable.family_younger_brother,R.raw.family_younger_brother));
        numbers.add(new word("teṭe","older sister",R.drawable.family_older_sister,R.raw.family_older_sister));
        numbers.add(new word("kolliti","younger sister",R.drawable.family_younger_sister,R.raw.family_younger_sister));
        numbers.add(new word("ama","grandmother",R.drawable.family_grandmother,R.raw.family_grandmother));
        numbers.add(new word("paapa" ,"grandfather",R.drawable.family_grandfather,R.raw.family_grandfather));


        wordAdapter adapter= new wordAdapter(this,numbers,R.color.familyColor);
        ListView nn=(ListView) findViewById(R.id.list);
        nn.setAdapter(adapter);
        nn.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

               word words= numbers.get(position);
                MediaPlayer mediaPlayer=MediaPlayer.create(FamilyMembersActivity.this,words.getmAudioId());
                mediaPlayer.start();


            }
        });


    }
}