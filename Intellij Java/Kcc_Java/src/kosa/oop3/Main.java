package kosa.oop3;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();

        //Student student = new Student();
        work work = new work(); // ���� �����ϰ� ���� ��ü

        // ��ü �����ϴ� ���
//       Person person = new Person(name, work);

        // �͸� Ŭ���� ����� ���
        Person person = new Person(name, new Role() {  // new Role() ������ �͸� ���� Ŭ������ ����
            @Override
            public void doing() {
                System.out.println("����̺� ����");
            }
        });

        person.doIt();
    }
}
