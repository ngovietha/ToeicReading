package com.example.ha.ToeicReading.tuvung;

import android.content.Context;
import android.database.Cursor;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CursorAdapter;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.ha.ToeicReading.R;

public class TuVungAdapter extends CursorAdapter {
    public TuVungAdapter(Context context, Cursor c , boolean autoRequery) {
        super(context, c,autoRequery );
    }

    @Override
    public View newView(Context context, Cursor cursor, ViewGroup parent) {
        View word= LayoutInflater.from(context).inflate(R.layout.item_list_word, parent,false);
        TuVungActivity.TuVungHolder holder= new TuVungActivity.TuVungHolder(word);
        word.setTag(holder);
        return word;
    }
    @Override
    public void bindView(View view, Context context, Cursor cursor) {
        TextView tvWord= (TextView) view.findViewById(R.id.tvWord);
        LinearLayout linWord= (LinearLayout) view.findViewById(R.id.linWord);
        if(cursor.getPosition()%2 == 0){
            linWord.setBackgroundColor(Color.parseColor("#FFE2DFDF"));
        }else linWord.setBackgroundColor(Color.parseColor("#ffffff"));
        tvWord.setText(cursor.getString(1));
        String d= cursor.getString(7);
    }
}
