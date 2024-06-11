package kosa.data;

import java.util.*;

public class ListExam {

    public static void main(String[] args) {
        // 1~45 �ߺ����� �ʴ� �ζǹ�ȣ 6�� �������

        // ���� �Ѱ�
//        int arr[] = new int[6];
//
//        arr[0] = (int)(Math.random() % 9) + 1;
//
//        for (int i = 0; i < arr.length; i++) {
//
//            do {
//                arr[1] = (int)(Math.random() * 9) + 1;
//            } while (arr[1] == arr[0]);
//            do {
//                arr[2] = (int)(Math.random() * 9) + 1;
//            } while (arr[0] == arr[2] || arr[1] == arr[2]);
//            do {
//                arr[3] = (int)(Math.random() * 9) + 1;
//            } while (arr[0] == arr[3] || arr[1] == arr[3] || arr[2] == arr[3]);
//            do {
//                arr[4] = (int)(Math.random() * 9) + 1;
//        } while (arr[0] == arr[4] || arr[1] == arr[4] || arr[2] == arr[4] || arr[3] == arr[4]);
//            do {
//                arr[5] = (int)(Math.random() * 9) + 1;
//            } while (arr[0] == arr[5] || arr[1] == arr[5] || arr[2] == arr[5] || arr[3] == arr[5]);
//
//            System.out.println(arr[i]);
//        }


        Random rand = new Random();

        //1. �迭�� ����

//        int arr[] = new int[6];
//
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = rand.nextInt(45) + 1;
//            for (int j = 0; j < i; j++) {
//                if (arr[i] == arr[j]) {
//                    i = i-1;
//                }
//            }
//        }
//
//        Arrays.sort(arr);  // sort
//        System.out.println(Arrays.toString(arr));

        //2. List ����
        //List<������ Ÿ��> list = new ArrayList<Integer>();
//        List<Integer> list = new ArrayList<Integer>();  // ����Ʈ ����
//
//        while(true) {
//            int n = rand.nextInt(45) + 1;
//            if (list.contains(n)) {  // contains�� n�� �ִ��� Ȯ��(����Ʈ����)
//                continue;
//            } else {
//                list.add(n);  // ����Ʈ�� ������ �߰�
//            }
//            if (list.size() == 6) break;
//        }
//
//        Collections.sort(list);  // list sorting
//        System.out.println(list);

        // 3. Set ���� (TreeSet) ==> �ߺ� ���x
        Set<Integer> set = new TreeSet<Integer>();

        for (int i = 0; set.size() < 6; i++) {
            set.add(rand.nextInt(45) + 1);
        }

        System.out.println(set);



    }
}
