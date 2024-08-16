package baitaprikkei.bai3;

import java.util.Scanner;

public class QuadraticEquation {
    private double a, b, c;

    public QuadraticEquation() {
    }

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    // phuong thuc tinh delta
    public double getDiscriminant(){
        return Math.pow(this.b, 2) - 4 * this.a * this.c;
    }

    // phuong thuc tinh 2 nghiem
    public double getRoot1(){
        return (-this.b + Math.sqrt(Math.pow(this.b, 2) - 4 * this.a * this.c)) / (2 * this.a);
    }
    public double getRoot2(){
        return (-this.b - Math.sqrt(Math.pow(this.b, 2) - 4 * this.a * this.c)) / (2 * this.a);
    }

    // Nhap thong tin
    public void inputData(){
        Scanner in = new Scanner(System.in);
        System.out.print("Nhập a, b, c: \n");
        this.a = in.nextDouble();
        //System.out.print("Nhập b: \n");
        this.b = in.nextDouble();
        //System.out.println("Nhập c: ");
        this.c = in.nextDouble();
    }
}
