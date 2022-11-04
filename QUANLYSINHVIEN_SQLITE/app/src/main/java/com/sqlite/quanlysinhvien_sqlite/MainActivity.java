package com.sqlite.quanlysinhvien_sqlite;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;

import com.sqlite.quanlysinhvien_sqlite.adapter.SinhVienAdapter;
import com.sqlite.quanlysinhvien_sqlite.dao.SinhVienDAO;
import com.sqlite.quanlysinhvien_sqlite.model.SinhVien;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ListView lvSinhVien;
    private List<SinhVien> sinhVienList;
    private SinhVienAdapter adapter;
    private SinhVienDAO svDao;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Ánh xạ
        lvSinhVien=(ListView) findViewById(R.id.lv_sinhvien);
        //có dữ liệu
        sinhVienList=new ArrayList<SinhVien>();
        svDao=new SinhVienDAO(MainActivity.this);
        sinhVienList=svDao.TatCaSinhVien();
        //
        adapter=new SinhVienAdapter(getApplicationContext(),sinhVienList);
        lvSinhVien.setAdapter(adapter);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_option,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id= item.getItemId();
        if(id== R.id.menu_them)
        {
            Intent intent=new Intent(MainActivity.this,AddActivity.class);
            startActivity(intent);
        }
        if(id== R.id.menu_thoat)
        {
            finish();
        }
        return true;
    }
}