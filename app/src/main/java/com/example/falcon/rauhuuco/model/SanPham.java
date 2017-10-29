package com.example.falcon.rauhuuco.model;

import java.io.Serializable;

/**
 * Created by falcon on 22/10/2017.
 */

public class SanPham implements Serializable{
    private int IDSanPham;
    private  int IDNongTrai;
    private int IDKhuyenMai;
    private String TenSanPham;
    private String ThongTinSanPham;
    private String SoLuong;
    private int Gia;
    private int HinhAnh;

    public SanPham() {

    }

    public SanPham(String tenSanPham, int gia, int hinhAnh) {
        TenSanPham = tenSanPham;
        Gia = gia;
        HinhAnh = hinhAnh;
    }

    public SanPham(int IDSanPham, int IDNongTrai, int IDKhuyenMai, String tenSanPham, String thongTinSanPham, String soLuong, int gia, int hinhAnh) {
        this.IDSanPham = IDSanPham;
        this.IDNongTrai = IDNongTrai;
        this.IDKhuyenMai = IDKhuyenMai;
        TenSanPham = tenSanPham;
        ThongTinSanPham = thongTinSanPham;
        SoLuong = soLuong;
        Gia = gia;
        HinhAnh = hinhAnh;
    }

    public int getIDSanPham() {
        return IDSanPham;
    }

    public void setIDSanPham(int IDSanPham) {
        this.IDSanPham = IDSanPham;
    }

    public int getIDNongTrai() {
        return IDNongTrai;
    }

    public void setIDNongTrai(int IDNongTrai) {
        this.IDNongTrai = IDNongTrai;
    }

    public int getIDKhuyenMai() {
        return IDKhuyenMai;
    }

    public void setIDKhuyenMai(int IDKhuyenMai) {
        this.IDKhuyenMai = IDKhuyenMai;
    }

    public String getTenSanPham() {
        return TenSanPham;
    }

    public void setTenSanPham(String tenSanPham) {
        TenSanPham = tenSanPham;
    }

    public String getThongTinSanPham() {
        return ThongTinSanPham;
    }

    public void setThongTinSanPham(String thongTinSanPham) {
        ThongTinSanPham = thongTinSanPham;
    }

    public String getSoLuong() {
        return SoLuong;
    }

    public void setSoLuong(String soLuong) {
        SoLuong = soLuong;
    }

    public int getGia() {
        return Gia;
    }

    public void setGia(int gia) {
        Gia = gia;
    }

    public int getHinhAnh() {
        return HinhAnh;
    }

    public void setHinhAnh(int hinhAnh) {
        HinhAnh = hinhAnh;
    }

    public class DataViewHolder {

    }
}
