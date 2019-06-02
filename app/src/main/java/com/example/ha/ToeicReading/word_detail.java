package com.example.ha.ToeicReading;

import android.app.Activity;
import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.ha.ToeicReading.tuvung.TuVungActivity;
import com.example.ha.ToeicReading.tuvung.TuVungController;

public class word_detail extends Activity {
        ImageView img=null;
        TextView tuvung=null;
        TextView phienam=null;
        TextView giaithich1=null;
        TextView giaithich2=null;
        TextView tuloai1=null;
        TextView tuloai2=null;
        TextView vidu1=null;
        TextView vidu2=null;
        TextView dichvd=null;
TuVungController helper=null;
        String wordId=null;

        @Override
        public void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.word_detail);
            helper=new TuVungController(this);
            img=(ImageView)findViewById(R.id.img);
            tuvung=(TextView)findViewById(R.id.tuvung);
            phienam=(TextView)findViewById(R.id.phienam);
            giaithich1=(TextView)findViewById(R.id.giaithich1);
            giaithich2=(TextView)findViewById(R.id.giaithich2);
            tuloai1=(TextView)findViewById(R.id.tuloai1);
            tuloai2=(TextView)findViewById(R.id.tuloai2);
            vidu1=(TextView)findViewById(R.id.vidu1);
            vidu2=(TextView)findViewById(R.id.vidu2);
            dichvd=(TextView)findViewById(R.id.dichvd);
            Intent i = getIntent();
            wordId = i.getStringExtra(TuVungActivity.ID_EXTRA);
            if (wordId!=null) {
                load();
            }
        }
        private void load() {
            Cursor c=helper.getById(wordId);
            c.moveToFirst();
            phienam.setText(helper.getPhienAm(c));
            tuvung.setText(helper.getTuVung(c));
            giaithich2.setText(helper.getGiaiThich(c));
            tuloai2.setText(helper.getTuLoai(c));
            vidu2.setText(helper.getViDu(c));
            dichvd.setText(helper.getDichVd(c));
            img.setImageResource(getResources().getIdentifier(helper.getImg(c),"drawable","com.example.ha.ToeicReading"));

            c.close();
        }


        }



