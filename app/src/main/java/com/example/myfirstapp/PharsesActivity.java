package com.example.myfirstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class PharsesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);
     final    ArrayList<word> numbers = new ArrayList<word>();
        numbers.add(new word("minto wuksus" ,"Where are you going?",R.raw.phrase_where_are_you_going  ));
        numbers.add(new word("tinnә oyaase'nә","What is your name?" ,R.raw.phrase_what_is_your_name ));
        numbers.add(new word("oyaaset","My name is",R.raw.phrase_my_name_is));
        numbers.add(new word("michәksәs?","How are you feeling?" ,R.raw.phrase_how_are_you_feeling));
        numbers.add(new word("kuchi achit","I’m feeling good." ,R.raw.phrase_im_feeling_good));
        numbers.add(new word("әәnәs'aa?","Are you coming?" ,R.raw.phrase_are_you_coming ));
        numbers.add(new word("hәә’ әәnәm","Yes, I’m coming" ,R.raw.phrase_yes_im_coming ));
        numbers.add(new word("әәnәm","I’m coming",R.raw.phrase_im_coming ));
        numbers.add(new word("yoowutis","Let’s go" ,R.raw.phrase_lets_go ));
        numbers.add(new word("әnni'nem" ,"Come here" ,R.raw.phrase_come_here ));


        wordAdapter adapter= new wordAdapter(this,numbers,R.color.phreasesColor);
        ListView nn=(ListView) findViewById(R.id.list);
        nn.setAdapter(adapter);
        nn.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                word words=numbers.get(position);
                MediaPlayer mediaPlayer=MediaPlayer.create(PharsesActivity.this,words.getmAudioId());
                mediaPlayer.start();

            }
        });

    }
}