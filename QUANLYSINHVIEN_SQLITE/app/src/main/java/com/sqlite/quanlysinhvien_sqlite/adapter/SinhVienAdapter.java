package com.sqlite.quanlysinhvien_sqlite.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.sqlite.quanlysinhvien_sqlite.R;
import com.sqlite.quanlysinhvien_sqlite.model.SinhVien;

import java.util.List;

public class SinhVienAdapter extends BaseAdapter {
    private  List<SinhVien> sinhVienList;
    private  Context context;
    public SinhVienAdapter(Context context, List<SinhVien> listList)
    {
        this.context=context;
        this.sinhVienList=listList;
    }
    @Override
    public int getCount() {
        return sinhVienList.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        ViewHolder viewHolder;
        if(view==null)
        {
             viewHolder= new ViewHolder();
             //Convert resource to View
             LayoutInflater inflater=(LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
             view= inflater.inflate(R.layout.list_item_sinhvien,null);
             //Ánh xạ
             viewHolder.tvMaSV_229=view.findViewById(R.id.tv_masv_229);
             viewHolder.tvHoTen_229=view.findViewById(R.id.tv_hoten_229);
             viewHolder.tvDienThoai_229=view.findViewById(R.id.tv_dienthoai_229);
             viewHolder.tvEmail_229=view.findViewById(R.id.tv_email_229);
             viewHolder.ivGioiTinh_229=view.findViewById(R.id.iv_gioitinh_229);
             view.setTag(viewHolder);
        }
        else
        {
            viewHolder=(ViewHolder) view.getTag();
        }
        //
        SinhVien sv=sinhVienList.get(i);
        viewHolder.tvMaSV_229.setText("Mã SV:" + sv.getMaSV_229());
        viewHolder.tvHoTen_229.setText("Họ Tên:" + sv.getHoTen_229());
        viewHolder.tvDienThoai_229.setText("Điện Thoại :" + sv.getDienThoai_229());
        viewHolder.tvEmail_229.setText("Email:" + sv.getEmail_229());
        if(sv.getGioiTinh_229()==0)
        {
            viewHolder.ivGioiTinh_229.setImageResource(R.drawable.icon_female);
        }
        else
        {
            viewHolder.ivGioiTinh_229.setImageResource(R.drawable.icon_male);
        }

        return view;
    }
    class  ViewHolder
    {
        ImageView ivGioiTinh_229;
        TextView tvMaSV_229,tvHoTen_229,tvDienThoai_229,tvEmail_229;

    }
}
