package baitaprikkei.bai5;

import java.util.Scanner;

public class student {
    private int id;
    private String name;
    private int age;
    private String gender;
    private String address;
    private String phoneNumber;

    public student() {

    }

    public student(int id, String name, int age, String gender, String address, String phoneNumber) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    // nhap thong tin
    public void inputData(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập mã số: ");
        this.id = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập tên: ");
        this.name = sc.nextLine();
        System.out.println("Nhập tuổi: ");
        this.age = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập giới tính: ");
        this.gender = sc.nextLine();
        System.out.println("Nhập địa chỉ: ");
        this.address = sc.nextLine();
        System.out.println("Nhập số điện thoại: ");
        this.phoneNumber = sc.nextLine();
    }

    // hien thi thong tin
    public void outputData(){
        System.out.println("MaSV: " + this.id);
        System.out.println("TênSV: " + this.name);
        System.out.println("Tuổi: " + this.age);
        System.out.println("Giới tính: " + this.gender);
        System.out.println("Địa chỉ: " + this.address);
        System.out.println("SĐT: " + this.phoneNumber);
        System.out.println("--------------------------");
    }
}
