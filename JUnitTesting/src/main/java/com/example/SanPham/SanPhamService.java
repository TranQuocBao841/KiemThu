package com.example.SanPham;

import java.util.ArrayList;
import java.util.List;

public class SanPhamService {
    private List<SanPham> danhSachSanPham = new ArrayList<>();

    public void themSanPham(SanPham sp) {
        danhSachSanPham.add(sp);
    }

    public boolean xoaSanPham(String ma) {
        return danhSachSanPham.removeIf(sanPham -> sanPham.getMa().equals(ma));
    }

    public boolean kiemTraMaTonTai(String ma) {
        return danhSachSanPham.stream().anyMatch(sp -> sp.getMa().equals(ma));
    }

    public List<SanPham> getDanhSachSanPham() {
        return danhSachSanPham;
    }
}
