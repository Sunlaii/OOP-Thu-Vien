package client;

import book.TacGia;
import execute.Menu;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class TheThuVien {
    final String idTheThuVien = "NV" + String.format("%03d", DanhSachTheThuVien.soLuong + 1);
    private String ho;
    private String ten;
    private Boolean gioiTinh;
    private LocalDate ngaySinh;
    private String soDienThoai;

    public TheThuVien() {
        ho = "none";
        ten = "none";
        ngaySinh = LocalDate.now();
        gioiTinh = false;
        soDienThoai = "none";
    }

    public void TheThuVien(String ho, String ten, Boolean gioiTinh, LocalDate ngaySinh, String soDienThoai) {
        this.ho = ho;
        this.ten = ten;
        this.gioiTinh = gioiTinh;
        this.ngaySinh = ngaySinh;
        this.soDienThoai = soDienThoai;
    }

    public String getIDTheThuVien() {
        return idTheThuVien;
    }

    public void setGioiTinh(Boolean gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public void setHo(String ho) {
        this.ho = ho;
    }

    public void setNgaySinh(LocalDate ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public void setSoDienThoai(String soDienThoai) {
        this.soDienThoai = soDienThoai;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public TheThuVien taoTheThuVien() {
        TheThuVien TheThuVien = new TheThuVien();
        LocalDate ngaySinh = null;

        System.out.println("Nhap ho cua TheThuVien:");
        TheThuVien.setHo(Menu.input.nextLine());

        System.out.println("Nhap ten cua TheThuVien:");
        TheThuVien.setTen(Menu.input.nextLine());

        System.out.println("Nhap gioiTinh cua TheThuVien (1: nam/0: nu):");
        TheThuVien.setGioiTinh(Menu.input.nextInt() == 1);

        System.out.println("Nhap vao ngay thang nam sinh (ddMMyyyy) cua TheThuVien:");
        DateTimeFormatter formatter;
        String chuoiNgaySinh;
        boolean vongLap;
        do {
            try {
                vongLap = false;
                chuoiNgaySinh = Menu.input.nextLine();
                formatter = DateTimeFormatter.ofPattern("ddMMyyyy");
                ngaySinh = LocalDate.parse(chuoiNgaySinh, formatter);
            } catch (Exception e) {
                System.out.println("Dinh dang khong hop le, vui long nhap lai!");
                vongLap = true;
            }
        } while (vongLap);

        System.out.println("Nhap vao so dien thoai cua TheThuVien:");
        TheThuVien.setSoDienThoai(Menu.input.nextLine());
        TheThuVien.setNgaySinh(ngaySinh);
        return TheThuVien;
    }

    @Override
    public String toString() {
        return String.format("%-10s%-15s%-15s%-10s%-15s%-15s", idTheThuVien, ho, ten, gioiTinh ? "nam" : "nu", ngaySinh, soDienThoai);
    }
}