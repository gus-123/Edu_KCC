package kosa.dataa;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortExam02 {
    public static void main(String[] args) {
        List<Person> list = new ArrayList<Person>();

        list.add(new Person("ȫ�浿", 80));
        list.add(new Person("�ڱ浿", 20));
        list.add(new Person("��浿", 50));
        list.add(new Person("���浿", 30));
        list.add(new Person("���浿", 60));


//        Collections.sort(list); => �̰� �⺻���� (Person�� Comparable ���� ����)
        Collections.sort(list, new Comparator<Person>() {  // Comparator�� ���� ���ı��� ����
            @Override
            public int compare(Person o1, Person o2) {
                // �̸��� ���� ����
                // String : ���� ���ڿ�.compareTo(���� ���ڿ�)
                // 0 => ����(AAA) == ����(AAA)
                // -1 => ����(AAA) < ����(AAA)
                // 1 => ����(AAA) > ����(AAA)
                //return o1.getName().compareTo(o2.getName());

                if(o1.getName().compareTo(o2.getName()) > 0) {
                    return 1;
                }
                else if(o1.getName().compareTo(o2.getName()) < 0) {
                    return -1;
                }
                return 0;

            }
        });  // �⺻ ����

        System.out.println(list);
    }
}
