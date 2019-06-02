package com.example.ha.ToeicReading.tuvung;

import android.app.ListActivity;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.example.ha.ToeicReading.R;
import com.example.ha.ToeicReading.question.DBHelper;
import com.example.ha.ToeicReading.word_detail;

public class TuVungActivity extends ListActivity  {
    public final static String ID_EXTRA = "com.example.ha.ToeicReading.tuvung._ID";
    Cursor model = null;
    TuVungAdapter adapter = null;
    TuVungController helper;
    ImageView imgView=null;
    EditText edt = null;
    public DBHelper dbHelper = new DBHelper(TuVungActivity.this);
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tuvungactivity);

        helper = new TuVungController(this);
        if (model != null) {
            stopManagingCursor(model);
            model.close();
        }
        model = helper.getAll();
        startManagingCursor(model);
        adapter = new TuVungAdapter(TuVungActivity.this, model,false);
        setListAdapter(adapter);
        imgView=(ImageView)findViewById(R.id.toeic_words) ;
        imgView.setImageResource(R.drawable.significant);
        edt = (EditText) findViewById(R.id.edtSearch);
        edt.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                // listCursor(TuVungController.getSearch(edt.getText().toString()));
                SQLiteDatabase db = dbHelper.getReadableDatabase();
                Cursor c = db.rawQuery("SELECT id As _id, tuvung, phienam, giaithich, tuloai, vidu, dichvd, img FROM toeicword WHERE tuvung LIKE '" + edt.getText().toString() + "%'", null);
                if (c != null) {
                    c.moveToFirst();
                }
                adapter = new TuVungAdapter(TuVungActivity.this, c,false);
                setListAdapter(adapter);
                adapter.notifyDataSetChanged();
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

    }

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);
        {
            Intent i = new Intent(TuVungActivity.this, word_detail.class);
            i.putExtra(ID_EXTRA, String.valueOf(id));
            startActivity(i);
        }
    }



    static class TuVungHolder {
        private TextView word = null;

        TuVungHolder(View row) {
            word = (TextView) row.findViewById(R.id.tvWord);

        }
    }
}
