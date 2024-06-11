package kosa.stram;

import java.net.StandardSocketOptions;
import java.util.ArrayList;
import java.util.List;

public class FilteringExample {
    public static void main(String[] args) {
        // list ����
        List<String> list = new ArrayList<String>();
        // ����Ʈ �߰�
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("D");

        // �ߺ� ��� ����
        list.stream().distinct().forEach(System.out::print);
        System.out.println();

        //������ �����ϴ� ��Ҹ� ���͸�
        list.stream().filter(x -> x.startsWith("D")).forEach(System.out::print);
        System.out.println();

        // �ߺ� ��Ҹ� �����ϰ� ������ �����ϴ� ��Ҹ� ���͸�
        list.stream().distinct().filter(a -> a.startsWith("D")).forEach(System.out::print);
        System.out.println();
    }
}
