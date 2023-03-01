package com.khaccthienn.giangvienthinhgiang;

import com.khaccthienn.giangvien.GiangVien;

import java.util.Scanner;

public class GiangVienThinhGiang extends GiangVien {
    private String department;
    private double avaiable_hour;

    public GiangVienThinhGiang() {}

    public GiangVienThinhGiang(String name, String address, String phoneNumber, double teachingHour, String department, double avaiable_hour) {
        super(name, address, phoneNumber, teachingHour);
        this.department = department;
        this.avaiable_hour = avaiable_hour;
    };

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getAvaiable_hour() {
        return avaiable_hour;
    }

    public void setAvaiable_hour(double avaiable_hour) {
        this.avaiable_hour = avaiable_hour;
    }

    @Override
    public void input() {
        super.input();
        Scanner sc = new Scanner(System.in);
        System.out.print("Department: ");
        department = sc.nextLine();
        System.out.print("Avaiable Hour: ");
        avaiable_hour = Double.parseDouble(sc.nextLine());
    }
    @Override
    public void display() {
        super.display();
        System.out.println("\tDepartment: " + department);
        System.out.println("\tAvaiable Hour: " + avaiable_hour);
    }
}
