package kosa.dataa;

import java.util.*;

public class Order {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        LinkedList<String> Food = new LinkedList<>();

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("1. �ֹ���û  2. �ֹ�ó�� 3. �ֹ� ��� 4. ����� �Ѿ� 5. ����");
            String num = sc.nextLine();
            switch (num) {
                case "1":
                    System.out.print("�ֹ� ���� :");
                    String foodName = sc.nextLine();
                    System.out.print("�ֹ� ���� :");
                    int price = sc.nextInt();
                    sc.nextLine();

                    map.put(foodName, price);
                    break;
                case "2":
                    Set set = map.entrySet();
                    Iterator iterator = set.iterator();
                    while (iterator.hasNext()) {
                        Map.Entry<String, Integer> e = (Map.Entry<String, Integer>) iterator.next();
                        Food.offer(e.getKey());
                        Food.offer(e.getValue() + "");
                    }

                    while (!Food.isEmpty()) {
                        System.out.print(Food.poll());
                    }
                    break;
                case "3":

                    break;
                case "4":
                    Collection<Integer> values = map.values();
                    Iterator<Integer> iter = values.iterator();

                    int total = 0;
                    while (iter.hasNext()) {
                        total += iter.next();
                    }

                    System.out.println("����� �Ѿ�:" + total);
                    break;
                case "5":
                    System.out.println("����");
                    return;
            }
        }
    }

}
