package com.khaccthienn.giangviencohuu;

import com.khaccthienn.giangvien.GiangVien;

import java.util.Scanner;

public class GiangVienCoHuu extends GiangVien {
    private double salary;
    private double working_hour_per_month = 40;

    public GiangVienCoHuu(){};
    public GiangVienCoHuu(String name, String address, String phoneNumber, double teachingHour, double salary) {
        super(name, address, phoneNumber, teachingHour);
//        super();
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    public double getWorking_hour_per_month() {
        return working_hour_per_month;
    }

    public void setWorking_hour_per_month(double working_hour_per_month) {
        this.working_hour_per_month = working_hour_per_month;
    }

    @Override
    public void input() {
        super.input();
        Scanner sc = new Scanner(System.in);
        System.out.print("Salary: ");
        salary = Double.parseDouble(sc.nextLine());
    }
    @Override
    public void display() {
        super.display();
        System.out.println("\tSalary: " + salary);
        System.out.println("\tWorking Hour Per Month: " + working_hour_per_month);
    }
}
