package kosa.phone;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Company extends PhoneInfo{

    private String dept;
    private String position;
    private Company arr[];
    private int count;

    public Company() {
        arr = new Company[10];
    }


    public Company(String name, String phonNo, String birth, String dept, String position){
        super(name, phonNo, birth);
        this.dept = dept;
        this.position = position;
    }

    /* ����� �Ѱ��� �ִ� �� ���� */
    public void addCompany() {
        System.out.print("�̸�: ");
        String name = DataInput.sc.nextLine();
        System.out.print("��ȭ��ȣ: ");
        String phoneNo = DataInput.sc.nextLine();
        System.out.print("�������: ");
        String birth = DataInput.sc.nextLine();
        System.out.print("�μ�: ");
        String dept = DataInput.sc.nextLine();
        System.out.print("��ġ: ");
        String position = DataInput.sc.nextLine();

        arr[count++] = new Company(name, phoneNo, birth, dept, position);
    }

    public void listPhoneInfo() {
        for (int i = 0; i < count; i++) {
            arr[i].show();
        }
    }

    public String getDept() {
        return dept;
    }
    public void setDept(String dept) {
        this.dept = dept;
    }
    public String getPosition() {
        return position;
    }
    public void setPosition(String position) {
        this.position = position;
    }
}
