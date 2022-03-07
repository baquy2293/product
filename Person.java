package HeThongQuanLiNhanSu;

import java.util.Scanner;

public abstract class Person {
    Scanner input = new Scanner(System.in);
    private String Name;
    private boolean Gender;
    private String DateBrith;
    private String address;

    public Person() {
    }

    public Person(Scanner input, String name, boolean gender, String dateBrith, String address) {
        this.input = input;
        Name = name;
        Gender = gender;
        DateBrith = dateBrith;
        this.address = address;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public boolean isGender() {
        return Gender;
    }

    public void setGender(boolean gender) {
        Gender = gender;
    }

    public String getDateBrith() {
        return DateBrith;
    }

    public void setDateBrith(String dateBrith) {
        DateBrith = dateBrith;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void InputInfo() {
        System.out.println("nhap ho ten");
        this.Name = input.nextLine();
        while (true) {
            System.out.println("nhap gioi tinh nam & nu");
            String tmpGender = input.nextLine();
            if (tmpGender.equalsIgnoreCase("nam")) {
                this.setGender(true);
                break;
            } else if (tmpGender.equalsIgnoreCase("nu")) {
                this.setGender(false);
                break;
            }
            System.out.println("nhap lai gioi tinh");
        }
        System.out.println("nhap ngay sinh");
        this.DateBrith = input.nextLine();
        System.out.println("nhap dia chi");
        this.address = input.nextLine();
    }
public String getgender()
{
    return Gender?"nam":"nu";
}
    @Override
    public String toString() {
        return "Person{" +
                ", Name='" + Name + '\'' +
                ", Gender=" + getgender() +
                ", DateBrith=" + DateBrith +
                ", address='" + address + '\'' +
                '}';
    }
    public  void ShowInfo()
    {
        System.out.println(this.toString());
    }

    public abstract void InputInfor();
}
