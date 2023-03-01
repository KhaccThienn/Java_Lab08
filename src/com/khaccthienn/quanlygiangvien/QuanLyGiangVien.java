package com.khaccthienn.quanlygiangvien;

import com.khaccthienn.giangviencohuu.GiangVienCoHuu;
import com.khaccthienn.giangvienthinhgiang.GiangVienThinhGiang;

import java.util.Scanner;

public class QuanLyGiangVien {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        GiangVienCoHuu[] gvch = new GiangVienCoHuu[1000];
        GiangVienThinhGiang[] gvtg = new GiangVienThinhGiang[1000];
        int m = 0, n = 0, choose;
        boolean flag = true;
        do {
            System.out.println("\t\t ===== MENU =====");
            System.out.println("1: Nhap Thong Tin Giang Vien");
            System.out.println("2: Xuat Danh Sach Toan Bo Giang Vien");
            System.out.println("3: Xuat Danh Sach Giang Vien Co Huu");
            System.out.println("4: Xuat Danh Sach Giang Vien Thinh Giang");
            System.out.println("5: Tinh Tong So Tien Luong Cua Toan Bo Giang Vien");
            System.out.println("6: Tim Giang Vien Co Tong Luong Cao Nhat");
            System.out.println("0: Thoat Chuong Trinh");
            System.out.println("Lua Chon Cua Ban La: ");
            choose = Integer.parseInt(sc.nextLine());

            switch (choose) {
                case 1:
                    if (flag) {
                        System.out.println("Nhap Giang Vien Co Huu: ");
                        n = Integer.parseInt(sc.nextLine());

                        System.out.println("Nhap So Giang Vien Thinh Giang: ");
                        m = Integer.parseInt(sc.nextLine());
                    }

                    if (n > 0) {
                        System.out.println("\t\t Nhap Danh Sach Giang Vien Co Huu: ");
                        for (int i = 0; i < n; i++) {
                            System.out.println();
                            gvch[i] = new GiangVienCoHuu();
                            System.out.println("Giang Vien Co Huu " + (i + 1) + ": ");
                            gvch[i].input();
                        }
                    }
                    if (m > 0) {
                        System.out.println("\t\t Nhap Danh Sach Giang Vien Thinh Giang: ");
                        for (int i = 0; i < m; i++) {
                            System.out.println();
                            gvtg[i] = new GiangVienThinhGiang();
                            System.out.println("Giang Vien Thinh Giang " + (i + 1) + ": ");
                            gvtg[i].input();
                        }
                    }

                    flag = false;
                    break;
                case 2:
                    if (flag) {
                        System.out.println("You Must Choose Option 1 First !");
                        break;
                    }
                    System.out.println();
                    System.out.println("Danh Sach Toan Bo Giang Vien: ");
                    if (n > 0) {
                        System.out.println();
                        System.out.println("\t\t Danh Sach Giang Vien Co Huu: ");
                        for (int i = 0; i < n; i++) {
                            System.out.println("Giang Vien Co Huu " + (i + 1) + ": ");
                            gvch[i].display();
                        }
                    }
                    if (m > 0) {
                        System.out.println();
                        System.out.println("\t\t Danh Sach Giang Vien Thinh Giang: ");
                        for (int i = 0; i < m; i++) {
                            System.out.println("Giang Vien Thinh Giang " + (i + 1) + ": ");
                            gvtg[i].display();
                        }
                    }
                    break;
                case 3:
                    if (flag) {
                        System.out.println("You Must Choose Option 1 First !");
                        break;
                    }
                    if (n > 0) {
                        System.out.println();
                        System.out.println("\t\t Danh Sach Giang Vien Co Huu: ");
                        for (int i = 0; i < n; i++) {
                            System.out.println("Giang Vien Co Huu " + (i + 1) + ": ");
                            gvch[i].display();
                        }
                    } else {
                        System.out.println("Khong co giang vien co huu trong danh sach");
                    }
                    break;
                case 4:
                    if (flag) {
                        System.out.println("You Must Choose Option 1 First !");
                        break;
                    }
                    if (m > 0) {
                        System.out.println();
                        System.out.println("\t\t Danh Sach Giang Vien Thinh Giang: ");
                        for (int i = 0; i < m; i++) {
                            System.out.println("Giang Vien Thinh Giang " + (i + 1) + ": ");
                            gvtg[i].display();
                        }
                    } else {
                        System.out.println("Khong co giang vien thinh giang trong danh sach");
                    }
                    break;
                case 5:

                    break;
                case 0:
                    System.out.println("Ban Da Chon Thoat Chuong Trinh !");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Moi Nhap Lua Chon Hop Ly !");
                    break;
            }
        } while (choose > 0 || choose <= 7);
    }
}
