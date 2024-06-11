package kosa.dataa;

import java.util.*;

public class MapMission {
    public static void main(String[] args) {
        // �̸�, ������ �ѽ����� Map �ڷᱸ���� �����Ͻÿ�. (��: ���ڹ�:90, ���ڹ�:60)
        // 1. ���� �����ڸ� ���
        // 2. ����, ���, �ְ�����, �������� ��� (Collections => max(), min())

        // ���� ģ �ڵ�
//        Map<String, Integer> student = new HashMap<>();
//
//        student.put("���ڹ�", 90);
//        student.put("���ڹ�", 60);
//
//        // 1. ���� ������ ���
//        System.out.println("���� ������:");
//        for (String name : student.keySet()) {
//            System.out.println(name);
//        }
//
//        // 2. ����, ���, �ְ�����, �������� ��� �� ���
//        int total = 0;
//        int max = Integer.MIN_VALUE;
//        int min = Integer.MAX_VALUE;
//
//        for (Integer score : student.values()) {
//            total += score;
//
//            if (score > max) {
//                max = score;
//            }
//
//            if (score < min) {
//                min = score;
//            }
//        }
//
//        int avg = total / student.size();
//
//        System.out.println("\n����: " + total);
//        System.out.println("���: " + avg);
//        System.out.println("�ְ�����: " + max);
//        System.out.println("��������: " + min);

        Map<String, Integer> map = new HashMap<>();

        map.put("���ڹ�", 50);
        map.put("���ڹ�", 60);

        //map => key ����
        Set<String> set = map.keySet();
        System.out.println("������ ��� : " + set);

        //map => value ����
        Collection<Integer> values = map.values();
        Iterator<Integer> iter = values.iterator();
        
        int total = 0;
        while (iter.hasNext()) {
            total += iter.next();
        }
        
        System.out.println("����:" + total);
        System.out.println("���:" + map.size());
        System.out.println("�ְ����� : " + Collections.max(values));
        System.out.println("�������� : " + Collections.min(values));

    }
}
