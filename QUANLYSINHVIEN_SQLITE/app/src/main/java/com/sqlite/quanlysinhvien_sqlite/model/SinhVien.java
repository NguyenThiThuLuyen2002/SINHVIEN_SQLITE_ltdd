package com.sqlite.quanlysinhvien_sqlite.model;

public class SinhVien {
    private int MaSV_229;
    private String HoTen_229;
    private int GioiTinh_229;
    private String DienThoai_229;
    private String Email_229;

    public SinhVien() {
    }

    public SinhVien(String hoTen_229, int gioiTinh_229, String dienThoai_229, String email_229) {
        HoTen_229 = hoTen_229;
        GioiTinh_229 = gioiTinh_229;
        DienThoai_229 = dienThoai_229;
        Email_229 = email_229;
    }

    public SinhVien(int maSV_229, String hoTen_229, int gioiTinh_229, String dienThoai_229, String email_229) {
        MaSV_229 = maSV_229;
        HoTen_229 = hoTen_229;
        GioiTinh_229 = gioiTinh_229;
        DienThoai_229 = dienThoai_229;
        Email_229 = email_229;
    }

    public int getMaSV_229() {
        return MaSV_229;
    }

    public void setMaSV_229(int maSV_229) {
        MaSV_229 = maSV_229;
    }

    public String getHoTen_229() {
        return HoTen_229;
    }

    public void setHoTen_229(String hoTen_229) {
        HoTen_229 = hoTen_229;
    }

    public int getGioiTinh_229() {
        return GioiTinh_229;
    }

    public void setGioiTinh_229(int gioiTinh_229) {
        GioiTinh_229 = gioiTinh_229;
    }

    public String getDienThoai_229() {
        return DienThoai_229;
    }

    public void setDienThoai_229(String dienThoai_229) {
        DienThoai_229 = dienThoai_229;
    }

    public String getEmail_229() {
        return Email_229;
    }

    public void setEmail_229(String email_229) {
        Email_229 = email_229;
    }
}
