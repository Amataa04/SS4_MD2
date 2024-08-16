package baitaprikkei.bai3;

public class test {
    public static void main(String[] args) {
        QuadraticEquation q = new QuadraticEquation();
        q.inputData();
        if(q.getDiscriminant() < 0){
            System.out.printf("Delta: %.2f\n", q.getDiscriminant());
            System.out.println("Phương trình vô nghiệm\n");
        }
        else if(q.getDiscriminant() == 0){
            System.out.printf("Delta: %.2f\n", q.getDiscriminant());
            //System.out.printf("Nghiệm trùng phương 1: %.2f\n", q.getRoot1());
            //System.out.printf("Nghiệm trùng phương 2: %.2f\n", q.getRoot2());
            System.out.printf("Nghiệm trùng phương: %.2f\n", -q.getB() / 2 * q.getA());
        }
        else{
            System.out.printf("Delta: %.2f\n", q.getDiscriminant());
            System.out.printf("Nghiệm 1: %.2f\n", q.getRoot1());
            System.out.printf("Nghiệm 2: %.2f\n", q.getRoot2());
        }
    }
}
