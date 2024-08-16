package baitaprikkei.bai4;

public class test {
    public static void main(String[] args) {
        fan f1 = new fan();
//        System.out.println(f1.toString());

        f1.setOn(true);
        f1.setSpeed(f1.FAST);
        f1.setRadius(10);
        f1.setColor("Red");
        System.out.println("Fan 1: " + f1.toString());

        fan f2 = new fan();
        f2.setOn(false);
        f2.setSpeed(f2.MEDIUM);
        f2.setRadius(10);
        f2.setColor("Blue");
        System.out.println("Fan 2: "+ f2.toString());
    }
}
