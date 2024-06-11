package kosa.phone;

import kosa.stram.Student;

import java.io.*;
import java.util.*;
import java.util.stream.Stream;

//5.29
// ��ȭ ��ȣ ���� �������� ��� (��ü ���)
public class Manager {

    List<PhoneInfo> list = new ArrayList<PhoneInfo>();

    private int count;

    public Manager() {
        //arr = new PhoneInfo[10];
    }

    public void addPhoneInfo() {
        System.out.print("�̸�: ");
        String name = DataInput.sc.nextLine();
        System.out.print("��ȭ��ȣ: ");
        String phoneNo = DataInput.sc.nextLine();
        System.out.print("�������: ");
        String birth = DataInput.sc.nextLine();

        list.add(new PhoneInfo(name, phoneNo, birth));
    }

    public void listPhoneInfo() {
//        Iterator<PhoneInfo> it = list.iterator();
//
//        if (!list.isEmpty()) {
//            System.out.println("=== ����ó ��� ===");
//            while (it.hasNext()) {
//                //1��
//               PhoneInfo info = it.next();
//                System.out.println("�̸�: " + info.getName());
//                System.out.println("��ȭ��ȣ: " + info.getPhonNo());
//                System.out.println("�������: " + info.getBirth());
//                System.out.println();
//                //2��
////                it.next().show();
//            }
//        } else {
//            System.out.println("��ϵ� ����ó�� �����ϴ�.");
//        }


        //Stream<PhoneInfo> stream = list.stream();
        if (!list.isEmpty()) {
            list.forEach(p -> {
                System.out.print(p.getName());
                System.out.print(p.getPhonNo());
                System.out.print(p.getBirth());
            });
        } else {
            System.out.println("��ϵ� ����ó�� �����ϴ�.");
        }
    }

    public void searchPhoneInfo() {
//        // �˻��ϰ����ϴ� �̸� 1���� PhoneInfo() ��ü�� ������ ����Ѵ�.
//        System.out.print("�̸�: ");
//        String name = DataInput.sc.nextLine();
//
//        // �˻� ����� ������ PhoneInfo ��ü
//        PhoneInfo foundInfo = null;
//
//        // Iterator�� ����Ͽ� ��� ��ȸ
//        Iterator<PhoneInfo> it = list.iterator();
//        while (it.hasNext()) {
//            PhoneInfo phoneInfo = it.next();
//            if (name.equals(phoneInfo.getName())) {
//                foundInfo = phoneInfo;
//                break; // �˻� ����
//            }
//        }
//
//        // �˻� ��� ���
//        if (foundInfo != null) {
//            System.out.println("����ó ����:");
//            foundInfo.show();
//        } else {
//            System.out.println("�ش� �̸��� ����ó�� ã�� �� �����ϴ�.");
//        }

        // �Է��� name���� ���� �ϴ� ���� ���
        System.out.print("�̸�: ");
        String name = DataInput.sc.nextLine();

        list.stream().filter(p -> p.getName().startsWith(name)).forEach(p -> p.show());

    }


    public void updatePhoneInfo() {
//        System.out.print("�̸�: ");
//        String name = DataInput.sc.nextLine();
//
//        // �˻� ����� ������ PhoneInfo ��ü
//        PhoneInfo foundInfo = null;
//
//        // Iterator�� ����Ͽ� ��� ��ȸ
//        Iterator<PhoneInfo> it = list.iterator();
//        while (it.hasNext()) {
//            PhoneInfo phoneInfo = it.next();
//            if (name.equals(phoneInfo.getName())) {
//                foundInfo = phoneInfo;
//                break; // �˻� ����
//            }
//        }
//
//        // �˻� ��� ó��
//        if (foundInfo != null) {
//            System.out.print("���ο� ��ȭ��ȣ: ");
//            String newPhoneNo = DataInput.sc.nextLine();
//            foundInfo.setPhonNo(newPhoneNo);
//            System.out.println("����ó ������ ������Ʈ�Ǿ����ϴ�.");
//        } else {
//            System.out.println("�ش� �̸��� ����ó�� ã�� �� �����ϴ�.");
//        }
        System.out.println("�̸� : ");
        String name = DataInput.sc.nextLine();

        System.out.println("���ο� ��ȭ ��ȣ :");
        String newPhoneNo = DataInput.sc.nextLine();

        list.stream().filter(p -> p.getName().equals(name)).forEach(p -> p.setPhonNo(newPhoneNo));
    }


    public void deletePhoneInfo() {
//        System.out.print("�̸�: ");
//        String name = DataInput.sc.nextLine();
//
//        // �˻� ����� ������ PhoneInfo ��ü
//        PhoneInfo foundInfo = null;
//
//        // Iterator�� ����Ͽ� ��� ��ȸ
//        Iterator<PhoneInfo> it = list.iterator();
//        while (it.hasNext()) {
//            PhoneInfo phoneInfo = it.next();
//            if (name.equals(phoneInfo.getName())) {
//                foundInfo = phoneInfo;
//                it.remove(); // ��Ͽ��� ���� ����
//                break; // �˻� ����
//            }
//        }
//
//        // ���� ��� ó��
//        if (foundInfo != null) {
//            System.out.println("����ó ������ �����Ǿ����ϴ�.");
//        } else {
//            System.out.println("�ش� �̸��� ����ó�� ã�� �� �����ϴ�.");
//        }
        System.out.println("�̸� : ");
        String name = DataInput.sc.nextLine();

        list.stream().filter(p -> p.getName().equals(name)).forEach(p -> list.remove(p));  // PhoneInfo�� �´� ��ü�� �����
    }

    public void sortPhoneInfo() {
        Collections.sort(list);
    }

    public void savePhoneInfo() {
        ObjectOutputStream oos = null;

        try {
            oos = new ObjectOutputStream(new FileOutputStream("PhoneInfo.txt"));
            oos.writeObject(list);

            System.out.println("���� �Ϸ�");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                oos.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public void loadPhoneInfo() {
        ObjectInputStream ois = null;
        List<PhoneInfo> loadedList = null;  // ����Ʈ �ʱ�ȭ

        try {
            ois = new ObjectInputStream(new FileInputStream("PhoneInfo.txt"));

            loadedList = (List<PhoneInfo>) ois.readObject();

            // 1�� ��� 
            // System.out.println(loadedList);
            // 2�� ���
            if (loadedList != null) {
                loadedList.stream().forEach(l -> l.show());
            }
            System.out.println();
            System.out.println("�ҷ����� �Ϸ�");

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                ois.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
