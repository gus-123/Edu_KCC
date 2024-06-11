package kosa.oop5;

public class Main {

    public static void main(String[] args) {
        //MyType => �͸� ���� Ŭ������ ������ ����.
        MyType my1 = new MyType() {
            @Override
            public void hello() {
                System.out.println("�͸� Ŭ���� ���� �Դϴ�.");
            }
        };

        my1.hello();

        //���ٽ����� ����
        MyType my2 = () -> {
            System.out.println("���ٽ� ���� �Դϴ�.");
        };

        my2.hello();

        //��������2
        MyType my3 = () ->  System.out.println("���ٽ� ����2 �Դϴ�.");  // ��ȣ�� ���ٽ��� �Ķ���� ����� ǥ��

        my3.hello();


        // �Ķ���Ͱ� ������
        YoutType you = (String message) -> {
            System.out.println("�޽���: " + message);
        };

        you.talk("�ȳ�");

        YoutType you2 = message -> System.out.println("�޽���2 : " + message);

        you.talk("Hello World");

        // MyNumber �߻� �޼��� ����(���ٽ�) �ǽ� ����
        MyNumber myNumber = (num1, num2) -> {
            if (num1 > num2) {
                System.out.println("ū �� : " + num1);
                return num1;
            }
            else {
                System.out.println("ū �� : " + num2);
                return num2;
            }
            // (num1 > num2)? x: y;
        };

        myNumber.getMax(1,2);
        //System.out.println("ū�� : " + myNumber.getMax(1,2));

        // ���ٽ����� ������ �����ϱ�
        Runnable  r = () -> {
            for (int i = 1; i < 10; i++) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {}
                System.out.println(i);
            }
        };

        Thread thread = new Thread(r);
        thread.start();

    }
}
