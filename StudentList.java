package HeThongQuanLiNhanSu;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentList {
    ArrayList<Student> student = new ArrayList<>();
    Scanner input = new Scanner(System.in);
    Student st = new Student();

    public void Studen() {

    }

    public void InputListStuden(int nunberStudent) {
        for (int i = 0; i < nunberStudent; i++) {
            Student tmpstudent = new Student();
            tmpstudent.InputInfor();
            student.add(tmpstudent);
        }
    }

    public void ShowList() {
        for (Student x : student) {
            x.ShowInofor();
        }
        System.out.println();
    }

    public String getMark(double Mark) {
        String result = "";
        for (Student x : student) {
            if (x.getMark() == Mark) {
                result += (x.getName());
            }
        }
        return result;
    }

    public double getMaxMark() {
        if (student.size() == 0) {
            return -1;
        } else {
            double maxMark = student.get(0).getMark();
            for (Student x : student) {
                if (x.getMark() > maxMark) {
                    maxMark = x.getMark();
                }
            }
            return maxMark;
        }
    }

    public double getMinMark() {
        if (student.size() == 0) {
            return -1;
        } else {
            double minMark = student.get(0).getMark();
            for (Student x : student) {
                if (x.getMark() < minMark) {
                    minMark = x.getMark();
                }
            }
            return minMark;
        }
    }

    public int getStudentIndex(String code) {
        for (int i = 0; i < student.size(); i++)
            if (student.get(i).getStudentCode().equalsIgnoreCase(code)) {
                return i;
            }
        return -1;
    }

    public Student getstuden(String code) {
        for (Student x : student) {
            if (x.getStudentCode().equalsIgnoreCase(code)) {
                return x;
            }
        }
        return null;
    }

    public void sortName() {
        if (student.size() <= 1)
            return;
        for (int i = 0; i < student.size() - 1; i++) {
            for (int j = i + 1; j < student.size(); j++) {
                Student tmp;
                if (student.get(i).getName().compareTo(student.get(j).getName()) > 0) {
                    tmp = student.get(i);
                    student.set(i, student.get(j));
                    student.set(j, tmp);
                }
            }
        }
    }

    public void showStudentCoHocBong() {
        ArrayList<Student> listhocbong = new ArrayList<>();
        for (Student x : student) {
            if (x.testHocbong()) {
                listhocbong.add(x);
            }
        }
        for (int i = 0; i < listhocbong.size() - 1; i++) {
            for (int j = i + 1; j < listhocbong.size(); j++) {
                Student tmp;
                if (listhocbong.get(i).getMark() < listhocbong.get(j).getMark()) {
                    tmp = listhocbong.get(i);
                    listhocbong.set(i, listhocbong.get(j));
                    listhocbong.set(j, tmp);
                }
            }
        }
        for (Student y : listhocbong) {
            y.ShowInofor();
        }
    }


}
