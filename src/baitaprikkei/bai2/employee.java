package baitaprikkei.bai2;

import java.util.Scanner;

public class employee {
    private String employeeId;
    private String employeeName;
    private int age;
    private String gender;
    private double rate;
    private double salary;

    public employee() {

    }

    public employee(String employeeId, String employeeName, int age, String gender, double rate) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.age = age;
        this.gender = gender;
        this.rate = rate;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    // nhap thong tin
    public void inputData(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập ID: ");
        this.employeeId = sc.nextLine();
        System.out.println("Nhập tên nhân viên: ");
        this.employeeName = sc.nextLine();
        System.out.println("Nhập tuổi: ");
        this.age = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập giới tính: ");
        this.gender = sc.nextLine();
        System.out.println("Nhập hệ số lương: ");
        this.rate = sc.nextDouble();
    }

    // hien thi thong tin
    public void outputData(){
        System.out.println("ID: " + this.employeeId);
        System.out.println("Tên: " + this.employeeName);
        System.out.println("Tuổi: " + this.age);
        System.out.println("Giới tính: " + this.gender);
        System.out.println("Hệ số lương: " + this.rate);
    }

    // tinh luong nhan vien
    public double getSalary() {
        return this.rate * 1300000;
    }
}
