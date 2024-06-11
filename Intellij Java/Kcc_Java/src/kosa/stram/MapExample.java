package kosa.stram;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class MapExample {
    public static void main(String[] args) {
        // ����Ʈ ���� (MapStudent)
        List<MapStudent> students = Arrays.asList(
                new MapStudent("ȫ�浿", 85),
                new MapStudent("�ڱ浿", 90),
                new MapStudent("��浿", 80)
        );

        //Student�� score ��Ʈ������ ��ȯ
        // ���ϴ� ��ü�� ��Ʈ�� ����.�޾��� ������ Ÿ������ mapToInt().forEach()�� �̿��� ���.
        students.stream().mapToInt(s -> s.getScore()).forEach(System.out::println);
        
        // ����
        int[] arr = {1, 2, 3, 4, 5};
        
        // �迭�� ��Ʈ������ 
        IntStream intStram = Arrays.stream(arr);
        // ����� ���� �迭���� ���� ��ȯ(���� ��Ʈ�� -> �Ǽ� ��Ʈ��)
        intStram.asDoubleStream().forEach(System.out::println);
        //intStram.asDoubleStream().forEach(d->System.out.println(d));
        
        System.out.println();
        
        //(�⺻ Ÿ���� -> ���� ��Ʈ��)
        intStram = Arrays.stream(arr);
        intStram.boxed().forEach(obj -> System.out.println(obj.intValue()));
        
        
    }
}
