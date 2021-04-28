package com.example.myfirstapp;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;

import java.util.ArrayList;

public class wordAdapter extends ArrayAdapter<word> {
    private  int colorId;

    public wordAdapter(@NonNull Activity context, ArrayList<word>numbers,int colorIdd  ) {
        super(context, 0,numbers);
        colorId=colorIdd;
     }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        if(convertView ==null){
            LayoutInflater listItem =  LayoutInflater.from(getContext());
            convertView =listItem.inflate(R.layout.list,parent,false);

        }
        word current =getItem(position);
        TextView miowk= (TextView) convertView.findViewById(R.id.textView);
        TextView  english=(TextView) convertView.findViewById(R.id.textView2);
        ImageView  image =(ImageView) convertView.findViewById(R.id.pic);


        miowk.setText(current.getMmiowk());
        english.setText(current.getMenglish());

      if(current.hasImage()){
          image.setImageResource(current.getImageId());
          image.setVisibility(View.VISIBLE);

      }
        else{
          image.setVisibility(View.GONE);
      }


View background =convertView.findViewById(R.id.colorr);

int color = ContextCompat.getColor(getContext(),colorId);
        background.setBackgroundColor(color);


return convertView;
     //   return super.getView(position, convertView, parent);
    }


}
