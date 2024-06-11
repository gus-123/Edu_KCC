package kosa.api;

import java.util.*;

public class ListMission {
    // List�ڷᱸ ���� Ȱ���Ͽ� Ű����� ���� ���ڿ��� �Է¹޾� ó������.
    //1. ������ �߰� 2. ������ ���� 3. ������ ���(for, Iterator), 4. ����

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        List<String> list = new ArrayList<String>();
//
//        System.out.println("1. ������ �߰� 2. ������ ���� 3. ������ ���, 4. ����");
//
//        while (true) {
//            switch (sc.nextLine()) {
//                case "1":
//                    System.out.print("�Է��� �� �Է� : ");
//                    list.add(sc.nextLine());
//                    break;
//                case "2":
//                    System.out.print("������ (��, �ε���) �Է� : ");
//                    list.remove(sc.nextLine());
//                    break;
//                case "3":
//                    Collections.sort(list);
//                    System.out.println(list);
//                    break;
//                case "4":
//                    System.out.println("����");
//                    return;
//                default:
//                    break;
//            }
//        }

        // ����, ������ �ʿ��Ҷ��� LinkeList�� ����.
        List<String> list = new ArrayList<String>();
        while (true) {
            System.out.println("1. ������ �߰� 2. ������ ���� 3. ������ ���, 4. ����");
            System.out.println("�޴�: ");
            String menu = sc.nextLine();
            int idx = -1;

            switch (menu) {
                case "1":
                    System.out.println("�߰� : ");
                    list.add(sc.nextLine());
                    break;
                case "2":
                    System.out.println("����:");
                    idx = list.indexOf(sc.nextLine());
                    if (idx != -1) {
                        list.remove(idx);
                    } else {
                        System.out.println("�������� �ʽ��ϴ�.");
                    }
                    break;
                case "3":
                    // for ����
//                    for (int i = 0; i < list.size(); i++) {
//                        System.out.println(list.get(i) + ",");
//                    }
                    // iterator
                    Iterator <String> iter = list.iterator();

                    while(iter.hasNext()) {
                        System.out.print(iter.next());
                    }
                    System.out.println();
                    break;
                case "4":
                    System.out.println("���α׷� ����");
                    return;
            }
        }
    }

}
