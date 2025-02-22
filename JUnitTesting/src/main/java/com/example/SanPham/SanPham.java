package com.example.SanPham;

public class SanPham {
    private String ma;
    private String ten;
    private int namBaoHanh;
    private float gia;
    private int soLuong;
    private String danhMuc;

    public SanPham(String ma, String ten, int namBaoHanh, float gia, int soLuong, String danhMuc) {
        this.ma = ma;
        this.ten = ten;
        this.namBaoHanh = namBaoHanh;
        this.gia = gia;
        this.soLuong = soLuong;
        this.danhMuc = danhMuc;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getTen() {
        return ten;
    }

    public int getNamBaoHanh() {
        return namBaoHanh;
    }

    public float getGia() {
        return gia;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public String getDanhMuc() {
        return danhMuc;
    }
}
