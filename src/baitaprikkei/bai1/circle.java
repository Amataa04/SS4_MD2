package baitaprikkei.bai1;

import java.util.Scanner;

public class circle {
    private double radius;
    private String color;
    public static final double PI = 3.14159265359;

    public circle() {

    }

    public circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    // Chu vi
    public double circularCircumference (){
        return 2 * PI * this.radius;
    }

    // Dien tich hinh tron
    public double circularArea(){
        return PI * this.radius * this.radius;
    }

    // nhap vao thong tin doi tuong
    public void inputData(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập bán kính: ");
        this.radius = Double.parseDouble(sc.nextLine());
        System.out.println("Nhập màu sắc: ");
        this.color = sc.nextLine();
    }
    // hien thi thong tin cac thuoc tinh
    public void outputData(){
        System.out.println("Ban kinh: " + this.radius);
        System.out.println("Mau: " + this.color);
    }
}
