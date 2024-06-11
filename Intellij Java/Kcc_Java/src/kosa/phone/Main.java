package kosa.phone;

import kosa.dataa.Person;

import java.util.Comparator;
import java.util.Scanner;

//5.29
public class Main {  // ���� ��� ����

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        //Scanner sc = new Scanner(System.in);

        Manager m = new Manager();  // Manager class ����
        Company company = new Company(); // Company class ����
        Universe universe = new Universe();  // Universe class ����

        //PhoneInfo[] arr = {
        //        new PhoneInfo(),
        //        new Company(),
        //        new Universe()
        //};

        while (true) {
            System.out.println("1.�߰� 2. ��� 3. �˻� 4. ���� 5. ���� 6. Sort 7. ���� 8. �ҷ����� 9. ����");
            System.out.println("�޴� �Է�: ");
            String menu = DataInput.sc.nextLine();

            switch (menu) {
                case "1":
                    System.out.println("1. �Ϲ�, 2. ȸ��, 3. ��â");
                    switch (DataInput.sc.nextLine()) {
                        case "1":
                            m.addPhoneInfo();
                            break;
                        case "2":
                            company.addCompany();
                            break;
                        case "3":
                            universe.addUniverse();
                            break;
                    }
                    break;
                case "2":
                    System.out.println("1. �Ϲ�, 2. ȸ��, 3. ��â, 4. ��ü ���");
                    switch (DataInput.sc.nextLine()) {
                        case "1":
                            m.listPhoneInfo();
                            break;
                        case "2":
                            company.listPhoneInfo();
                            break;
                        case "3":
                            universe.listPhoneInfo();
                            break;
                        case "4":
                            m.listPhoneInfo();
                            System.out.println("=======================");
                            company.listPhoneInfo();
                            System.out.println("=======================");
                            universe.listPhoneInfo();
                            break;
                    }
                    break;
                case "3":
                    m.searchPhoneInfo();
                    break;
                case "4":
                    m.updatePhoneInfo();
                    break;
                case "5":
                    m.deletePhoneInfo();
                    break;
                case "6":
                    m.sortPhoneInfo();
                    break;
                case "7":
                    m.savePhoneInfo();
                    break;
                case "8":
                    m.loadPhoneInfo();
                    break;
                case "9":
                    System.out.println("���α׷� ����");
                    return;
            }
        }
    }

}
