package com.khaccthienn.giangvien;

import java.util.Scanner;

public class GiangVien {
    private String name;
    private String address;
    private String phone_number;
    private double teaching_hour;

    public GiangVien() {};

    public GiangVien(String name, String address, String phoneNumber, double teachingHour) {
        this.name = name;
        this.address = address;
        this.phone_number = phoneNumber;
        this.teaching_hour = teachingHour;
    };

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }

    public double getTeaching_hour() {
        return teaching_hour;
    }

    public void setTeaching_hour(double teaching_hour) {
        this.teaching_hour = teaching_hour;
    }

    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Name: ");
        name = sc.nextLine();

        System.out.print("Address: ");
        address = sc.nextLine();

        System.out.print("Phone Number: ");
        phone_number = sc.nextLine();

        System.out.print("Teaching Hour: ");
        teaching_hour = Double.parseDouble(sc.nextLine());
    }

    public void display() {
        System.out.println("\tName: " + name);
        System.out.println("\tAddress: " + address);
        System.out.println("\tPhone Number: " + phone_number);
        System.out.println("\tTeaching Hour: " + teaching_hour);
    }
}
