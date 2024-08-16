package baitaprikkei.bai6;

public class circle {
    private double radius;
    private String color;

    public circle() {
        this.radius = 1.0;
        this.color = "red";
    }
    public circle(double radius) {
        this.radius = radius;
        this.color = "red";
    }

    public double getRadius() {
        return this.radius;
    }

    public double getArea(){
        return this.radius * this.radius * Math.PI;
    }
}
