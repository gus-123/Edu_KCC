package kosa.stram;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamPipeLineExample {

    public static void main(String[] args) {
        //Arrays.asList�� �迭�� ����Ʈ�� ��ȯ �Ͽ� ��ü�� �����Ҷ� ���
        List<Student> list = Arrays.asList(
            new Student("ȫ�浿", 10),
            new Student("�ڱ浿", 20),
            new Student("��浿", 30)
        );

        // 1�� ���
        //Student ��Ʈ��
        Stream<Student> stream = list.stream();

        //score ��Ʈ�� (mapToInt() �޼ҵ�� ��ü�� int ������ �����ؼ� IntStream���� ��ȯ)
        IntStream scoreStream = stream.mapToInt(student -> student.getScore());

        //��� ���
        double avg1 = scoreStream.average().getAsDouble();

        System.out.println("��� ���� :" + avg1);

        // 2�� ���
        double avg2 = list.stream()
                .mapToInt(student -> student.getScore())
                .average()
                .getAsDouble();

        System.out.println("��� ���� : " + avg2);

        list.stream().mapToInt(student -> student.getScore()).forEach(score -> System.out.println(score));  // Score �̴�
        //��Ʈ�� ����.���ϴ� �ʵ� ����.foreachfh �� ���
        list.stream().map(Student::getName).forEach(name-> System.out.println(name));  // name �̴�
        //��Ʈ�� ����.fillter(���ϴ� ��).foreach �� ���
        list.stream().filter(s -> s.getName().startsWith("ȫ")).forEach(s -> System.out.println(s.getName()));  // ���͸� "ȫ"

        // int�� list�� �ִ� ��Ʈ��
        List<Integer> list2 = IntStream.rangeClosed(1,10)
                        .boxed()// Integer�� int�� boxing
                        .collect(Collectors.toList());  // ����Ʈ�� �߰�

        list2.stream().forEach(System.out::println);

        // IntStream.of
        IntStream.of(2,4,6,8,10).boxed().collect(Collectors.toList());

        //���ڿ� �迭 => List, Stream ��ȯ
        String arr3[] = {"bb","cc","aa"};

        // 1�� ���
        List<String> list3 = Arrays.asList(arr3);  // ����Ʈ�� �迭 �ֱ�

        Stream<String> stream3 = list3.stream();  // �ٷ� ��Ʈ��

        stream3.sorted().forEach(System.out::println);

        // 2�� ���
        Stream<String> stream4 = Arrays.stream(arr3);  // �迭�� ��Ʈ���� �ٷ� �ֱ�
        stream4.sorted().forEach(System.out::println);



    }
}
