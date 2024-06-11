package kosa.stram;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamExample {

    public static int sum;  // ���� ������ ���� ��Ʈ�� ����

    public static void main(String[] args) {
        //List �÷��� ����
        List<Product> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            //Product ��ü ����
            Product product = new Product(i, "��ǰ"+i, "���� ȸ�� ", (int) (Math.random() * 1000));

            list.add(product);
        }

        // ��ü ��Ʈ�� ��� ���
        Stream<Product> stream = list.stream();
        stream.forEach(p -> System.out.println(p));


        //�迭�� ���� ��Ʈ�� ���
        // 1. �迭 ����
        String[] arr = { "ȫ�浿", "�ſ��", "��̳�"};
        // 2. Stream ���� (���� ����)
        Stream<String> stream1 = Arrays.stream(arr);
        // 3. ���
        stream1.forEach(item -> System.out.println(item + ","));


        int[]  arr1 = {1,2,2,3,4,5};
        // ���� ����
        IntStream intStream = Arrays.stream(arr1);
        
        intStream.forEach(item -> System.out.print(item + " "));


        // ���� �����κ��� ��Ʈ�� ���
        IntStream intStream1 = IntStream.rangeClosed(1, 10);  // rangeClosed(������, ����)

        intStream1.forEach(a -> sum += a);

        System.out.println(sum);




    }
}
