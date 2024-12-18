package execute;

public class MenuThuVien {

    public int xuatMenuThuVien() {
        int luaChon;
        Boolean dieuKien;
        do {
            System.out.println("0. Thoat MenuThuVien.");
            System.out.println("1. Quan ly nhan vien.");
            System.out.println("2. Quan ly khach hang.");
            System.out.println("3. Quan ly sach.");
            System.out.println("4. Quan ly nha cung cap.");
            luaChon = Menu.input.nextInt();
            Menu.clearScreen();
            dieuKien = luaChon >= 0 && luaChon <= 4;
            if (!dieuKien) {
                System.out.println("Lua chon khong hop le, vui long nhap lai!");
            }
        } while (!dieuKien);
        return luaChon;
    }

    public void xuLyMenuThuVien(int luaChon) {
        int chon = 0;
        switch (luaChon) {
            case 1:
                MenuQuanLyNhanVien menuQuanLyNhanVien = new MenuQuanLyNhanVien();
                do {
                    chon = menuQuanLyNhanVien.xuatMenuQuanLyNhanVien();
                    menuQuanLyNhanVien.xuLyMenuQuanLyNhanVien(chon);
                } while (chon != 0);
                break;
            case 2:
                MenuQuanLyKhachHang menuQuanLyKhachHang = new MenuQuanLyKhachHang();
                do {
                    chon = menuQuanLyKhachHang.xuatMenuQuanLyKhachHang();
                    menuQuanLyKhachHang.xuLyMenuQuanLyKhachHang(chon);
                } while (chon!= 0);
                break;
            case 3:
                MenuQuanLySach menuQuanLySach = new MenuQuanLySach();
                do {
                    chon = menuQuanLySach.xuatMenuQuanLySach();
                    menuQuanLySach.xuLyMenuQuanLySach(chon);
                } while (chon!= 0); 
                break;
            case 4:
                MenuQuanLyNhaCungCap menuQuanLyNhaCungCap = new MenuQuanLyNhaCungCap();
                do {
                    chon = menuQuanLyNhaCungCap.xuatMenuQuanLyNhaCungCap();
                    menuQuanLyNhaCungCap.xuLyMenuQuanLyNhaCungCap(chon);
                } while (chon!= 0);
                break;
        }
    }
}
