package kosa.dataa;

import java.util.Comparator;
import java.util.Random;
import java.util.TreeSet;

public class SortExam {

    public static void main(String[] args) {
        //정렬
        // 기본 정렬 : Comparable => compareTo() 오버라이딩
        // 정렬기준 변경 : Comparator => compare() 오버라이딩
        Random rand = new Random();
        TreeSet<Integer> set = new TreeSet<>(new Comparator<Integer>() {
            @Override
            public int compare (Integer o1, Integer o2){
                //내림차순 정렬
                if (o1 < o2) {
                    return 1;  // 자리를 바꿈
                } else if (o1 > o2) {
                    return -1; // 자리 안 바꿈
                }
                return 0;
            }
        });

        for (int i = 0; set.size() < 6; i++) {
            set.add(rand.nextInt(45) + 1);
        }
        System.out.println(set);


    }
}
