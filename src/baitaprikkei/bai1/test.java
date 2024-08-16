package baitaprikkei.bai1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<circle> list = new ArrayList<>();

        do{
            System.out.println("===========================MENU===========================");
            System.out.println("1. Nhập thông tin");
            System.out.println("2. Hiển thị thông tin");
            System.out.println("3. Chu vi hình tròn");
            System.out.println("4. Diện tích hình tròn");
            System.out.println("5. Thoát");
            System.out.println("Chọn từ 1 - 5");
            System.out.println("===========================================================");
            int choice = sc.nextInt();
            switch(choice) {
                case 1:
                    System.out.println("Nhập số lượng");
                    int n = sc.nextInt();
                    for (int i = 0; i < n; i++) {
                        circle c1 = new circle();
                        c1.inputData();
                        list.add(c1);
                    }
                    break;
                case 2:
                    for (circle c2 : list){
                        c2.outputData();
                    }
                    break;
                case 3:
                    for (int i = 0; i < list.size(); i++){
                        System.out.printf("Chu vi hình tròn %d là: %.2f\n", i + 1, list.get(i).circularCircumference());
                    }
                    break;
                case 4:
                    for (int i = 0; i < list.size(); i++){
                        System.out.printf("Diện tích hình tròn %d là: %.2f\n", i + 1, list.get(i).circularArea());
                    }
                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Mời bạn chọn lại");
            }
        }
        while(true);
    }
}
