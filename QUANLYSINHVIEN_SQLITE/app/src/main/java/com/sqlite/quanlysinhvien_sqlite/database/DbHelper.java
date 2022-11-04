package com.sqlite.quanlysinhvien_sqlite.database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class DbHelper extends SQLiteOpenHelper {
    public DbHelper(@Nullable Context context) {
        super(context, "QLSinhVien.sqlite", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        String sqlSVCreate="CREATE TABLE IF NOT EXISTS "+
                "SinhVien(MaSV_229 INTEGER PRIMARY KEY AUTOINCREMENT, "+
                "HoTen_229 VARCHAR(200), "+
                "GioiTinh_229 INTEGER, "+
                "DienThoai_229 VARCHAR(13), "+
                "Email_229 VARCHAR(200)) ";
        sqLiteDatabase.execSQL(sqlSVCreate);
        String sqlInsert1="INSERT INTO SinhVien(HoTen_229,GioiTinh_229,DienThoai_229,Email_229) VALUES('Luyen','0','0334567894','luyen@gmail.com')";
        String sqlInsert2="INSERT INTO SinhVien(HoTen_229,GioiTinh_229,DienThoai_229,Email_229) VALUES('Nguyen','1','0334545678','nguyen@gmail.com')";
        String sqlInsert3="INSERT INTO SinhVien(HoTen_229,GioiTinh_229,DienThoai_229,Email_229) VALUES('Thu','0','0987895645','luyen@gmail.com')";
        sqLiteDatabase.execSQL(sqlInsert1);
        sqLiteDatabase.execSQL(sqlInsert2);
        sqLiteDatabase.execSQL(sqlInsert3);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}
