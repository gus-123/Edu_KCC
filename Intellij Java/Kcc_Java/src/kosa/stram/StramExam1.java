package kosa.stram;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;
//����ó��
public class StramExam1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();

        list.add("ȫ�浿");
        list.add("��浿");
        list.add("�ڱ浿");

        Stream<String> parallelStream = list.parallelStream();

        parallelStream.forEach(name -> {
            System.out.println(name + ":" + Thread.currentThread().getName());
        });

    }
}
