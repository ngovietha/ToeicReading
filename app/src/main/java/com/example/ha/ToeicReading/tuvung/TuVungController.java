package com.example.ha.ToeicReading.tuvung;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import com.example.ha.ToeicReading.question.DBHelper;


public class TuVungController {
    private DBHelper dbHelper;

    public TuVungController (Context context) {
        dbHelper= new DBHelper(context);
    }

    public Cursor getById(String id){
        SQLiteDatabase db= dbHelper.getReadableDatabase();
        Cursor cursor= db.rawQuery("SELECT * FROM toeicword WHERE id= '"+id+"'",null);

        return cursor;
    }
    //Lấy danh sách tu vung theo key
//    public Cursor getSearch(String key) {
//        SQLiteDatabase db = dbHelper.getReadableDatabase();
//        Cursor cursor=db.rawQuery("SELECT * FROM toeicword WHERE tuvung LIKE '%"+key+"%'",null);
//        if (cursor != null) {
//            cursor.moveToFirst();
//        }
//        return cursor;
//    }
    public Cursor getAll() {
        SQLiteDatabase db = dbHelper.getReadableDatabase();
        String sqlCommand = "SELECT id AS _id, tuvung, phienam, giaithich, tuloai, vidu, dichvd, img FROM toeicword ORDER BY tuvung ASC";
        Cursor cursor= db.rawQuery(sqlCommand, null);
        return cursor;
    }
    public String getTuVung(Cursor c) { return (c.getString(1)); }

    public String getPhienAm(Cursor c) {
        return (c.getString(2));
    }

    public String getGiaiThich(Cursor c) {
        return (c.getString(3));
    }

    public String getTuLoai(Cursor c) {
        return (c.getString(4));
    }

    public String getViDu(Cursor c) {
        return (c.getString(5));
    }

    public String getDichVd(Cursor c) {
        return (c.getString(6));
    }

    public String getImg(Cursor c) {
        return (c.getString(7));
    }

}