package kosa.Restaurant;

public class Main {

    public static void main(String arg[]) {

        // ��ü ����
        Order o = new Order();

        while(true) {
            System.out.println("[ ���ϴ� ����� ��ȣ�� �Է����ּ��� ! ]");
            System.out.println("1.�߰� 2. ��ü��� 3. �˻� 4. ����, 5. ���� 6. �Ѹ��� �հ� 7. ����");
            System.out.print("��ȣ :");
            String num = DataInput.sc.nextLine();

            switch (num) {
                case "1" :
                    System.out.println("1. ����Ÿ����, 2. �⺻");
                    String check = DataInput.sc.nextLine();
                    o.addOrder(check);
                    break;
                case "2" :
                    o.listOrder();
                    break;
                case "3" :
                    o.searchOrder();
                    break;
                case "4" :
                    o.updateOrder();
                    break;
                case "5" :
                    o.deleteOrder();
                    break;
                case "6" :
                    o.sales();
                    break;
                case "7" :
                    System.out.println("���α׷� ����");
                    return;
                default :
                    System.out.println("�߸� �Է��ϼ̽��ϴ�. �ٽ� �Է����ּ���!");
                    break;
            }
        }

    }

}
