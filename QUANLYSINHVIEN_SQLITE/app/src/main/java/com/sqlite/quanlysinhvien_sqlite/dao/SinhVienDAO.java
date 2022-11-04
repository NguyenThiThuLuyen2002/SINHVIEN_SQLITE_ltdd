package com.sqlite.quanlysinhvien_sqlite.dao;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import com.sqlite.quanlysinhvien_sqlite.database.DbHelper;
import com.sqlite.quanlysinhvien_sqlite.model.SinhVien;

import java.util.ArrayList;
import java.util.List;

public class SinhVienDAO {
    private DbHelper csdl;
    public SinhVienDAO(Context context)
    {
       csdl = new DbHelper(context);
    }
    //Lấy tất cả Sinh Viên
    public List<SinhVien> TatCaSinhVien()
    {
        String sql="SELECT * FROM SinhVien";
        List<SinhVien> sinhVienList=new ArrayList<SinhVien>();
        SQLiteDatabase database=csdl.getReadableDatabase();
        Cursor cursor= database.rawQuery(sql,null);
        cursor.moveToFirst();
        while (!cursor.isAfterLast())
        {
            int masv_229=cursor.getInt(0);
            String hoten_229=cursor.getString(1);
            int gioitinh_229=cursor.getInt(2);
            String dienthoai_229=cursor.getString(3);
            String email_229=cursor.getString(4);
            SinhVien sv= new SinhVien(masv_229,hoten_229,gioitinh_229,dienthoai_229,email_229);
            sinhVienList.add(sv);
            cursor.moveToNext();
        }
        return sinhVienList;
    }
    // Lấy 1 Sinh Viên

    // Thêm Sinh Viên

    // Cập nhật Sinh Viên

    // Xóa Sinh Viên
}

