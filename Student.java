package HeThongQuanLiNhanSu;

import java.util.Scanner;

public class Student extends Person {
    private String StudentCode;
    private double Mark;
    private String Email;

    public Student(Scanner input, String name, boolean gender, String dateBrith, String address, String studentCode, double mark, String email) {
        super(input, name, gender, dateBrith, address);
        StudentCode = studentCode;
        Mark = mark;
        Email = email;
    }

    public String getStudentCode() {
        return StudentCode;
    }

    public void setStudentCode(String studentCode) {
        StudentCode = studentCode;
    }

    public double getMark() {
        return Mark;
    }

    public void setMark(double mark) {
        Mark = mark;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public Student() {

    }

    private boolean testStudentCode() {
        return StudentCode.length() == 8;
    }

    private boolean testMark() {
        return Mark >= 0 && Mark <= 10;
    }

    private boolean testEmail() {
        return Email.contains("@") && !Email.contains(" ");
    }
    public   boolean testHocbong()
    {
        return this.Mark>=8;
    }

    @Override
    public void InputInfor() {
        super.InputInfo();
        Scanner Input = new Scanner(System.in);
        while (true) {
            System.out.println("nhap ma sinh vien");
            this.StudentCode = input.nextLine();
            if (testStudentCode())
                break;
        }
        while (true) {
            System.out.println("nhap diem trung binh");
            this.Mark = input.nextDouble();
            if (testMark())
                break;
        }

        while (true) {
            System.out.println("nhap email");
            this.Email = input.nextLine();
            if (testEmail())
                break;
        }
    }

    public String tostring() {
        return super.toString() +
                "Ma sinh vien: " + this.StudentCode +
                "\nDiem trung binh: " + this.Mark +
                "\nEmail: " + this.Email+"\n"+ (testHocbong()?"sinh vien co hoc bong":" ");
    }
    public void ShowInofor()
    {
        System.out.println(this.tostring());
    }
    public void hocbong()
    {
        if(this.Mark>=8)
            System.out.println("duoc hoc bong");
        else
            System.out.println("khong duoc hoc bong");
    }

}
