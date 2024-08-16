package baitaprikkei.bai2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<employee> list = new ArrayList<employee>();
        do{
            System.out.println("=====================MENU=====================");
            System.out.println("1. Nhập thông tin");
            System.out.println("2. Hiển thị thông tin");
            System.out.println("3. Tính lương nhân viên");
            System.out.println("4. Thoát");
            System.out.println("Chọn từ 1 - 4");
            System.out.println("==============================================");
            int choice = sc.nextInt();
            switch(choice) {
                case 1:
                    System.out.println("Chọn số lượng");
                    int n = sc.nextInt();
                    for (int i = 0; i < n; i++) {
                        employee emp = new employee();
                        emp.inputData();
                        list.add(emp);
                    }
                    break;
                case 2:
                    for (employee emp1 : list) {
                        emp1.outputData();
                    }
                    break;
                case 3:
                    for (int i = 0; i < list.size(); i++) {
                        System.out.printf("Số lương nhân viên %d là: %.2f\n", i + 1, list.get(i).getSalary());
                    }
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Mời chọn lại");;
            }
        }
        while(true);
    }
}
