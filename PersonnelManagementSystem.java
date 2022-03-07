package HeThongQuanLiNhanSu;

import java.util.Scanner;

public class PersonnelManagementSystem {
    public static void menu() {
        System.out.println("1 : Nhap danh sach sinh vien");
        System.out.println("2 : Hien thi thong tin");
        System.out.println("3 : Hien thi sinh vien co diem cao nhat va thap nhat");
        System.out.println("4 : Tim sinh vien theo ma sinh vien");
        System.out.println("5 : Hien thi thong tin sinh vien thep thu tu");
        System.out.println("6 : Hien thi danh sach sinh vien duoc hoc bong va sap sep tu cao xuong thap");
        System.out.println("7 : Thoát");
    }

    public static void main(String[] args) {
        Student list = new Student();
        StudentList list2 = new StudentList();
        Scanner input = new Scanner(System.in);
        int answer;
        while (true) {
            menu();
            answer = input.nextInt();
            switch (answer) {

                case 1:
                    System.out.println("nhap so sinh vien");
                    int numberStudent;
                    numberStudent = input.nextInt();
                list2.InputListStuden(numberStudent);
                    break;
                case 2:
                    list2.ShowList();
                    break;
                case 3:
                    System.out.printf("hoc sinh diem cao nhat %s \n",list2.getMark(list2.getMaxMark()));
                    System.out.printf("hoc sinh diem thap nhat %s \n",list2.getMark(list2.getMinMark()));
                    break;
                case 4:
                    System.out.printf("nhap ten can tim");
                    String NameFind = input.nextLine();
                if(list2.getstuden(NameFind)==null)
                {
                    System.out.println(NameFind);
                }else
                {
                    list2.getstuden(NameFind).ShowInofor();
                }
                    break;

                case 5:
                    list2.sortName();
                    list2.ShowList();
                    break;
                case 6:
                    list2.showStudentCoHocBong();
                    break;
                case 7:
                    System.out.printf("BYTE");
                    System.exit(0);
                    break;
                default:
                    System.out.println("chon tu 1 - > 7");

            }
        }

    }
}
