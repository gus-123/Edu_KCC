package kosa.api;

public class PersonMain {

    public static void main(String[] args) {
        Person p1 = new Person("ȫ�浿", 30);  // new�� ���ο� �޸𸮰����� �Ҵ� �޴´�.
        Person p2 = new Person("ȫ�浿", 20);

        if (p1.equals(p2)) {  // �ּҰ��� �� (p1 == p2)  // object�� p1.equals(p2)���� �ּҰ� �� (�ֳ� Person�� equals�� ���⶧����)

            System.out.println("����");
        }
        else {
            System.out.println("�ٸ���");
        }

        System.out.println(p1);  // ���⿡ ��ü�� ������ �ڵ����� p1.toString()�� ȣ������.
    }
}
