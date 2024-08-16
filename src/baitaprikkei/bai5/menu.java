package baitaprikkei.bai5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class menu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<student> listStudent = new ArrayList<>();

        do{
            System.out.println("========================MENU========================");
            System.out.println("1. Hiển thị danh sách tất cả học sinh");
            System.out.println("2. Thêm mới học sinh");
            System.out.println("3. Sửa thông tin học sinh dựa vào mã học sinh");
            System.out.println("4. Xóa học sinh dựa vào mã học sinh");
            System.out.println("5. Thoát");
            System.out.println("Chọn từ 1 - 6");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    for (student s1 : listStudent) {
                        s1.outputData();
                    }
                    break;
                case 2:
                    System.out.println("Mời chọn số lượng học sinh");
                    int n = sc.nextInt();
                    for (int i = 0; i < n; i++) {
                        student s2 = new student();
                        s2.inputData();
                        listStudent.add(s2);
                    }
                    break;
                case 3:
                    System.out.println("Mời chọn vị trí để sửa");
                    int index = sc.nextInt();
                    for (int i = 0; i <= index; i++){
                        if (index == i){
                            student s3 = new student();
                            s3.inputData();
                            listStudent.set(i, s3);
                        }
                    }
                    break;
                case 4:
                    System.out.println("Nhập chỉ mục đã xóa: ");
                    int indexRemove = sc.nextInt();
                    for (int i = 0; i <= indexRemove; i++) {
                        student s4 = new student();
                        if (indexRemove == i) {
                            listStudent.remove(i);
                        }
                    }
                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Mời chọn lại");
            }
        }
        while (true);
    }
}
