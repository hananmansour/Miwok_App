package com.example.myfirstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.provider.UserDictionary;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import org.w3c.dom.Text;
import  android.view.ViewGroup;
import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);
     final    ArrayList<word> numbers = new ArrayList<word>();
         numbers.add(new word("lutti","one",R.drawable.number_one,R.raw.number_one));
        numbers.add(new word("otiiko","two",R.drawable.number_two,R.raw.number_two));
        numbers.add(new word("tolookesu","three",R.drawable.number_three,R.raw.number_three));
        numbers.add(new word("oyyisa","four",R.drawable.number_four,R.raw.number_four));
        numbers.add(new word("massoka","five",R.drawable.number_five,R.raw.number_five));
        numbers.add(new word("temmokka","sex",R.drawable.number_six,R.raw.number_six));
        numbers.add(new word("kenekaku","seven",R.drawable.number_seven,R.raw.number_seven));
        numbers.add(new word("kawinta","eight",R.drawable.number_eight,R.raw.number_eight));
        numbers.add(new word("wo’e","nine",R.drawable.number_nine,R.raw.number_nine));
        numbers.add(new word("na’aacha" ,"ten",R.drawable.number_ten,R.raw.number_ten));
        

  wordAdapter adapter= new wordAdapter(this,numbers,R.color.numberscolor);
  ListView nn=(ListView) findViewById(R.id.list);
nn.setAdapter(adapter);

//دى عشان لما اضغط على عنصر معين فى list يدينى اكشن معين
nn.setOnItemClickListener(new AdapterView.OnItemClickListener() {
    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        word words=numbers.get(position);
        // context =reference number activity .context
        MediaPlayer mediaPlayer=MediaPlayer.create(NumbersActivity.this,words.getmAudioId());

        //in mediaplayer class there is built in methods like start and stop
        mediaPlayer.start();
    }
});
    }
}